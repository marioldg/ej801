package ej801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public Scanner t = new Scanner(System.in);
	
	public Main()
	{
		Ej03();
	}
	
	public void Ej03()
	{
		System.out.println("Dame ruta original");
		String rutaOriginal = t.nextLine();
		System.out.println("Dame fichero original");
		String ficheroOriginal = t.nextLine();
		System.out.println("Dame ruta copia");
		String rutaCopia = t.nextLine();
		System.out.println("Dame fichero copia");
		String ficheroCopia= t.nextLine();
		
		File archivoEntrada = new File(rutaOriginal +"\\"+ficheroOriginal);
		File archivoSalida = new File(rutaCopia +"\\"+ficheroCopia);
		
		int total = 0;
	
		try {
			//Creamos el escritor
			FileWriter fw = new FileWriter(archivoSalida);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(archivoEntrada);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
            try {
            	
				while ((linea = br.readLine()) != null) {
					  for (int i = 0; i < linea.length(); i++) {
				            //char c = linea.charAt(i); // Obtiene el carácter en la posición i	
						  	//DocuPrueba801.txt
						  //C:\\users\\USER\\Desktop
						  	System.out.println(linea.charAt(i));
				            bw.write(linea.charAt(i));
				            
				        }
					  	bw.newLine();
					  	total = total + linea.length();
					  	
				}
				bw.close();
				//Sol total
				System.out.println("Total " + total);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void Ej02()
	{
		
		System.out.println("Dame ruta");
		String ruta = t.nextLine();
		System.out.println("Nombre");
		String nombre = t.nextLine();
		File archivo = new File(ruta +"\\"+nombre);		
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
            try {
				while ((linea = br.readLine()) != null) {
					  for (int i = 0; i < linea.length(); i++) {
				            char c = linea.charAt(i); // Obtiene el carácter en la posición i				            
				            if (c == ' ') {
				                System.out.println("-"); // Reemplaza el espacio con guion
				            } else {
				                System.out.println(Character.toUpperCase(c)); // Imprime la letra en mayúscula
				            }
				        }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void Ej01()
	{
		int numAlumnos = 0, edadMin = 0, edadMax = 0,numMenorEdad = 0,edad,sumaEdades = 0;
		double media = 0, Desv;
		ArrayList  alumnosEdades = new ArrayList();
		File archivo = new File("entrada801.dat");
		try {
			FileInputStream fileInput = new FileInputStream(archivo);
			//FileInputStream fileInput = new FileInputStream(new File("entrada801.dat"));
			DataInputStream dataInput = new DataInputStream(fileInput);
			
			try 
			{
				do
				{					
					edad =dataInput.readInt();
    				alumnosEdades.add((edad));
    				System.out.println(edad);
                	sumaEdades = sumaEdades + edad;
                	
                	if(edad<18)
                	{
                		numMenorEdad++;
                	}
                	if(edad < edadMin)
                	{
                		edadMin = edad;
                	}
                	if(edad > edadMax)
                	{
                		edadMax = edad;
                	}
                	
                	numAlumnos++;
				}while(true);  
            } catch (IOException e) {
                System.out.println("Fin del archivo.");
            }
			
			int aux = 0;
			for (int i = 0; i < alumnosEdades.size(); i++) {
	            //System.out.println("Elemento en el índice " + i + ": " + alumnosEdades.get(i));
	            aux=(int) (aux+Math.pow(((int)alumnosEdades.get(i))-media,2));
	        }
			double mediaAuxilias = aux/numAlumnos;
			//Soluciones    
			System.out.println("La media es " + sumaEdades/numAlumnos);
			System.out.println("Edad min " + edadMin );
			System.out.println("Edad max " + edadMax);
			System.out.println("La desviación " + Math.sqrt(mediaAuxilias));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}

package ej801;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public Main()
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

package Leer_docuemnto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public Main()
	{
		/*
		String a = "Pablo";
		char b = a.charAt(0);
		System.out.print(b);
		
		*/
		String DNI = "71903962M";
		String DNI2 ="71903962";
		
		Scanner t = new Scanner(System.in);
		boolean esreal=false;
		do {			
			System.out.println("Mete");
			String DNI3 = t.nextLine();
			esreal=cuentaletras(DNI3, 9);			
		}while(esreal==false);
		System.out.println(cuentaletras(DNI, 9));
		System.out.println(cuentaletras(DNI2, 9));
				
	//	leer_documento();
	//	escribir_documento("Hola \n Soy \n Pablo");
	}
	
	public boolean cuentaletras (String DNI, int longitud)
	{
		if(DNI.length()==longitud)
		{
			return true;
		}
		else
			return false;
	}
	
	public void escribir_documento(String contenido)
	{
		// Usamos try-with-resources para asegurar que se cierren los recursos automáticamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\Leer_docuemnto\\DocuPrueba2.txt"))) {
            writer.write(contenido);
            writer.newLine(); // Para escribir una nueva línea
            writer.write("Otra línea de texto.");
            System.out.println("Contenido escrito en el archivo con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
	}
	public void leer_documento()
	{
		File archivo = new File ("C:\\Users\\USER\\Desktop\\DAM1\\DAMmario\\PROGRAMACION\\DAM2\\src\\Leer_docuemnto\\prueba.txt");
		try {
			FileReader fr = new FileReader (archivo);
			 BufferedReader br = new BufferedReader(fr);
	         // Lectura del fichero
	         String linea;
	         try {
	        	 
	        	 do {
	        		 linea=br.readLine();
	        		 System.out.println(linea);
	        	 }while((linea=br.readLine())!=null);
	        	 /*while((linea=br.readLine())!=null)
					    System.out.println(linea); 
	        	  */
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Va mal");
		}
	}
	public static void main(String[] args) {
		Main main = new Main();

	}

}

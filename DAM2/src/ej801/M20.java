package ej801;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class M20 {

	public static void main(String[] args) {
		//File archivo = new File("C:\\Users\\USER\\Downloads\\entrada801.dat");
		File archivo = new File("entrada801.dat");
		int edades=0;
		try {
			FileInputStream fil = new FileInputStream(archivo);
			DataInputStream dat = new DataInputStream(fil);
			try {
				do {
					edades = edades+dat.readInt();
				}while(true);
					
				
			}
			catch(IOException e) {
				System.out.println("FIN DE FICHERO");
			}
			System.out.println("EDADES " + edades);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


package Ejercicio_Inicial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public Main()
	{
		Cliente cliente = new Cliente();
		cliente.nuevocliente();
		//cliente.escribirEnArchivo(cliente);
		
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}

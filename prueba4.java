import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class prueba4 {

	public static void main(String[] args) {
		
//archivo para pruebas de la tabla PERSONA
		File fic1 = new File("semillapersona.txt");
		Scanner s = null;
		try {
			// Leemos el contenido del archivo
			System.out.println("Archivo leido");
			s = new Scanner(fic1);
			// Leemos linea a linea el archivo
			while (s.hasNextLine()) 
			{
				String linea = s.nextLine(); 	// Guardamos la linea en un String
			
			//split
			String totalText=linea;
			totalText.split(",");
			String[] textElements = totalText.split(",");
			for (int i = 0; i<textElements.length;i++)			
			{
 
			String anElement = textElements[0];
			
			String matriz [][] = new String [10][5]; //crear array multidimensional de 2 filas x 2 columnas
		//	String matriz [] = new String [2]; //crear array multidimensional de 2 filas x 2 columnas
			matriz [0][0] = anElement; matriz [0][1] = anElement;			
			matriz [1][0] = anElement; matriz [1][1] = anElement;
			System.out.println("valor posicion 1:" + matriz[0][0]);
			System.out.println("valor posicion 2:" + matriz[0][1]);
			System.out.println("valor posicion 3:" + matriz[1][0]);			
			System.out.println("valor posicion 4:" + matriz[1][1]);

			} //fin del for split

			
			
			
			} //fin del while y la siguiente llave es el fin del try

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el archivo tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
				s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}

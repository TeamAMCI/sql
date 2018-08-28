package proyecto240817;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import javax.print.attribute.standard.DateTimeAtProcessing;

public class Semilla {
	public static void main(String[] args) throws IOException {	
		ArrayList<Person> people = new ArrayList<>();
		FileWriter fichero = null;
		PrintWriter pw = null;
		int Contador;
		Contador = 1;
		String suuid ;


		System.out.println("Inicia proceso " );
		DateTimeFormatter dtfInicia = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime nowInicia = LocalDateTime.now();
		System.out.println(dtfInicia.format(nowInicia)); //2016/11/16 12:08:43
		
		
		try {
			fichero = new FileWriter("/home/admin/Mariana/Programas/txt/archivopersonasA.csv", true);
			pw = new PrintWriter(fichero);
			for(int repeat=1;repeat<=80;repeat++) {
				try {
					//fichero = new FileWriter("/home/administrator/Documents/prueba1/archivoprueba.txt", true);
					//fichero = new FileWriter("/home/administrator/Documents/prueba1/ar4.txt", true);
					//fichero = new FileWriter("/home/admin/Mariana/Programas/txt/archivopersonas.csv", true);
					//pw = new PrintWriter(fichero);
					
					
	                //pw.print("Inicia Proceso, y Contador vale = " + Contador); 	                pw.append('\n');
	                
					
					
					System.out.println("Ciclo en for 80, repeat vale =  " + repeat );
					for(int i=1;i<=100000;i++) {
						File f = new File("/home/admin/Mariana/Programas/txt/people.txt");
						Scanner cs = new Scanner(f);
						people.clear();
						while(cs.hasNextLine()) {
							//UUID sessionID = UUID.randomUUID();
							suuid = UUID.randomUUID().toString();
							String line = cs.nextLine();
							String[] details = line.split(",");
							String inicioCadenaInsert = suuid + ",";
							String nombre = details[0] + " " + Contador + "," ;
							String apellido = details[1] + " " + Contador + " " ;
							String curp = details[2] + "," ;
				            String fecNacimiento = details[3] + "," ;
				            String genero = details[4] + "" ;
							String finCadenaInsert = "\n";
							Person p = new Person( inicioCadenaInsert, nombre, apellido, curp, 
						            fecNacimiento, genero, finCadenaInsert);
							people.add(p);
							Contador++;
							
							//pw.print("Termina while y Contador vale = " + Contador); 			                pw.append('\n');
			                
							//}//fin del for ids
						}//fin del while
						pw.println(people);
						
						//System.out.println(people + " " + repeat);
						//System.out.println(Contador);
						//pw.print("Termina for y Contador vale = " + Contador); 		                pw.append('\n');
		                cs.close();
					}//fin de for 10000 
					}//fin de try
					catch (Exception e) {
						e.printStackTrace();
					} //fin del catch
					finally {
						try {
							if(null!= fichero)
								fichero.close();
							}//fin del try
						catch(Exception e2) {
							e2.printStackTrace();
						}//fin del catch e2
					}//fin del finally
				}//fin del try segundo
			}//fin del primer for 5 veces
		finally {
			
			System.out.format("%,8d%n", Contador);    // -->  " 461,012"
			System.out.println("Finaliza proceso " );
			DateTimeFormatter dtfFin = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime nowFin = LocalDateTime.now();
			System.out.println(dtfFin.format(nowFin)); //2016/11/16 12:08:43
			System.out.println("Fin");
		}
			//}//fin del try primero
	
//End of class and public void
}	
}
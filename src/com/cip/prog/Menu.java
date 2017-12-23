package com.cip.prog;

import java.util.Scanner;
import com.cip.prog.Conversiones;

public class Menu {
	
	private static Conversiones Conversiones = new Conversiones();
	private static Scanner keyboard;
	private static double Result = 0,GradosC = 0,GradosF = 0;

	public static void CallMenu() {
		
		keyboard = new Scanner(System.in);
		String Opcion = "";
		System.out.println("¿Desea realizar otra conversion? S/N"); 
		Opcion = keyboard.nextLine();
		
		if(Opcion.trim().toUpperCase().equals("S")) {
			ShowMenu();
		}
		else if(Opcion.trim().toUpperCase().equals("N")) {
			System.out.println("Adios y gracias");
			System.exit(0);
		}
		else {
			System.out.println("ESA OPCION NO ES VALIDA INTENTELO DE NUEVO"); 
			CallMenu();
		}
	}
	
	public static void ShowMenu() {
		  
        System.out.print("------CONVERTIR TEMPERATURAS------- \n"
        				+ "1.Convierta grados Centígrados a grados Fahrenheit \n"
        				+ "2.Convierta grados Fahrenheit a grados Centígrados \n"
        				+ "3.Salir del programa \n"
        				+ "Opcion: ");   
        MenuLogic();
	}
	
	public static void MenuLogic(){
		
		keyboard = new Scanner(System.in);
		int Opcion = 0;
		
		try {
			Opcion = keyboard.nextInt();
		}
		catch (Exception e) {
			System.out.println("ESA OPCION NO ES VALIDA INTENTELO DE NUEVO");
			ShowMenu();
        }
		
		switch (Opcion) {
		case 1:
			System.out.println("------F = C * (9/5) + 32-------");
			System.out.print("Introduzca C: ");
			
			try {
				GradosC = keyboard.nextDouble();
			}
			catch (Exception e) {
				System.out.println("ERROR AL INTRODUCIR LOS DATOS");
				CallMenu();
	        }
			
			Result = Conversiones.CentígradosToFahrenheit(GradosC);
			System.out.println("F = " + Result);
			CallMenu();
			break;
		case 2:
			System.out.println("------C = 5/9 * (F - 32)-------");
			System.out.print("Introduzca F: ");
			
			try {
				GradosF = keyboard.nextDouble();
			}
			catch (Exception e) {
				System.out.println("ERROR AL INTRODUCIR LOS DATOS");
				CallMenu();
	        }
			Result = Conversiones.FahrenheitToCentígrados(GradosF);
			System.out.println("C = " + Result);
			CallMenu();
			break;
		case 3:
			System.out.println("Adios y gracias");
			System.exit(0);
			break;
		default:
			System.out.println("ESA OPCION NO ES VALIDA INTENTELO DE NUEVO");
			ShowMenu();
			break;
		}
	}

}

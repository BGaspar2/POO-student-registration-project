package Examen;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		JOptionPane.showMessageDialog(null, "Bienvenido al programa de matricula de estudiantes :)");

		// Pedir datos de estudiantes y guardarlos en ArrayList
		for (int i = 1; i <= 4; i++) {
			
			JOptionPane.showMessageDialog(null, "Ingrese datos del estudiante " + i + ":");
			String matricula =JOptionPane.showInputDialog("Matrícula: ");;
			String apellidos = JOptionPane.showInputDialog("Apellidos: ");
			String nombres =  JOptionPane.showInputDialog("Nombres: ");
			int edad = Integer.parseInt( JOptionPane.showInputDialog("Edad: "));
			char sexo =  JOptionPane.showInputDialog("Sexo de la siguiente manera: (H/M): ").charAt(0);
			String carrera = JOptionPane.showInputDialog("Carrera: ");
			int nivel = Integer.parseInt(JOptionPane.showInputDialog("Nivel (del 1 al 8): "));
			int creditos = Integer.parseInt(JOptionPane.showInputDialog("Número de créditos a recibir: "));

			Estudiante estudiante = new Estudiante(matricula, apellidos, nombres, edad, sexo, carrera, nivel, creditos);
			estudiantes.add(estudiante);
			JOptionPane.showMessageDialog(null, "Ingresado con exito");


		}

		// Comprobar total a pagar, horario, si es mayor de edad y sexo
		for (Estudiante estudiante : estudiantes) {
			System.out.println("------------------------");
			System.out.println(estudiante);
			System.out.println("Total a pagar: $" + estudiante.calcularValorpagar());
			if (estudiante.comprobarHorario() == 0) {
				System.out.println("Su horario será de 07:00 a 12:00 de lunes a viernes");
			} else {
				System.out.println("Su horario será de 16:00 a 21:00 de lunes a viernes");
			}
			System.out.println("Es mayor de edad: " + estudiante.esMayorDeEdad());

			System.out.println("------------------------");

			System.out.println();

		}
	}
}

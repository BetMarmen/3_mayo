package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int a,b;
		metodos op = new metodos();
		
		a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer dato"));
		System.out.println("Ingrese el segundo dato");
		b=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo  dato"));
		System.out.println("el resultado es: "+ op.resta(a, b));
		System.out.println("El resultado de la suma es: "+op.suma(a, b));
	}

}

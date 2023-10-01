package application;

import java.util.Scanner;

import entities.calculos;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char teste = 's';
		
		calculos cal = new calculos();
		
	while (teste != 'n') {	
		
		System.out.println("----------Calculadora----------");	
		System.out.println("Soma-1");
		System.out.println("Subtração-2");
		System.out.println("Multiplicação-3");
		System.out.println("Divisão-4");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		int escolha = sc.nextInt();
		System.out.println();
		
		System.out.print("Valor1: ");double valor1 = sc.nextDouble();
		System.out.print("Valor2: ");double valor2 = sc.nextDouble();
		
		cal = new calculos(valor1,valor2,escolha);
		
		System.out.println();
		System.out.printf("Resultado = %.2f%n",cal.soma());
		System.out.println();
		
		System.out.print("Degeja Fazer outro calculo? (s/n): ");
		teste = sc.next().charAt(0);
	}
		sc.close();
	}

}

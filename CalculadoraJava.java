package com.java;

import java.util.Scanner;

public class HelloJava {
	static float soma(float x,float y) {
		float resultado=0;
		resultado=x+y;
		return resultado;
	}
	static float subtracao(float x,float y) {
		float resultado=0;
		resultado=x-y;
		return resultado;
	}
	static float divisao(float x,float y) {
		float resultado=0;
		resultado=x/y;
		return resultado;
	}
	static float multiplicacao(float x,float y) {
		float resultado=0;
		resultado=x*y;
		return resultado;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int operacao=1;
		float x, y,resultado=0;
		System.out.println("Calculadora Java");
        while(operacao!=0) {
		System.out.println("\nEscolha a operacao que deseja fazer:\n1-Soma\n2-subtracao\n3-divisao\n4-multiplicacao\n0-Parar programa");
		operacao= sc.nextInt();
		switch(operacao) {
			case 1:
				System.out.println("\nDeclare o primeiro numero:");
				x= sc.nextFloat();
				System.out.println("Declare o segundo numero:");
				y= sc.nextFloat();
				resultado= soma(x,y);
				System.out.println("\nResultado da Adição :" + resultado);
				break;
			case 2:
				System.out.println("\nDeclare o primeiro numero:");
				x= sc.nextFloat();
				System.out.println("Declare o segundo numero:");
				y= sc.nextFloat();
				resultado= subtracao(x,y);
				System.out.println("\nResultado da Subtracao: " + resultado);
				break;
			case 3:
				System.out.println("\nDeclare o numero que sera dividido:");
				x= sc.nextFloat();
				System.out.println("Declare o divisor:");
				y= sc.nextFloat();
				resultado= divisao(x,y);
				System.out.println("\nResultado da Divisao: " + resultado);
				break;
			case 4:
				System.out.println("\nDeclare o primeiro numero:");
				x= sc.nextFloat();
				System.out.println("Declare o segundo numero:");
				y= sc.nextFloat();
				resultado= multiplicacao(x,y);
				System.out.println("\nResultado da Multiplicacao: " + resultado);
				break;
			case 0:
				break;
			default:
				break;
		}
        }

	}
}

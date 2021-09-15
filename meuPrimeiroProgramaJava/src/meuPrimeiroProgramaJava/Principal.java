/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Ricardo dos Anjos
 * Data: 15/09/2021
 */
public class Principal { //Classe que contém o método principal.
	public static void main(String[] args) { //Este é o método principal.
		
		System.out.println ("Olá amigo!\nQual é o seu nome?"); //Uso do println.
		
		//Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf.
		System.out.printf("Olá %s!\n",nome);
				

	}

}

/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Ricardo dos Anjos
 * Data: 15/09/2021
 */
public class Principal { //Classe que cont�m o m�todo principal.
	public static void main(String[] args) { //Este � o m�todo principal.
		
		System.out.println ("Ol� amigo!\nQual � o seu nome?"); //Uso do println.
		
		//Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf.
		System.out.printf("Ol� %s!\n",nome);
				

	}

}

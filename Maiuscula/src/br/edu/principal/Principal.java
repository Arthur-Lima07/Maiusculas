package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String novaFrase = null;	
		String frase = null;
		
		System.out.println("Digite uma frase");
		frase = sc.next();	
		novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);

	}

}

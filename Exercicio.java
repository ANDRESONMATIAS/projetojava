package exercicio;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;
		        
		        System.out.println("Digite uma sequência de números (digite 0 para encerrar):");
		        
		        while (true) {
		            int numero = scanner.nextInt();
		            
		            if (numero == 0) {
		                break;
		            }
		            
		            soma += numero;
		        }
		        
		        System.out.println("A soma dos números digitados é: " + soma);
		        
		        scanner.close();
		    }
		


	}


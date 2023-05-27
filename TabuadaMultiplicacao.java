package exercicio;


	import java.util.Scanner;

	public class TabuadaMultiplicacao {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um número para ver a tabuada de multiplicação:");
	        int numero = scanner.nextInt();
	        
	        System.out.println("Tabuada de multiplicação do número " + numero + ":");
	        
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	        
	        scanner.close();
	    }
	}




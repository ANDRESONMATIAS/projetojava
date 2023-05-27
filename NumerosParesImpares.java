package exercicio;

	import java.util.Scanner;

	public class NumerosParesImpares {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numerosPares = 0;
	        int numerosImpares = 0;
	        
	        System.out.println("Digite 10 números:");
	        
	        for (int i = 0; i < 10; i++) {
	            int numero = scanner.nextInt();
	            
	            if (numero % 2 == 0) {
	                numerosPares++;
	            } else {
	                numerosImpares++;
	            }
	        }
	        
	        System.out.println("Quantidade de números pares: " + numerosPares);
	        System.out.println("Quantidade de números ímpares: " + numerosImpares);
	        
	        scanner.close();
	    }
	}

	
	
	
	
	

	
	
	
	
	

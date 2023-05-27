package exercicio;


import java.util.Scanner;

public class AnaliseIdadePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 10;
        int somaIdades = 0;
        int contadorMaiorIdade = 0;
        int contadorMenorIdade = 0;
        int idadeMaisVelha = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            
            somaIdades += idade;
            
            if (idade >= 18) {
                contadorMaiorIdade++;
            } else {
                contadorMenorIdade++;
            }
            
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }
        }
        
        double mediaIdades = somaIdades / (double) totalPessoas;
        
        System.out.println("Média de idade das 10 pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas maiores de idade: " + contadorMaiorIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + contadorMenorIdade);
        System.out.println("Idade da pessoa mais velha: " + idadeMaisVelha);
        
        scanner.close();
    }
}

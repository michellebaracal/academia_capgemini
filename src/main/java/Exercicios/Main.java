package Exercicios;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			
			System.out.print("##--Menu--##\n\n");
			System.out.print("|-----------------|\n");
			System.out.print("| Opção 1 - Ex01  |\n");
			System.out.print("| Opção 2 - Ex02  |\n");
			System.out.print("| Opção 3 - Ex03  |\n");
			System.out.print("| Opção 4 - Sair  |\n");
			System.out.print("|-----------------|\n");
			System.out.print("Digite uma opção: ");
			Scanner menu = new Scanner (System.in);
			opcao = menu.nextInt();
			
			switch (opcao) {
			case 1:
				int numero;
				System.out.println("Digite o número de degraus:");
				try {
					numero = new Scanner(System.in).nextInt();
					Ex01 ex1 = new Ex01();
					ex1.criarEscada(numero);
					
				} catch (Exception e) {
					System.out.println("Digite um número Inteiro!");
				}
				break;
			
			case 2:
				String senha;
				Ex02 ex2 = new Ex02();
				System.out.println("Digite sua senha:"); 
				senha = new Scanner(System.in).next();
				ex2.validarSenha(senha);
				break;
			
			case 3:
				String palavra; 
				Ex03 ex3 = new Ex03();
				System.out.println("Digite uma palavra:"); 
				palavra = new Scanner(System.in).next();
				ex3.encontrarAnagramas(palavra);
				break;
				
			case 4:
				System.out.print("\nAté logo!");
				menu.close();	
				break;
			default:
				System.out.print("\nOpção Inválida!");
				break;
			}
		
		}while(opcao != 4);

	}

}

package Exercicios;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			
			System.out.print("##--Menu--##\n\n");
			System.out.print("|-----------------|\n");
			System.out.print("| Op��o 1 - Ex01  |\n");
			System.out.print("| Op��o 2 - Ex02  |\n");
			System.out.print("| Op��o 3 - Ex03  |\n");
			System.out.print("| Op��o 4 - Sair  |\n");
			System.out.print("|-----------------|\n");
			System.out.print("Digite uma op��o: ");
			Scanner menu = new Scanner (System.in);
			opcao = menu.nextInt();
			
			switch (opcao) {
			case 1:
				int numero;
				System.out.println("Digite o n�mero de degraus:");
				try {
					numero = new Scanner(System.in).nextInt();
					Ex01 ex1 = new Ex01();
					ex1.criarEscada(numero);
					
				} catch (Exception e) {
					System.out.println("Digite um n�mero Inteiro!");
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
				System.out.print("\nAt� logo!");
				menu.close();	
				break;
			default:
				System.out.print("\nOp��o Inv�lida!");
				break;
			}
		
		}while(opcao != 4);

	}

}

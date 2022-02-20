package Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
	
	private int numeroAnagramas = 0;
	private int anagrama = 0;
		
	public int encontrarAnagramas(String palavra) {
			
			//Cria padroes para verificar se o que é digitado é uma palavra válida e tira os espaços em branco
			String word = palavra.trim();
			Pattern patternNumero = Pattern.compile("[0-9]");
			Matcher matcherNumero = patternNumero.matcher(word);
			Pattern patternEspecial = Pattern.compile("[!@#$%^&*()-+?]");
			Matcher matcherEspecial = patternEspecial.matcher(word);
			
			if(!matcherNumero.find() && !matcherEspecial.find()) {

					//if que verifica se não é apenas uma letra
					if (word.length() <= 1) {
						System.out.println(word);
				
					} else {
						for (int i = 0; i < (word.length()-1); i++) {
							char [] letra = word.toCharArray();					
							for(int j = (word.length()-1); j > i; j--) {
							
								if(letra[i] == word.charAt(j)) {
									numeroAnagramas++;
								}
							}
		
							anagrama = anagrama ^ word.charAt(i) ^ word.charAt(i+1);
													
							if(anagrama == 0) {
								numeroAnagramas++ ;
							}
						}
					 }
					System.out.println("Número de pares de substrings que formam anagramas são: " + numeroAnagramas);
					return numeroAnagramas;
			}else {
				System.out.println("Digite apenas letras!");
				return numeroAnagramas;
			}
		}

}

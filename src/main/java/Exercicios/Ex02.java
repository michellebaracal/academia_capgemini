package Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

	  public int validarSenha(String senha){
       
	      	String caracteresSenha = senha.trim();
	        
	      	if(caracteresSenha.length() != 0) {
	     
	      		//Cria��o dos padr�es de crit�rio para a senha
	        	Pattern patternNumero = Pattern.compile("[0-9]");
	        	Pattern patternMinusculo = Pattern.compile("[a-z]");
	        	Pattern patternMaiusculo = Pattern.compile("[A-Z]");
	        	Pattern patternEspecial = Pattern.compile("[!@#$%^&*()-+]");
	        	Matcher matcherNumero = patternNumero.matcher(caracteresSenha);
	        	Matcher matcherMinusculo = patternMinusculo.matcher(caracteresSenha);
	        	Matcher matcherMaiusculo = patternMaiusculo.matcher(caracteresSenha);
	        	Matcher matcherEspecial = patternEspecial.matcher(caracteresSenha);
	        	     
	        	//Verifica se os padr�es s�o atendidos
	        	if(!matcherNumero.find()) {
	        		System.out.println("Coloque pelo menos um n�mero!");
	        	}
	        
	        	if(!matcherMinusculo.find()) {
	        		System.out.println("Coloque pelo menos uma letra Min�scula!");
	        	}
	        
	        	if(!matcherMaiusculo.find()) {
	        		System.out.println("Coloque pelo menos uma letra Mai�scula!");
	        	}
	        
	        	if(!matcherEspecial.find()) {
	        		System.out.println("Coloque pelo menos um  caractere especial! Ex: !@#$%^&*()-+");
	        	}
	        
	        	int tamanhoSenha = (6-caracteresSenha.length());
	        
	        	//Verififca se o tamanho m�nimo da senha � atendido.Tamanho m�nimo = 6.
	        	if(caracteresSenha.length() >= 6) {
	        	
	        		System.out.println("Sua senha � Forte!");
	        		return tamanhoSenha;
	        	
	        	}else {
	        		System.out.println("Faltam: " + tamanhoSenha + " caracteres para sua senha ser forte!");
	        		return tamanhoSenha;
	        	 }	  
	      	
	      	}else {
	      		System.out.println("Digite um caractere!");
	      		return 0;
	      	}
	  	}
}

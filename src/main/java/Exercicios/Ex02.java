package Exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

	  public int validarSenha(String senha){
       
	      	String caracteresSenha = senha.trim();
	        
	      	if(caracteresSenha.length() != 0) {
	     
	      		//Criação dos padrões de critério para a senha
	        	Pattern patternNumero = Pattern.compile("[0-9]");
	        	Pattern patternMinusculo = Pattern.compile("[a-z]");
	        	Pattern patternMaiusculo = Pattern.compile("[A-Z]");
	        	Pattern patternEspecial = Pattern.compile("[!@#$%^&*()-+]");
	        	Matcher matcherNumero = patternNumero.matcher(caracteresSenha);
	        	Matcher matcherMinusculo = patternMinusculo.matcher(caracteresSenha);
	        	Matcher matcherMaiusculo = patternMaiusculo.matcher(caracteresSenha);
	        	Matcher matcherEspecial = patternEspecial.matcher(caracteresSenha);
	        	     
	        	//Verifica se os padrões são atendidos
	        	if(!matcherNumero.find()) {
	        		System.out.println("Coloque pelo menos um número!");
	        	}
	        
	        	if(!matcherMinusculo.find()) {
	        		System.out.println("Coloque pelo menos uma letra Minúscula!");
	        	}
	        
	        	if(!matcherMaiusculo.find()) {
	        		System.out.println("Coloque pelo menos uma letra Maiúscula!");
	        	}
	        
	        	if(!matcherEspecial.find()) {
	        		System.out.println("Coloque pelo menos um  caractere especial! Ex: !@#$%^&*()-+");
	        	}
	        
	        	int tamanhoSenha = (6-caracteresSenha.length());
	        
	        	//Verififca se o tamanho mínimo da senha é atendido.Tamanho mínimo = 6.
	        	if(caracteresSenha.length() >= 6) {
	        	
	        		System.out.println("Sua senha é Forte!");
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

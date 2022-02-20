package Exercicios;


public class Ex01 {
	
	 private  String estrela = "*";
	 private  String espaco = " ";
	 private  String[] degraus;


	 public  boolean criarEscada(int n) {

		if(n > 0){
			 degraus = new String[n];
			 for (int i = n-1;i >= 0; i--){
	              degraus[i] = espaco.repeat(n-(i+1)) + estrela.repeat(i+1);
	         }
	   
	         for(int i = 0;i < degraus.length;i++){
	        	   System.out.println(degraus[i]);
	         }
	         return true;
		 }else {
			 System.out.println("Coloque um número maior que zero!");
			 return false;
		 }

	 }

}

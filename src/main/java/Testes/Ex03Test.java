package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicios.Ex03;

class Ex03Test {

	@Test
	void testEncontrarAnagramas() {
		Ex03 ex3 = new Ex03();
		String palavra = "ifailuhkqq";
		
		int retornoFeito = ex3.encontrarAnagramas(palavra);
		int retornoEsperado = 3;
		
		assertEquals(retornoEsperado, retornoFeito);
		
		
	}

}

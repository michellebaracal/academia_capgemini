package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicios.Ex02;


class Ex02Test {
	@Test
	void test() {
		Ex02 ex2 = new Ex02();
		String senha = "Ya3";

		int retornoEsperado = 3;
		int retornoFeito = ex2.validarSenha(senha);
		
		assertEquals(retornoEsperado, retornoFeito);

	}

}

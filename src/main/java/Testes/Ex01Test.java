package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicios.Ex01;


class Ex01Test {

	@Test
	void testCriarEscada() {
		Ex01 ex1 = new Ex01();
		int numero = 6;

		boolean retornoFeito = ex1.criarEscada(numero);
		boolean retornoEsperado = true;

		assertEquals(retornoEsperado, retornoFeito);
	}

}

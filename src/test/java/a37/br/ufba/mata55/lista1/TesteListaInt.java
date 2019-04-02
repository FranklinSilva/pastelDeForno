package a37.br.ufba.mata55.lista1;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteListaInt {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTamanhoInicial() {
		ListaInt lista = new ListaInt(10);
		assertEquals(0, lista.obtemTamanho());
	}
	
	@Test
	public void testElementoDeListaVazia() {
		ListaInt lista = new ListaInt(10);
		assertEquals(-1, lista.obtemElemento(0));
	}
	
	@Test
	public void testElementoDeIndiceNegativo() {
		ListaInt lista = new ListaInt(10);
		lista.insereElemento(1);
		lista.insereElemento(2);
		lista.insereElemento(3);
		assertEquals(-1, lista.obtemElemento(-2));
	}

	@Test
	public void testTamanhoAposInserir() {
		ListaInt lista = new ListaInt(10);
		lista.insereElemento(2);
		lista.insereElemento(4);
		lista.insereElemento(6);
		assertEquals(3, lista.obtemTamanho());
	}

	@Test
	public void testInsere() {
		ListaInt lista = new ListaInt(10);
		assertTrue(lista.insereElemento(2));
	}
	
	@Test
	public void testAlemDaCapacidade() {
		ListaInt lista = new ListaInt(2);
		lista.insereElemento(2);
		lista.insereElemento(4);
		assertFalse(lista.insereElemento(6));
		assertEquals(2, lista.obtemTamanho());
	}

	
	@Test
	public void testElementoDeIndiceAlemDoTamanho() {
		ListaInt lista = new ListaInt(10);
		lista.insereElemento(1);
		lista.insereElemento(2);
		lista.insereElemento(3);
		assertEquals(-1, lista.obtemElemento(3));
	}
	
	@Test
	public void testUltimoElemento() {
		ListaInt lista = new ListaInt(10);
		lista.insereElemento(1);
		lista.insereElemento(-1);
		lista.insereElemento(0);
		assertEquals(0, lista.obtemElemento(2));
	}

}

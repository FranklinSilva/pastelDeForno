package a22.br.ufba.mata55.lista1;


import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteRetangulo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValorInicial() {
		Retangulo ret = new Retangulo();
		assertEquals(1.0, ret.largura, 0.001);
		assertEquals(1.0, ret.altura, 0.001);
	}
	
	@Test
	public void testArea() {
		Retangulo ret = new Retangulo();
		ret.largura = 5;
		ret.altura = 2;
		assertEquals(10, ret.calculaArea(), 0.001);
	}

	@Test
	public void testPerimetro() {
		Retangulo ret = new Retangulo();
		ret.largura = 5;
		ret.altura = 2;
		assertEquals(14, ret.calculaPerimetro(), 0.001);
	}

	@Test
	public void testExisteConstrutorSemParametro() {
		Class<Retangulo> classe = Retangulo.class;
		Constructor<?>[] ctors = classe.getDeclaredConstructors();
		for (Constructor<?> ctor : ctors) {
			if (ctor.getParameterCount() == 0) {
				assertTrue(true);
				return;
			}
		}
		fail();
	}
	
	@Test
	public void testExisteConstrutorComDoisParametros() {
		Class<Retangulo> classe = Retangulo.class;
		Constructor<?>[] ctors = classe.getDeclaredConstructors();
		for (Constructor<?> ctor : ctors) {
			if (ctor.getParameterCount() == 2) {
				Parameter[] params = ctor.getParameters();
				int qtd = 0;
				for (Parameter param : params) {
					if (param.getType().getName().equals("double")) {
						qtd++;
					}
				}
				assertEquals(2, qtd);
				return;
			}
		}
		fail();
	}
	
	@Test
	public void testConstrutorComDoisParametrosFunciona() {
		Retangulo ret = new Retangulo(3.0, 6.0);
		assertEquals(3.0, ret.largura, 0.001);
		assertEquals(6.0, ret.altura, 0.001);
	}
}

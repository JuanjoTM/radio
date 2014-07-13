package clases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RadioAGTest {
	RadioAG pruebaRadio = new RadioAG();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCambiarEstado() {
		boolean estado = false;
		pruebaRadio.cambiarEstado(estado);
		boolean resultado = pruebaRadio.getEstado();
		assertTrue(resultado == false);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testCambiarFrecuencia() {
		boolean frecuencia = true;
		pruebaRadio.cambiarFrecuencia(frecuencia);
		boolean resultado = pruebaRadio.getFrecuencia();
		assertTrue(resultado == false);
		//fail("Not yet implemented");
	}

	@Test
	public void testGuardarEstacion() {
		double estacion = 0.35;
		int boton = 1;
		pruebaRadio.guardarEstacion(boton, estacion);
		double resultado = pruebaRadio.sintonizar(boton);
		assertTrue(resultado==1.35);
		//fail("Not yet implemented");
	}

	@Test
	public void testSintonizar() {
		int posicion = 0;
		double resultado = pruebaRadio.sintonizar(posicion);
		assertTrue(resultado==0);
		//fail("Not yet implemented");
	}

}

package clases;
/*
***************************************************************************
	UNIVERSIDAD DEL VALLE DE GUATEMALA
	ALGORITMOS Y ESTRUCTURA DE DATOS
	AUTORES:
	Juan José Tzun Monterroso		CARNET: 13017
	Juan Tomás García Orellana		CARNET: 13019
	Sergio Méndez Arévalo			CARNET: 13452
	FECHA: 07/07/2014						ARCHIVO: InterfazRadio.java

	BREVE DESCRIPCION: Modela las funciones que implementa la clase Radio
****************************************************************************
*/

public interface Radio {
	final int INICIO_AM = 530;
	final int FINAL_AM = 1610;
	final double INICIO_FM = 87.9;
	final int PASO_AM = 10;
	final double PASO_FM = 0.2;
	
	//MODELACION DE METODOS
	public void cambiarEstado(boolean estado);
	public void cambiarFrecuencia(boolean frecuencia);
	public void subirEstacion(double estacion);
	public void bajarEstacion(double estacion);
	public void guardarEstacion(int boton, double estacion);
	public double sintonizar(int posicion);
	public boolean getEstado();
	public boolean getFrecuencia();
	public double getEstacion();
}

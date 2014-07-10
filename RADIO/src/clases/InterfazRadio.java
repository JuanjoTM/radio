package clases;
/*
***************************************************************************
	UNIVERSIDAD DEL VALLE DE GUATEMALA
	ALGORITMOS Y ESTRUCTURA DE DATOS
	AUTOR: Juan José Tzun Monterroso		CARNET: 13017
	FECHA: 07/07/2014						ARCHIVO: InterfazRadio.java

	BREVE DESCRIPCION: Modela las funciones que implementa la clase Radio
****************************************************************************
*/

public interface InterfazRadio {
	//MODELACION DE METODOS
	public void cambiar_Estado();
	public void cambiar_Frecuencia(boolean frecuencia);
	public void subir_Estacion(double estacion);
	public void bajar_Estacion(double estacion);
	public void guardar_Estacion(int boton, double estacion);
	public double sincronizar(int posicion, boolean frecuencia);
	public boolean getEstado();
	public boolean getFrecuencia();
	public double getEstacion();
}

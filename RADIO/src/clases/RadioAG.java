package clases;
/*
***************************************************************************
	UNIVERSIDAD DEL VALLE DE GUATEMALA
	ALGORITMOS Y ESTRUCTURA DE DATOS
	AUTORES:
	Juan José Tzun Monterroso		CARNET: 13017
	Juan Tomás García Orellana		CARNET: 13019
	Sergio Méndez Arévalo			CARNET: 13452
	FECHA: 07/07/2014						ARCHIVO: Radio.java

	BREVE DESCRIPCION: Modela una radio con todo y sus características y
	funciones, además de implementar una interfaz
****************************************************************************
*/
public class RadioAG implements Radio{
	//ATRIBUTOS
		private boolean estado;
		private boolean frecuencia;
		private double estacion;
		private double[] listaFavoritos;
		
	//METODOS
	//CONSTRUCTORES
	//Constructor con parametros
	public RadioAG(boolean estado, boolean frecuencia, double estacion){
		this.estado = estado;
		this.frecuencia = frecuencia;
		this.estacion = estacion;
		listaFavoritos = new double[12];
	}
	
	//Constructor sin parametros
	public RadioAG(){
		estado = false;
		frecuencia = false;
		estacion = 0.0;
		listaFavoritos = new double[12];
	}
	
	//SETS Y GETS
	/**
	 * @return the estado
	 */
	public boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * @return the frecuencia
	 */
	public boolean getFrecuencia() {
		return frecuencia;
	}
	/**
	 * @param frecuencia the frecuencia to set
	 */
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}
	/**
	 * @return the estacion
	 */
	public double getEstacion() {
		return estacion;
	}
	/**
	 * @param estacion the estacion to set
	 */
	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}
	/**
	 * @return the listaFavoritos
	 */
	public double[] getListaFavoritos() {
		return listaFavoritos;
	}
	/**
	 * @param listaFavoritos the listaFavoritos to set
	 */
	public void setListaFavoritos(double[] listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}
	
	//METODOS IMPLEMENTADOS DE LA INTERFAZ
	//Cambia el estado de la radio de apagado a encendido y viceversa
	public void cambiarEstado(boolean estado){
		this.estado = estado;
	}
	
	//Cambia la frecuencia de la radio entre AM y FM
	public void cambiarFrecuencia(boolean frecuencia){
		this.frecuencia = frecuencia;
	}
	
	//Cambia la estacion según la frecuencia en que se encuentre, hacia adelante
	public void subirEstacion(double estacion){
		if(this.frecuencia){
			if(this.estacion<107.9){
				this.estacion = estacion + 0.2;
			}
			else{
				this.estacion = 87.9;
			}
		}
		else{
			if(this.estacion<1610){
				this.estacion = estacion + 10;
			}
			else{
				this.estacion = 530.0;
			}
		}
	}
	
	//Cambia la estacion según la frecuencia en que se encuentre, hacia atras
	public void bajarEstacion(double estacion){
		if(this.frecuencia){
			if(this.estacion>87.9){
				this.estacion = estacion - 0.2;
			}
			else{
				this.estacion = 107.9;
			}
		}
		else{
			if(this.estacion>530.0){
				this.estacion = estacion - 10;
			}
			else{
				this.estacion = 1610.0;
			}
		}
	}
	
	//Guarda las estaciones favoritas en la lista
	public void guardarEstacion(int boton, double estacion){
		this.listaFavoritos[boton] = estacion;
	}
	
	//Sintoniza la estacion favorita segun el boton presionado
	public double sintonizar(int posicion){
		estacion = listaFavoritos[posicion];
		return this.listaFavoritos[posicion];
	}
	
	//
}

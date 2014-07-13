package clases;
/*
***************************************************************************
	UNIVERSIDAD DEL VALLE DE GUATEMALA
	AUTORES:
	Juan José Tzun Monterroso		CARNET: 13017
	Juan Tomás García Orellana		CARNET: 13019
	Sergio Méndez Arévalo			CARNET: 13452
	FECHA: 02/10/2013						ARCHIVO: InterfazGrafica.java

	BREVE DESCRIPCION: Establece un medio de interacción entre el usuario y 
	el programa
****************************************************************************
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica {
	//ATRIBUTOS
	private JPanel panel;
	private JFrame ventana;
	private Radio radio;
	private JRadioButton rdbAM;
	private JRadioButton rdbFM;
	private JLabel lblEstacion;
	private JButton btnEstado;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btnSubir;
	private JButton btnBajar;
	private boolean[] frecuencias;
	
	//METODOS
	public InterfazGrafica(){
		frecuencias = new boolean[12];
		
		//Inicializando el panel y la ventana
		panel = new JPanel();
		ventana = new JFrame();
		
		//Creando el inventario
		radio = new RadioAG();
		
		//Caracteristicas de la ventana
		ventana.setTitle("RADIO LA SONORA DINAMITA");
		ventana.setPreferredSize(new Dimension(400,400));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Inicializando los radiobutton de las frecuencias de radio
		rdbAM = new JRadioButton("AM");
		rdbFM = new JRadioButton("FM");
		
		//Creando el grupo de botones
		ButtonGroup frecuencias = new ButtonGroup();
		frecuencias.add(rdbAM);
		frecuencias.add(rdbFM);
		
		//Creando las etiquetas
		JLabel lblRelleno1 = new JLabel(".");
		JLabel lblRelleno2 = new JLabel(".");
		JLabel lblRelleno3 = new JLabel(".");
		JLabel lblRelleno4 = new JLabel(".");
		JLabel lblRelleno5 = new JLabel(".");
		JLabel lblRelleno6 = new JLabel(".");
		lblEstacion = new JLabel("----");
		
		//Iniciando los botones de la lista de favoritos
		btnEstado = new JButton("Apagado");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn10 = new JButton("10");
		btn11 = new JButton("11");
		btn12 = new JButton("12");
		btnSubir = new JButton("+");
		btnBajar = new JButton("-");
		
		//Agregando los buttonlistener a los botones
		btnEstado.addActionListener(new ButtonListener());
		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());
		btn4.addActionListener(new ButtonListener());
		btn5.addActionListener(new ButtonListener());
		btn6.addActionListener(new ButtonListener());
		btn7.addActionListener(new ButtonListener());
		btn8.addActionListener(new ButtonListener());
		btn9.addActionListener(new ButtonListener());
		btn10.addActionListener(new ButtonListener());
		btn11.addActionListener(new ButtonListener());
		btn12.addActionListener(new ButtonListener());
		btnSubir.addActionListener(new ButtonListener());
		btnBajar.addActionListener(new ButtonListener());
		
		//Agregando los buttonlistener a los radiobutton
		rdbAM.addActionListener(new ButtonListener());
		rdbFM.addActionListener(new ButtonListener());
		
		//Caracteristicas del panel
		panel.setBackground(Color.white);
		panel.setLayout(new GridLayout(6,4));
		
		//Agregando los componentes graficos al panel
		panel.add(lblEstacion);
		panel.add(btnBajar);
		panel.add(btnSubir);
		panel.add(lblRelleno1);
		panel.add(lblRelleno2);
		panel.add(lblRelleno3);
		panel.add(lblRelleno4);
		panel.add(lblRelleno5);
		panel.add(rdbAM);
		panel.add(rdbFM);
		panel.add(btnEstado);
		panel.add(lblRelleno6);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		panel.add(btn11);
		panel.add(btn12);
		
		//Deshabilitando componentes graficos
		rdbAM.setEnabled(false);
		rdbFM.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btnSubir.setEnabled(false);
		btnBajar.setEnabled(false);
		
	}
	
	//Permite hacer visible la ventana
	public void mostrarVentana(){
		ventana.setContentPane(panel);
		ventana.setVisible(true);
		ventana.pack();
	}
	
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Object fuente = event.getSource(); //Se lee la entrada cuando se presiona algun boton o radiobutton
			
			if(fuente == btnEstado){
				if(radio.getEstado()){
					radio.cambiarEstado(false);
					btnEstado.setText("Encendido");
					rdbAM.setEnabled(true);
					rdbFM.setEnabled(true);
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);
					btn10.setEnabled(true);
					btn11.setEnabled(true);
					btn12.setEnabled(true);
					rdbAM.setSelected(true);
					btnSubir.setEnabled(true);
					btnBajar.setEnabled(true);
					lblEstacion.setText("530.0");
				}
				else{
					radio.cambiarEstado(true);
					btnEstado.setText("Apagado");
					rdbAM.setEnabled(false);
					rdbFM.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					btn10.setEnabled(false);
					btn11.setEnabled(false);
					btn12.setEnabled(false);
					btnSubir.setEnabled(false);
					btnBajar.setEnabled(false);
					lblEstacion.setText("----");
				}
				
			}
			if(fuente == rdbAM){
				radio.cambiarFrecuencia(false);
				((RadioAG)radio).setEstacion(530.0);
				lblEstacion.setText("530.0");
			}
			if(fuente == rdbFM){
				radio.cambiarFrecuencia(true);
				((RadioAG)radio).setEstacion(87.9);
				lblEstacion.setText("87.9");
			}
			if(fuente == btnSubir){
				radio.subirEstacion(Double.parseDouble(lblEstacion.getText()));
				lblEstacion.setText(""+radio.getEstacion());
			}
			if(fuente == btnBajar){
				radio.bajarEstacion(Double.parseDouble(lblEstacion.getText()));
				lblEstacion.setText(""+radio.getEstacion());
			}
			if(fuente == btn1){
				if(btn1.getBackground()==Color.blue){
					if (frecuencias[1]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(1);
					((RadioAG)radio).setFrecuencia(frecuencias[1]);
					btn1.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn1.getBackground()==Color.green){
					btn1.setBackground(Color.blue);
				}
				else{
					frecuencias[1] = radio.getFrecuencia();
					radio.guardarEstacion(1, Double.parseDouble(lblEstacion.getText()));
					btn1.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn2){
				if(btn2.getBackground()==Color.blue){
					if (frecuencias[2]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(2);
					((RadioAG)radio).setFrecuencia(frecuencias[2]);
					btn2.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn2.getBackground()==Color.green){
					btn2.setBackground(Color.blue);
				}
				else{
					frecuencias[2] = radio.getFrecuencia();
					radio.guardarEstacion(2, Double.parseDouble(lblEstacion.getText()));
					btn2.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn3){
				if(btn3.getBackground()==Color.blue){
					if (frecuencias[3]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(3);
					((RadioAG)radio).setFrecuencia(frecuencias[3]);
					btn3.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn3.getBackground()==Color.green){
					btn3.setBackground(Color.blue);
				}
				else{
					frecuencias[3] = radio.getFrecuencia();
					radio.guardarEstacion(3, Double.parseDouble(lblEstacion.getText()));
					btn3.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn4){
				if(btn4.getBackground()==Color.blue){
					if (frecuencias[4]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(4);
					((RadioAG)radio).setFrecuencia(frecuencias[4]);
					btn4.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn4.getBackground()==Color.green){
					btn4.setBackground(Color.blue);
				}
				else{
					frecuencias[4] = radio.getFrecuencia();
					radio.guardarEstacion(4, Double.parseDouble(lblEstacion.getText()));
					btn4.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn5){
				if(btn5.getBackground()==Color.blue){
					if (frecuencias[5]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(5);
					((RadioAG)radio).setFrecuencia(frecuencias[5]);
					btn5.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn5.getBackground()==Color.green){
					btn5.setBackground(Color.blue);
				}
				else{
					frecuencias[5] = radio.getFrecuencia();
					radio.guardarEstacion(5, Double.parseDouble(lblEstacion.getText()));
					btn5.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn6){
				if(btn6.getBackground()==Color.blue){
					if (frecuencias[6]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(6);
					((RadioAG)radio).setFrecuencia(frecuencias[6]);
					btn6.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn6.getBackground()==Color.green){
					btn6.setBackground(Color.blue);
				}
				else{
					frecuencias[6] = radio.getFrecuencia();
					radio.guardarEstacion(6, Double.parseDouble(lblEstacion.getText()));
					btn6.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn7){
				if(btn7.getBackground()==Color.blue){
					if (frecuencias[7]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(7);
					((RadioAG)radio).setFrecuencia(frecuencias[7]);
					btn7.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn7.getBackground()==Color.green){
					btn7.setBackground(Color.blue);
				}
				else{
					frecuencias[7] = radio.getFrecuencia();
					radio.guardarEstacion(7, Double.parseDouble(lblEstacion.getText()));
					btn7.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn8){
				if(btn8.getBackground()==Color.blue){
					if (frecuencias[8]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(8);
					((RadioAG)radio).setFrecuencia(frecuencias[8]);
					btn8.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn8.getBackground()==Color.green){
					btn8.setBackground(Color.blue);
				}
				else{
					frecuencias[8] = radio.getFrecuencia();
					radio.guardarEstacion(8, Double.parseDouble(lblEstacion.getText()));
					btn8.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn9){
				if(btn9.getBackground()==Color.blue){
					if (frecuencias[9]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(9);
					((RadioAG)radio).setFrecuencia(frecuencias[9]);
					btn9.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn9.getBackground()==Color.green){
					btn9.setBackground(Color.blue);
				}
				else{
					frecuencias[9] = radio.getFrecuencia();
					radio.guardarEstacion(9, Double.parseDouble(lblEstacion.getText()));
					btn9.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn10){
				if(btn10.getBackground()==Color.blue){
					if (frecuencias[10]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(10);
					((RadioAG)radio).setFrecuencia(frecuencias[10]);
					btn10.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn10.getBackground()==Color.green){
					btn10.setBackground(Color.blue);
				}
				else{
					frecuencias[10] = radio.getFrecuencia();
					radio.guardarEstacion(10, Double.parseDouble(lblEstacion.getText()));
					btn10.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn11){
				if(btn11.getBackground()==Color.blue){
					if (frecuencias[11]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(11);
					((RadioAG)radio).setFrecuencia(frecuencias[11]);
					btn11.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn11.getBackground()==Color.green){
					btn11.setBackground(Color.blue);
				}
				else{
					frecuencias[11] = radio.getFrecuencia();
					radio.guardarEstacion(11, Double.parseDouble(lblEstacion.getText()));
					btn11.setBackground(Color.blue);
				}
				
			}
			if(fuente == btn12){
				if(btn12.getBackground()==Color.blue){
					if (frecuencias[12]){
						rdbFM.setSelected(true);
					}
					else{
						rdbAM.setSelected(true);
					}
					radio.sintonizar(12);
					((RadioAG)radio).setFrecuencia(frecuencias[12]);
					btn12.setBackground(Color.green);
					lblEstacion.setText(""+radio.getEstacion());
				}
				else if(btn12.getBackground()==Color.green){
					btn12.setBackground(Color.blue);
				}
				else{
					frecuencias[12] = radio.getFrecuencia();
					radio.guardarEstacion(12, Double.parseDouble(lblEstacion.getText()));
					btn12.setBackground(Color.blue);
				}
				
			}
		}
	}
}

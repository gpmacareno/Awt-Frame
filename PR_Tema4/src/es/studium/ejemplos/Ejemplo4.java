package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejemplo4
{
	// Atributos de la clase.
	Frame ventana = new Frame("Absoluto");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	

	Ejemplo4()
	{
		ventana.setBackground(Color.orange);
		ventana.setSize(500,300);
		ventana.setLayout(null);
		lblNombre.setBounds(30,50,50,20); //50 + 20 // los dos ultimos numeros ancho y alto, los dos primeros posicion x e y.
		ventana.add(lblNombre);
		txtNombre.setBounds(80,50,100,20);
		ventana.add(txtNombre);
		btnAceptar.setBounds(180,50,50,20); //80 +100 = 180
		ventana.add(btnAceptar);
		//ventana.add(txtNombre);
		//ventana.add(btnAceptar);
		
		ventana.setVisible(true);		
	}

	public static void main(String[] args)
	{

		new Ejemplo4();

	}

}

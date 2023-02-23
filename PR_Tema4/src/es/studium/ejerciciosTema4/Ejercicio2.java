package es.studium.ejerciciosTema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2
{

	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblNombre = new Label("Celsius");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("Fahrenheit");
	TextField txtNombre2 = new TextField(20);
	Button btnCalcular = new Button("Celsius a Fahrenheit");
	Button btnCalcular2 = new Button("Fahrenheit a Celsius");

	Ejercicio2()
	{
		ventana.setBackground(Color.pink);
		ventana.setSize(400, 100);
		ventana.setLayout(new GridLayout(3, 2));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnCalcular);
		ventana.add(btnCalcular2);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{

		new Ejercicio2();

	}

}

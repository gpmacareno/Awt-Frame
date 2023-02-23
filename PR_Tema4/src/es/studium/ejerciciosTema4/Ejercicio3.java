package es.studium.ejerciciosTema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3
{

	Frame ventana = new Frame("Calcular el IVA");
	Label lblNombre = new Label("Introduzca la cantidad");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("Introduzca el porcentaje");
	TextField txtNombre2 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblNombre3 = new Label("Resultado");
	TextField txtNombre3 = new TextField(20);

	Ejercicio3()
	{
		ventana.setBackground(Color.pink);
		ventana.setSize(1000, 70);
		ventana.setLayout(new GridLayout(1, 7));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnCalcular);
		ventana.add(lblNombre3);
		txtNombre3.setEnabled(false);
		ventana.add(txtNombre3);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{

		new Ejercicio3();

	}

}

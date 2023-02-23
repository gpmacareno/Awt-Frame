package es.studium.ejerciciosTema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{
	Frame ventana = new Frame("Horas y minutos");
	Label lblNombre = new Label("HH");
	TextField txtNombre = new TextField(20);
	Label lblNombre2 = new Label("MM");
	TextField txtNombre2 = new TextField(20);
	Label lblNombre3 = new Label("HH");
	TextField txtNombre3 = new TextField(20);
	Label lblNombre4 = new Label("MM");
	TextField txtNombre4 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtNombre5 = new TextField(20);

	Ejercicio1()
	{

		ventana.setBackground(Color.pink);
		ventana.setSize(400, 100);
		ventana.setLayout(new GridLayout(3, 4));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(lblNombre3);
		ventana.add(txtNombre3);
		ventana.add(lblNombre4);
		ventana.add(txtNombre4);
		ventana.add(btnCalcular);
		txtNombre5.setEditable(false); // Set editable para que salga en gris y el usuario no pueda interactuar.
										// TEnemos el set enable
		ventana.add(txtNombre5);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Ejercicio1();

	}

}

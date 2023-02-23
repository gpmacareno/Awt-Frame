package es.studium.ejemplos;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejemplo10
{

	Frame ventana = new Frame("Choice");
	Choice choLista = new Choice();

	public Ejemplo10()
	{
		ventana.setLayout(new FlowLayout());
		// Añadir elementos a la lista
		choLista.add("Seleccione un color:");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		// Añadir la lista
		ventana.add(choLista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100, 120);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo10();
	}
}

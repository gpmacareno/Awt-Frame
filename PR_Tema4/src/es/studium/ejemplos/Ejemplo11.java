package es.studium.ejemplos;

import java.awt.*;


public class Ejemplo11
{
	Frame ventana = new Frame("AwtList");
	// Creaci�n de una lista con 4 elementos visibles y que no
	// permite multiselecci�n
	List lista = new List(4, false);

	public Ejemplo11()
	{
		ventana.setLayout(new FlowLayout());
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		lista.add("Verde");
		lista.add("Amarillo");
		lista.add("Naranja");
		ventana.add(lista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(150, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo11();
	}
}
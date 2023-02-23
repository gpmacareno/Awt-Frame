package es.studium.ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class Ejemplo2
{

	Color colores[] =
	{ Color.pink, Color.green, Color.magenta, Color.orange, Color.yellow };
	Random aleatorio = new Random();

	Ejemplo2()
	{
		Frame ventana = new Frame("Titulo");
		ventana.setBackground(colores[aleatorio.nextInt(colores.length)]);
		ventana.setSize(300, 300);
		ventana.setLocation(aleatorio.nextInt(3000), aleatorio.nextInt(1000));

		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{

		final int CANTIDAD = 10;

		for (int i = 0; i < CANTIDAD; i++)
		{

			new Ejemplo2();

		}

	}

}

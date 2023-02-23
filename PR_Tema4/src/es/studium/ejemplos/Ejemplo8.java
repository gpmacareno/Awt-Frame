package es.studium.ejemplos;

import java.awt.*;

public class Ejemplo8
{
	Frame ventana = new Frame("Opción múltiple");

	Checkbox chkUno = new Checkbox("Opción Uno");
	Checkbox chkDos = new Checkbox("Opción Dos");
	Checkbox chkTres = new Checkbox("Opción Tres");

	public Ejemplo8()
	{
		ventana.setLayout(new FlowLayout());
		ventana.add(chkUno);
		ventana.add(chkDos);
		ventana.add(chkTres);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo8();
	}
}

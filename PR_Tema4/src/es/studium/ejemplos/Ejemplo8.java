package es.studium.ejemplos;

import java.awt.*;

public class Ejemplo8
{
	Frame ventana = new Frame("Opci�n m�ltiple");

	Checkbox chkUno = new Checkbox("Opci�n Uno");
	Checkbox chkDos = new Checkbox("Opci�n Dos");
	Checkbox chkTres = new Checkbox("Opci�n Tres");

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

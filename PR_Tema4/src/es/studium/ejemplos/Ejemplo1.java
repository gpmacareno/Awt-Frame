package es.studium.ejemplos;

import java.awt.Color;
import java.awt.Frame;

public class Ejemplo1
{
	Frame ventana = new Frame("Nombre de la Ventana");

	Ejemplo1()
	{
//Tambien podemos poner aqui el titulo - ventana.setTitle("Ventana");
	
		ventana.setBackground(Color.pink); //Darle color
		ventana.setSize(400, 400); //Darle tamaño
		ventana.setLocationRelativeTo(null); //Ponerla al medio
		ventana.setResizable(false);
		
		ventana.setVisible(true); //Al final. 
	}

	public static void main(String[] args)
	{
		new Ejemplo1();
	}

}

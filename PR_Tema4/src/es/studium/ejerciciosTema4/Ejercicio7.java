package es.studium.ejerciciosTema4;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class Ejercicio7
{
	Frame ventana = new Frame("Equipos de Baloncesto");
	List lista = new List(5, false);
	String[] Equipos =
	{ "Seleccione un equipo", "Real Madrid", "Barça", "Iberoestar Tenerife", "TD Systems Baskonia",
			"Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur Real Betis", "RETAbet Bilbao Basket",
			"Acunsa Gipuzkoa Basket" };

	Ejercicio7()
	{

		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(200, 200);
		for (String equipos : Equipos)

		{

			lista.add(equipos);

		}
		ventana.add(lista);

		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio7();

	}

}

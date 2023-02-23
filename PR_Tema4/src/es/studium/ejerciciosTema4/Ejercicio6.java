package es.studium.ejerciciosTema4;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejercicio6
{
	Frame ventana = new Frame("Provincias Espa�olas");
	Choice choLista = new Choice();
	String[] provincias =
	{ "Seleccione una provincia", "�lava", "Albacete", "Alicante", "Almer�a", "Asturias", "�vila", "Badajoz",
			"Barcelona", "Burgos", "C�ceres", "C�diz", "Cantabria", "Castell�n", "Ciudad Real", "C�rdoba", "La Coru�a",
			"Cuenca", "Gerona", "Granada", "Guadalajara", "Guip�zcoa", "Huelva", "Huesca", "Islas Baleares", "Ja�n",
			"Le�n", "L�rida", "Lugo", "Madrid", "M�laga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
			"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
			"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };

	Ejercicio6()
	{

		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setSize(275, 300);
		for (String provincia : provincias)

		{

			choLista.add(provincia);

		}
		ventana.add(choLista);

		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{

		new Ejercicio6();
	}

}

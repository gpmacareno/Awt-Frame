package es.studium.ejerciciosTema4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.FlowLayout;

public class Ejercicio4
{

	Frame ventana = new Frame("Aficiones");

	Checkbox checkbox1 = new Checkbox("Correr");
	Checkbox checkbox2 = new Checkbox("Nadar");
	Checkbox checkbox3 = new Checkbox("Andar");
	Checkbox checkbox4 = new Checkbox("Leer");
	Checkbox checkbox5 = new Checkbox("Ir al Cine");
	Checkbox checkbox6 = new Checkbox("Bailar");
	Checkbox checkbox7 = new Checkbox("Fútbol");
	Checkbox checkbox8 = new Checkbox("Tenis");
	Checkbox checkbox9 = new Checkbox("Baloncesto");
	Checkbox checkbox10 = new Checkbox("Deportes de Vela");

	Button btnComprobar = new Button("Comprobar");

	Panel pnlCheckboxes = new Panel();
	Panel pnlBoton = new Panel();

	Ejercicio4()
	{

		ventana.setBackground(Color.pink);

		ventana.setSize(350, 190);

		ventana.setLayout(new BorderLayout());
		pnlCheckboxes.setLayout(new FlowLayout());
		pnlCheckboxes.add(checkbox1);
		pnlCheckboxes.add(checkbox2);
		pnlCheckboxes.add(checkbox3);
		pnlCheckboxes.add(checkbox4);
		pnlCheckboxes.add(checkbox5);
		pnlCheckboxes.add(checkbox6);
		pnlCheckboxes.add(checkbox7);
		pnlCheckboxes.add(checkbox8);
		pnlCheckboxes.add(checkbox9);
		pnlCheckboxes.add(checkbox10);

		pnlBoton.setLayout(new FlowLayout());
		pnlBoton.add(btnComprobar);

		ventana.add(pnlCheckboxes, "Center");
		ventana.add(pnlBoton, "South");

		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio4();

	}

}

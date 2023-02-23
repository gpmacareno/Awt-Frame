package es.studium.ejemplos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Ejemplo6
{

	Frame ventana = new Frame("Border Layout");
	
	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");
	
	Panel pnlNorte = new Panel ();
	Panel pnlSur = new Panel ();
	Panel pnlEste = new Panel ();
	Panel pnlOeste = new Panel ();
	Panel pnlCentro = new Panel ();
	
	
	Ejemplo6(){
		
		ventana.setBackground(Color.orange);
		ventana.setSize (400,400);
		ventana.setLayout(new BorderLayout());
		pnlNorte.add(btnNorte);
		ventana.add(pnlNorte, "North");
		pnlSur.add(btnSur);
		ventana.add(pnlSur, "South");
		pnlEste.add(btnEste);
		ventana.add(pnlEste, "East");
		pnlOeste.add(btnOeste);
		ventana.add(pnlOeste, "West");
		pnlCentro.add(btnCentro);
		ventana.add(pnlCentro, "Center");
		
		ventana.setVisible(true);
		
	}
	public static void main(String[] args)
	{

		new Ejemplo6();
		
	}

}

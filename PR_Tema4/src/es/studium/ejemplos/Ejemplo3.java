package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;

public class Ejemplo3
{
	Frame ventana = new Frame("Componentes");
	Button btnAceptar = new Button("Aceptar");
	TextField txtNombre = new TextField(20); //El numero indica el ancho del cuadro de texto, no el numero de caracteres.
	Label lblNombre = new Label("Nombre:"); //Etiquetas.
	
	Ejemplo3()
	{

		ventana.setBackground(Color.pink);
		ventana.setSize(400, 400);
		ventana.setLayout(new FlowLayout());
//		lblNombre.setLocation(100,300); Para poner donde queramos las cosas, pero no se puede con el FLOWLAYOUT.
		ventana.add(lblNombre);//con add añadimos los componentes.
		ventana.add(txtNombre);
		ventana.add(btnAceptar);	
	
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Ejemplo3 ();
	}

}

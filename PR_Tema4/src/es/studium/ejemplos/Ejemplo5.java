package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejemplo5
{
	Frame ventana = new Frame("GridLayout");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);

	Ejemplo5(){
		
		ventana.setSize(500,70);
		ventana.setLayout(new GridLayout(1,3)); //1 filas, 3 columnas.
		ventana.add(lblNombre);//con add añadimos los componentes.
		ventana.add(txtNombre);
		ventana.add(btnAceptar);	
	
		
		
		
		ventana.setVisible(true);		

	}
	
	public static void main(String[] args)
	{
		new Ejemplo5();
	}

}

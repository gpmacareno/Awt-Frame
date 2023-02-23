package es.studium.ejemplos;

import java.awt.*;

public class ejemplo14
{
	Frame ventana = new Frame("AwtTextArea");
	// Crear un TextArea vacío con tamaño 5 filas y 20 columnas
	TextArea areaTexto = new TextArea("", 15, 30);

	public ejemplo14()
	{
	ventana.setLayout(new FlowLayout());
	ventana.add(areaTexto);
	ventana.setLocationRelativeTo(null);
	ventana.setSize(300,300);
	ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ejemplo14();
	}

}

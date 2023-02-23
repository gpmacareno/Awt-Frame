package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ejemplo7
{
	Frame ventana = new Frame("AwtGBag");
	
	Button btnBoton0 = new Button("Botón 0");
	Button btnBoton1 = new Button("Botón 1");
	Button btnBoton2 = new Button("Botón 2");
	Button btnBoton3 = new Button("Botón 3");
	Button btnBoton4 = new Button("Botón 4");
	Button btnBoton5 = new Button("Botón 5");
	Button btnBoton6 = new Button("Botón 6");
	Button btnBoton7 = new Button("Botón 7");
	Button btnBoton8 = new Button("Botón 8");
	Button btnBoton9 = new Button("Botón 9");

	Ejemplo7(){
		
		ventana.setBackground(Color.pink);
		
		
		GridBagLayout gridbag = new GridBagLayout();
		
		// Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		ventana.setLayout(gridbag);
		
		// Establecer restricciones generales
		gbc.fill = GridBagConstraints.BOTH; //Para que se rellene (fill) en ambas direcciones (both). 
		
		// Definir restricciones para el primer botón.
		gbc.weightx = 1.0; // Como si fuera 1 columna. Weightx es para columnas. 
		// Aplicar restricciones al botón.
		gridbag.setConstraints(btnBoton0,gbc);
		ventana.add(btnBoton0);
		
		// Aplicar restricciones al botón
		gridbag.setConstraints(btnBoton1,gbc);
		ventana.add(btnBoton1);
		
		gridbag.setConstraints(btnBoton2,gbc);
		ventana.add(btnBoton2);

		gbc.gridwidth = GridBagConstraints.REMAINDER; // Espacio restante. Para que se quede con el espacio que quede. 
		gridbag.setConstraints(btnBoton3,gbc);
		ventana.add(btnBoton3);
		
		//gbc.weightx = 0.0; // Reset. Reseteamos el formato. Al no ponerle nada ocupara todas las columnas.
		gridbag.setConstraints(btnBoton4,gbc);
		ventana.add(btnBoton4);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE; // Ancho relativo
		gridbag.setConstraints(btnBoton5,gbc );
		ventana.add(btnBoton5);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gridbag.setConstraints(btnBoton6,gbc);
		ventana.add(btnBoton6);
		
		gbc.gridwidth = 1; // Ancho de 1 columna
		gbc.gridheight = 2; // Alto de 2 filas
		gbc.weighty = 1.0; // Tamaño relativo
		gridbag.setConstraints(btnBoton7,gbc);
		ventana.add(btnBoton7);
		
		gbc.weighty = 0.0; // Reset
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gbc.gridheight = 1; // Alto de 1 fila
		gridbag.setConstraints(btnBoton8,gbc);
		ventana.add(btnBoton8);
		
		gridbag.setConstraints(btnBoton9,gbc);//Todo lo sobrante. 
		ventana.add(btnBoton9);
		
		// Tamaño de la ventana
		ventana.setSize(300, 200);
		// Ventana centrada
		ventana.setLocationRelativeTo(null);
		// Hacer visible
		ventana.setVisible(true); 
		
		

	}

	public static void main(String[] args)
	{

		new Ejemplo7();
		
	}

}

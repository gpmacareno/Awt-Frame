package es.studium.ejerciciosTema4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ejercicio5
{
	Frame ventana = new Frame("Vehículos");
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	Label lblNombre = new Label("Tipo de motorización:");
	Checkbox checkbox1 = new Checkbox("Gasolina",false,chkgrGrupo);    
	Checkbox checkbox2 = new Checkbox("Diésel",false,chkgrGrupo); 
	Checkbox checkbox3 = new Checkbox("Híbrido",false,chkgrGrupo);
	Checkbox checkbox4 = new Checkbox("Eléctrico",false,chkgrGrupo);
	Label lblNombre2 = new Label("Número de puertas:");
	Checkbox checkbox5 = new Checkbox("3 puertas",false,chkgrGrupo);    
	Checkbox checkbox6 = new Checkbox("4 puertas",false,chkgrGrupo); 
	Checkbox checkbox7 = new Checkbox("5 puertas",false,chkgrGrupo);
	Label lblNombre3 = new Label("Pintura Metalizada:");
	Checkbox chkUno = new Checkbox("Sí", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("No", false, chkgrGrupo);
	Button btnComprobar = new Button("Calcular presupuesto");
	Panel pnlBoton = new Panel();


	Ejercicio5()
	{
		ventana.setBackground(Color.pink);
		ventana.setSize(275, 300);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblNombre);
		ventana.add(checkbox1);
		ventana.add(checkbox2);
		ventana.add(checkbox3);
		ventana.add(checkbox4);
		ventana.add(lblNombre2);
		ventana.add(checkbox5);
		ventana.add(checkbox6);
		ventana.add(checkbox7);
		ventana.add(lblNombre3);
		ventana.add(chkUno);
		ventana.add(chkDos);
		pnlBoton.add(btnComprobar);
		ventana.add(pnlBoton);
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Ejercicio5();

	}

}

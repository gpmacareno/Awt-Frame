package es.studium.ejerciciosTema4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio8
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	

	
	Menu menuArticulos = new Menu("Artículos");
	MenuItem menuArchivoNuevoArticulo = new MenuItem("Nuevo Artículo");
	MenuItem menuArchivoEliminarArticulo = new MenuItem("Eliminar Artículo");
	MenuItem menuArchivoConsultarArticulo = new MenuItem("Consultar Artículo");

	Menu menuClientes = new Menu("Clientes");
	MenuItem menuNuevoCliente = new MenuItem("Nuevo Cliente");
	MenuItem menuEliminarCliente = new MenuItem("Eliminar Cliente");
	MenuItem menuConsultarCliente = new MenuItem("Consultar Cliente");
	
	Menu menuFacturas = new Menu("Facturas");
	MenuItem menuNuevaFactura = new MenuItem("Nueva Factura");
	MenuItem menuConsultarFactura = new MenuItem("Consultar Factura");

	public Ejercicio8() {
		ventana.setLayout (new FlowLayout());
		ventana.setBackground(Color.pink);
		ventana.setMenuBar(barraMenu);
		
		menuArticulos.add(menuArchivoNuevoArticulo);
		menuArticulos.addSeparator();
		menuArticulos.add(menuArchivoEliminarArticulo);
		menuArticulos.add(menuArchivoConsultarArticulo);
		barraMenu.add(menuArticulos);
		
		menuClientes.add(menuNuevoCliente);
		menuClientes.add(menuEliminarCliente);
		menuClientes.add(menuConsultarCliente);
		barraMenu.add(menuClientes);
		
		menuFacturas.add(menuNuevaFactura);
		menuFacturas.add(menuConsultarFactura);
		barraMenu.add(menuFacturas);
	
		menuArticulos.addSeparator();
		
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400,400);
		ventana.setVisible(true); 
		
	}

	
	
	
	
	public static void main(String[] args)
	{
		new Ejercicio8();

	}

	
	
}

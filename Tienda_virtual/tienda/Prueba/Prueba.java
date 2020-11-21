package Prueba;

import entities.Cliente;
import entities.Servicio;
import entities.Tienda;
import model.ClienteDAO;
import model.ServicioDAO;
import model.TiendaDAO;

public class Prueba {
	private ClienteDAO clienteDAO;
	private TiendaDAO tiendaDAO;
	private ServicioDAO servicioDAO;
	public void crearCliente(Cliente cliente) {
		
		clienteDAO.insert(cliente);
	}
	public void crearTienda(Tienda tienda) {
		tiendaDAO.insert(tienda);
	}
	public void CrearServicio(Servicio servicio) {
		servicioDAO.insert(servicio);
		
	}
	public void SeguirTienda() {}
	public void actualizarTienda(Tienda tienda) {
		tiendaDAO.update(tienda);
		
	}
	public static void main(String[] args) {
		Cliente cliente =new Cliente();
		Tienda tienda=new Tienda ();
		Servicio servicio=new Servicio();
		
		
	}
}

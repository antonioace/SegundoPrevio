package model;

import entities.Cliente;
import util.Conexion;
import util.GenericDao;
public class ClienteDAO extends Conexion<Cliente> implements GenericDao<Cliente>{
	
	public ClienteDAO() {
		// TODO Auto-generated constructor stub
		super(Cliente.class);
	}
	
	

}

package model;

import entities.Tienda;
import util.Conexion;
import util.GenericDao;
public class TiendaDAO extends Conexion<Tienda> implements GenericDao<Tienda>{
	
	public TiendaDAO() {
		// TODO Auto-generated constructor stub
		super(Tienda.class);
	}
	
	

}

package model;

import entities.Servicio;
import util.Conexion;
import util.GenericDao;
public class ServicioDAO extends Conexion<Servicio> implements GenericDao<Servicio>{
	
	public ServicioDAO() {
		// TODO Auto-generated constructor stub
		super(Servicio.class);
	}
	
	

}

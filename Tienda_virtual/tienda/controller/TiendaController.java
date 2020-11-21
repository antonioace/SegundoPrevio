package controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Cliente;
import entities.Servicio;
import entities.Tienda;
import model.TiendaDAO;

/**
 * Servlet implementation class TiendaController
 */
@WebServlet("/TiendaController/*")
public class TiendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private TiendaDAO tiendaDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaController() {
        super();
        tiendaDAO=new TiendaDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch (action) {
		case "insert":
			this.registrar(request, response);
			break;
		

		default:
			break;
		}
	}
	
	protected void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		@Id
//		private int id;
//
//		private String clave;
//		@Column(name = "descripcion",  columnDefinition="TEXT")
//		@Lob
//		private String descripcion;
//
//		private String email;
//
//		private String facebook;
//
//		private String imagen;
//
//		private String lema;
//
//		private String nombre;
//
//		private String propietario;
//
//		private String web;
//
//		//bi-directional many-to-one association to Servicio
//		@OneToMany(mappedBy="tiendaBean")
//		private List<Servicio> servicios;
//
//		//bi-directional many-to-many association to Cliente
//		@ManyToMany
//		@JoinTable(
//			name="seguir"
//			, joinColumns={
//				@JoinColumn(name="tienda")
//				}
//			, inverseJoinColumns={
//				@JoinColumn(name="cliente")
//				}
//			)
//		private List<Cliente> clientes;
		String clave=request.getParameter("clave");
		String descripcion=request.getParameter("descripcion");
		String email=request.getParameter("email");
		String facebook=request.getParameter("facebook");
		String imagen=request.getParameter("imagen");
		String lema=request.getParameter("lema");
		String nombre=request.getParameter("nombre");
		String propietario=request.getParameter("propietario");
		String web=request.getParameter("web");
		Tienda tienda=new Tienda();
		tienda.setClave(clave);
		tienda.setDescripcion(descripcion);
		tienda.setEmail(email);
		tienda.setFacebook(facebook);
		tienda.setImagen(imagen);
		tienda.setLema(lema);
		tienda.setNombre(nombre);
		tienda.setPropietario(propietario);
		tienda.setWeb(web);
		tiendaDAO.insert(tienda);
		response.sendRedirect("index.jsp");		
		
	}

}

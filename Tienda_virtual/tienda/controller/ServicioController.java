package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Servicio;
import entities.Tienda;
import model.ServicioDAO;
import model.TiendaDAO;

/**
 * Servlet implementation class ServicioController
 */
@WebServlet("/ServicioController/*")
public class ServicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ServicioDAO servicioDAO;
       private TiendaDAO tiendaDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicioController() {
        super();
        servicioDAO=new ServicioDAO();
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
String nombre=request.getParameter("nombre");
String descripcion=request.getParameter("descripcion");
int tienda=Integer.parseInt(request.getParameter("tienda"));
Tienda tiendaBean=tiendaDAO.find(tienda);
Servicio servicio=new Servicio();
servicio.setDescripcion(descripcion);
servicio.setNombre(nombre);
servicio.setTiendaBean(tiendaBean);
		servicioDAO.insert(servicio);
		response.sendRedirect("servicios.jsp");		
		
	}

}

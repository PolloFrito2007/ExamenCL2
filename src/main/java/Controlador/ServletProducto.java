package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ServletProducto
 */
public class ServletProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/Productos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TblProductocl2 prod = new TblProductocl2();
		CrudProductoImp crudprod = new CrudProductoImp();
		
		String nom = request.getParameter("nombre");
		double pv = Double.parseDouble(request.getParameter("pv"));
		double pc = Double.parseDouble(request.getParameter("pc"));
		String estado = request.getParameter("estado");
		String desc = request.getParameter("desc");
		
		prod.setNombrecl2(nom);
		prod.setPrecioventacl2(pv);
		prod.setPreciocompracl2(pc);
		prod.setEstadocl2(estado);
		prod.setDescripcl2(desc);
		
		crudprod.RegistrarProducto(prod);
		
		List<TblProductocl2> listarproducto = crudprod.ListarProductos();
		request.setAttribute("listado", listarproducto);
		request.getRequestDispatcher("/Productos.jsp").forward(request, response);
		
	}

}

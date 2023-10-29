package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ServletUsuario
 */
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// doGet(request, response);
		CrudUsuarioImp crudusu = new CrudUsuarioImp();
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		TblUsuariocl2 usu = new TblUsuariocl2();
		
		usu.setUsuariocl2(usuario);
		usu.setPasswordcl2(password);
		
		String mensaje = crudusu.ValidarUsuario(usu);
		
		if(mensaje.equals("Bienvenido al sistema " + usuario)) {
			request.getRequestDispatcher("/Productos.jsp").forward(request, response);
		} else {
			response.sendRedirect("/ErrorIngreso.jsp");
		}
		System.out.println(mensaje);
		
	}

}

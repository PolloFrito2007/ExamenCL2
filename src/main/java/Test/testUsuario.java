package Test;

import model.TblUsuariocl2;
import Dao.CrudUsuarioImp;

public class testUsuario {

	public static void main(String[] args) {
		
		TblUsuariocl2 usu = new TblUsuariocl2();
		CrudUsuarioImp crudusu = new CrudUsuarioImp();
		
//		// Registrar usuario
//		usu.setUsuariocl2("Yhiro1007");
//		usu.setPasswordcl2("iann*2013");
//		crudusu.RegistrarUsuario(usu);
		
		// Validar usuario
		usu.setUsuariocl2("cibertec2032");
		usu.setPasswordcl2("123456");
		String men = crudusu.ValidarUsuario(usu);
		System.out.println("usuario " + men);
		
	}

}

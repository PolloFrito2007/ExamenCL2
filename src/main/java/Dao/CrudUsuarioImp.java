package Dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.Iusuarioable;
import model.TblUsuariocl2;

public class CrudUsuarioImp implements Iusuarioable {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusu) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenCL2");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(tblusu);
		System.out.println("Usuario registrado con exito");
		emanager.getTransaction().commit();
		emanager.close();
		
	}

	@Override
	public String ValidarUsuario(TblUsuariocl2 tblusu) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenCL2");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		Query consulta = emanager.createQuery("select u from TblUsuariocl2 u where u.usuariocl2 =:x and u.passwordcl2 =:y", TblUsuariocl2.class);
		consulta.setParameter("x", tblusu.getUsuariocl2());
		consulta.setParameter("y", tblusu.getPasswordcl2());
		String mensaje = "";
		@SuppressWarnings("unused")
		TblUsuariocl2 u;
		try {
			u = (TblUsuariocl2) consulta.getSingleResult();
			mensaje = "Bienvenido al sistema " + tblusu.getUsuariocl2();
		} catch (Exception e) {
			u = null;
			mensaje = "Usuario no existe";
		}
		return mensaje;
		
	}

}

package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproductoable;
import model.TblProductocl2;

public class CrudProductoImp implements Iproductoable {

	@Override
	public void RegistrarProducto(TblProductocl2 tblprod) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenCL2");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(tblprod);
		System.out.println("El producto fue registrado correctamente");
		emanager.getTransaction().commit();
		emanager.close();
		
	}

	@Override
	public List<TblProductocl2> ListarProductos() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenCL2");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		List<TblProductocl2> listado = emanager.createQuery("select p from TblProductocl2 p", TblProductocl2.class).getResultList();
		return listado;
		
	}

}

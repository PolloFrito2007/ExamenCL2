package Test;

import model.TblProductocl2;

import java.util.List;

import Dao.CrudProductoImp;

public class testProducto {

	public static void main(String[] args) {
		
		TblProductocl2 pro = new TblProductocl2();
		CrudProductoImp crudpro = new CrudProductoImp();
		
		// Registrar producto
		pro.setNombrecl2("Leche Gloria");
		pro.setPrecioventacl2(4.80);
		pro.setPreciocompracl2(3.50);
		pro.setEstadocl2("Vigente");
		pro.setDescripcl2("Leche en tarro");
		crudpro.RegistrarProducto(pro);
		
		// Listar
		List<TblProductocl2> listaprod = crudpro.ListarProductos();
		for(TblProductocl2 lista:listaprod) {
			System.out.println("Codigo: " + lista.getIdproductocl2() + "\n" +
							   "Nombre: " + lista.getNombrecl2() + "\n" +
							   "Precio de venta: " + lista.getPrecioventacl2() + "\n" +
							   "Precio de compra: " + lista.getPreciocompracl2() + "\n" +
							   "Estado del producto: " + lista.getEstadocl2() + "\n" +
							   "Descripcion del producto: " + lista.getDescripcl2());
		}
		
	}

}

package test;

import modelo.Supermercado;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado s = new Supermercado();
		
		System.out.println("CU 1");
		
		try {
			s.agregarProducto("manteca", 36);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			s.agregarProducto("mermelada", 32);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			s.agregarProducto("dulce de leche", 55);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			s.agregarProducto("manteca", 36);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(s.getGondola());
		
		
		
		/********************************************************/
		
		System.out.println("CU 2");
		
		System.out.println(s.traerProducto(2));
		/********************************************************/
		
		System.out.println("CU 3");
		
		try {
			s.modificarProducto(1, "Detergente", 25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			s.modificarProducto(5, "fideos", 12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(s.getGondola());
		
		/********************************************************/
		
		
		
		
	}

}

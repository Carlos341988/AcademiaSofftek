package modelo;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Producto> gondola;

	public Supermercado() {
		
		this.gondola = new ArrayList<>();
		
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}
	
	public boolean agregarProducto(String producto, float precio) throws Exception{
		
		for(int i=0; i<gondola.size();i++) {
			if(gondola.get(i).getProducto().equalsIgnoreCase(producto)) {
				throw new Exception("El producto existe");
			}
		}
		
		int id=1;
		if(gondola.size()>0) {
			id=gondola.get(gondola.size()-1).getIdProducto()+1;
		
			
		}
		
		Producto p = new Producto(id, producto, precio);
		
		return gondola.add(p);
		
		
	}
	
	public Producto traerProducto(int idProducto) {
		
		Producto p=null;
		int i=0;
		boolean encontrado=false;
		
		while(encontrado!= true && i<gondola.size()) {
			if(gondola.get(i).getIdProducto()==idProducto) {
				p= gondola.get(i);
				encontrado= true;
			}
			
			i++;	
		}
		return p;
	}
	
	
	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {
		
		Producto p = traerProducto(idProducto);
		if(p == null){
			throw new Exception("El productro no existe");
		}
		
		p.setProducto(producto);
		p.setPrecio(precio);
		
		return true;
		
	}

}

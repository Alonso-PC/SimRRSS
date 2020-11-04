package cl.simulacion5.entity;

import java.io.Serializable;


public class DetalleFacturaPK implements Serializable{
	
	/**  **/
	private static final long serialVersionUID = -6214101276415501399L;
	
	private int facturaid;
	private int productosid;
	
	public DetalleFacturaPK() {
		super();
	}

	public DetalleFacturaPK(int facturaid, int productosid) {
		super();
		this.facturaid = facturaid;
		this.productosid = productosid;
	}

	public int getFacturaid() {
		return facturaid;
	}

	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}

	public int getProductosid() {
		return productosid;
	}

	public void setProductosid(int productosid) {
		this.productosid = productosid;
	}

	/** hash permite operar los índices **/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facturaid;
		result = prime * result + productosid;
		return result;
	}

	/** equals verifica que sea único **/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleFacturaPK other = (DetalleFacturaPK) obj;
		if (facturaid != other.facturaid)
			return false;
		if (productosid != other.productosid)
			return false;
		return true;
	}
	
	
	
	
	
	
	

}

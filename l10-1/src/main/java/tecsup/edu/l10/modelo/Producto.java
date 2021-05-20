package tecsup.edu.l10.modelo;

public class Producto {
	
	private Long codigo;
	private String descripcion;
	private double precio;
	
	public Producto() {
		super();
	}
	
	public Producto(Long codigo, String descripcion, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	

}

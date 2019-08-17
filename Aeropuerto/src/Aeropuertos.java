
public class Aeropuertos {

	String nombre;
	String ciudad;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	void Imprimir() {
		System.out.println(nombre + ciudad);
	}

}

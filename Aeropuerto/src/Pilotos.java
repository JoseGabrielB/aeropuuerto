
public class Pilotos extends Personas {

	String horas;

	public Pilotos(String nombre, int edad, String sexo, String horas) {
		super(nombre, edad, sexo);
		this.horas = horas;

	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	void Imprimir() {
		System.out.println("==========Piloto===============");
		System.out.println("Piloto del avion :" + nombre);
		System.out.println("Horas            : " + horas);

	}

}


public class Pasajeros extends Personas {
	String boleto;

	public Pasajeros(String nombre, int edad, String sexo, String boleto) {
		super(nombre, edad, sexo);
		this.boleto = boleto;
	}

	public String getBoleto() {
		return boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	void Imprimir() {
		System.out.println(boleto+nombre);

	}

}


public class Aviones {

	String color;
	String marca;

	public Aviones(String color, String marca) {
		this.color = "Blanco";
		this.marca = "Airbus A340";

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	void Imprimir() {
		System.out.println("---------Avion------------");
		System.out.println("Color  :" + color);
		System.out.println("Marca  :" + marca);

	}
}

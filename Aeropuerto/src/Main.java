
public class Main {

	public static void main(String[] args) {

		Aviones avion = new Aviones("Balnco", "polo ");
		Pilotos piloto = new Pilotos("Chiasa", 18, "M", "09:35");
		Vuelos vion = new Vuelos(avion, "12:59", piloto,"Japon","Argentina");

		vion.Imprimir();
		piloto.Imprimir();
		avion.Imprimir();
	}
}

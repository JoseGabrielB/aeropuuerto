import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	Aviones avion;
	String hora_de_partida;
	Pilotos pilotos;
	String partida;
	String destino;

	List<Pasajeros> listpasajero = new ArrayList<Pasajeros>();

	public Vuelos(Aviones avion, String hora_de_partida, Pilotos pilotos, String destino, String partida) {

		this.avion = avion;
		this.hora_de_partida = hora_de_partida;
		this.pilotos = pilotos;
		this.destino = destino;
		this.partida = partida;
		;

	}

	public Aviones getAvion() {
		return avion;
	}

	public void setAvion(Aviones avion) {

		this.avion = avion;
	}

	public Pilotos getPilotos() {
		return pilotos;
	}

	public void setPilotos(Pilotos pilotos) {
		this.pilotos = pilotos;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getHora_de_partida() {
		return hora_de_partida;
	}

	public void setHora_de_partida(String hora_de_partida) {
		this.hora_de_partida = hora_de_partida;
	}

	void Imprimir() {
		System.out.println("------------Vuelos-----------");
		System.out.println(hora_de_partida);
		System.out.println("Destino de vuelo : Japon    ");
		System.out.println("Partida de vuelo : Argentina");
		pilotos.Imprimir();
		avion.Imprimir();

	}
}

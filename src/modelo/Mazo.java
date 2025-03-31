package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;

/**
 *
 * 	Clase que representa un mazo de cartas que puede ser barajado y puede distribuir cartas.
 *
 * @author [Del codigo: carrony; Del comentario: Lucas Thompson]
 *
 *
 */

public class Mazo {

	protected List<Carta> cartas;


	/**
	 * 	Crea un nuevo mazo
	 */

	public Mazo() {
		this.cartas = new ArrayList<Carta>();	
		for(Palo palo: Palo.values()) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta(i,palo);
				this.cartas.add(carta);
			}
		}
	}

	/**
	 * @see Collections
	 *
	 * Llama al metodo shuffle de Collections para barajar las cartas.
	 *
	 */
	
	public void barajar() {
		Collections.shuffle(cartas);
	}


	/**
	 * Devuelve una representación en cadena del mazo.
	 *
	 * @return Una cadena con todas las cartas en el mazo.
	 */
	@Override
	public String toString() {
		String res="";
		for (Carta carta : cartas) {
			res=res+carta.toString()+ "\n";
		}
		return res;
	}

	/**
	 * Solicita una carta del mazo. Si el mazo está vacío, lanza una excepción.
	 *
	 * @return La primera carta del mazo.
	 * @throws NoHayMasCartasException si no hay más cartas en el mazo.
	 */
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if (this.cartas.isEmpty()) {
			throw new NoHayMasCartasException();
		}
		Carta carta = this.cartas.getFirst();
		this.cartas.removeFirst();
		return carta;
	}
	
	
}

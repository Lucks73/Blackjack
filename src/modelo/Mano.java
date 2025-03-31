package modelo;

import java.util.ArrayList;

import excepciones.NoHayMasCartasException;

/**
 *
 * 	Clase que representa un mazo de cartas que puede ser barajado y puede distribuir cartas.
 *
 * @author [Del codigo: carrony; Del comentario: Lucas Thompson]
 *
 *
 */

public class Mano extends Mazo {

	/**
	 * Constructor que inicializa una mano vacía.
	 */

	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}


	/**
	 * Calcula el valor total de la mano sumando el valor de todas las cartas.
	 *
	 * @return El valor total de la mano.
	 */
	public int valorMano() {
		int valor=0;
		for (Carta carta : this.cartas) {
			valor=valor+carta.getValor();
		}
		return valor;
	}

	/**
	 * Verifica si la mano ha alcanzado o superado el valor de 21.
	 *
	 * @return true si el valor de la mano es 21 o más, false en caso contrario.
	 */
	public boolean finDeJuego() {
		if (this.valorMano()>=21) {
			return true;
		}
		return false;
	}

	/**
	 * Devuelve el valor de la mano en forma de cadena.
	 *
	 * @return Una cadena con el valor de la mano y las cartas que la componen.
	 */
	@Override
	public String toString() {
		String res="Valor de la Mano: "+this.valorMano()+"\n";
		res=res+super.toString();
		return res;
	}

	/**
	 * Pide una carta de un mazo y la añade a la mano.
	 *
	 * @param m El mazo del cual se solicitará la carta.
	 * @throws NoHayMasCartasException si el mazo no tiene más cartas.
	 */

	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
	
	
	
}

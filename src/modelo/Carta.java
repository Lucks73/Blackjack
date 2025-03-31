package modelo;

/**
 *
 * 	Clase que representa un mazo de cartas que puede ser barajado y puede distribuir cartas.
 *
 * @author [Del codigo: carrony; Del comentario: Lucas Thompson]
 *
 *
 */

public class Carta {
	/**
	 * Enumeración de los palos de la baraja.
	 */
	public enum Palo {
			TREBOl, DIAMANTE ,CORAZONES, PICAS
	}


	private int numero;
	private Palo palo;

	/**
	 * Constructor que inicializa una carta con un número y un palo.
	 *
	 * @param numero El número de la carta (1-13).
	 * @param palo El palo de la carta.
	 */
	
	public Carta(int numero, Palo palo) {
		if (numero>=1 && numero<=13) {
			this.numero = numero;
			this.palo = palo;
		}
	}
	/**
	 * Obtiene el número de la carta.
	 *
	 * @return El número de la carta.
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Obtiene el palo de la carta.
	 *
	 * @return El palo de la carta.
	 */
	public Palo getPalo() {
		return palo;
	}
	/**
	 * Obtiene el valor de la carta para el juego.
	 * @return El valor de la carta en el juego.
	 */
	public int getValor() {
		int valor;
		
		if (this.numero>=2 && this.numero<=10) {
			valor=this.numero;
		} else if (this.numero==1){
			valor=11;
		} else {
			valor=10;
		}

		return valor;
	}
	/**
	 * Devuelve una representación en texto del número de la carta.
	 *
	 * @return Una cadena con el número o nombre de la carta.
	 */
	public String mostrarNumero() {
        if (this.numero == 1) {
            return "AS";
        } else if (this.numero == 11) {
            return "J";
        } else if (this.numero == 12) {
            return "Q";
        } else if (this.numero == 13) {
            return "K";
        }
        return "" + this.numero;
    }
	/**
	 * Devuelve una representación en cadena de la carta.
	 *
	 * @return Una cadena en formato [Número - Palo].
	 */
	@Override
	public String toString() {
		return "["+ mostrarNumero() + " - " + palo + "]";
	}

}

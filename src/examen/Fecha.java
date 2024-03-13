package examen;

/**
 * La clase 'Fecha' nos permite comprobar si una fecha tiene datos validos gracias a su metodo.
 * 
 * @author Lucas Garcia
 * @version 1.0.0
 */
public class Fecha {
	
	/**
	 * Variable booleana que nos indica si la fecha es valida o no.
	 */
	public static boolean fechaValida;

	/**
	 * Metodo al que le introducimos un ano, un mes y un dia, nos dice si esos datos son verdaderos.
	 * 
	 * @param anio Entero que indica el ano.
	 * @param mes Entero que indica el mes.
	 * @param dia Entero que indica el dia.
	 * @return Devuelve si la fecha es valida o no.
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}
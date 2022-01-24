/**
 * 
 */

/**
 * @author USUARIO
 *
 */
public class examen {

	/**
	 * @param matriz que muestre los datos
	 */
	
	public static void mostrar_imcs(double matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
		System.out.printf(" %.2f ", matriz[i][j]);
		}
		System.out.println();
		}



		}
		
	/**
	 * @param matriz Matriz datos de pacientes y IMC
	 * @param paciente El paciente, se empieza a contar pacientes desde el 0, primer paciente sera el 0.
	* @return media, la media del IMC anual. 
	* */
	public static double media_paciente(double matriz[][], int paciente) {
		double media = 0;
		for (int i = 0; i < matriz[0].length; i++) {
			media += matriz[paciente][i];
		}
		return media/matriz[0].length;
	}
}




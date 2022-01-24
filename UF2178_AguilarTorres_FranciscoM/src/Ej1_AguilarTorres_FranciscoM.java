import java.util.Scanner;
public class Ej1_AguilarTorres_FranciscoM {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double peso, altura,imc;
		System.out.println("Introduce el peso ");
		peso = sc.nextDouble();
		System.out.println("Introduce la altura: ");
		altura = sc.nextDouble();

		imc = peso / Math.pow(altura, 2);

		String diagnostico;
		if (imc<18.5) 
		diagnostico = "Bajo peso";
		else if(imc>18.5 && imc<24.9)
		diagnostico = "Peso normal (saludable)";
		else if(imc>25 && imc<29.9)
		diagnostico = "Sobrepeso";
		else if(imc>30 && imc<40)
		diagnostico = "Obesidad premórbida";
		else
		diagnostico = "Obesidad mórbida";

		System.out.printf("El paciente de %.2f kg y %.2f m de altura"
				+ ", tiene un IMC de %.2f y "
		+ " tiene un diagnóstico de %s "
				,peso,altura,imc,diagnostico);
		}

}

import java.util.Scanner;

		public class Circulo{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese el valor del radio de circunferencia: ");
		double radio = sc.nextDouble();

		
		double longitud = 2 * 3.14 * radio;
		double area = 3.14 * Math.pow(radio, 2);

		
		System.out.println("Resultados: ");
		System.out.println("Radio: " + radio);
		System.out.println("Longitud de la circuenferencia: " + area);



		}
}
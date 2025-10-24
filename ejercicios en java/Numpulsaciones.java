import java.util.Scanner;

		public class Numpulsaciones{

		public static void main(String args []){

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese la edad de la persona: ");
		int edad = sc.nextInt();
		
		
			float pulsaciones = (220 - edad)/10;

		System.out.println("El número de pulsaciones de una persona de " + edad +  " de edad debe ser " + pulsaciones);
		





			}
}
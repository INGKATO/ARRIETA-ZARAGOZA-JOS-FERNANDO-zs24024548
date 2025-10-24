import java.util.Scanner;

 	public class Calcularedad{
		public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Para calcular la edad de una persona ingrese el año actual: ");
		int a = sc.nextInt();

		System.out.println("ingrese la fecha de nacimiento: ");
		int f = sc.nextInt();


		int edad = a - f;

		System.out.println("La edad de la persona es: " + edad + " años");

	}
}

		


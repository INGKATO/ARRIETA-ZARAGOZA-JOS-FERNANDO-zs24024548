import java.util.Scanner;


		public class Descuento{

			public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el precio original de la compra: ");
		double precio = sc.nextDouble();

		double descuento = precio - (precio * 0.15);

		System.out.println("El precio final con descuento es: " + descuento);		

		

		}
}
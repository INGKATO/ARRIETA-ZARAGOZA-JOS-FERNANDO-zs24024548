import java.util.Scanner;

public class SalarioO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


		System.out.println("ingrese el salario anterior del obrero: "); 
		double SA = sc.nextDouble();

		double incremento = SA * 0.25;
		double NS = SA + incremento;

		System.out.println("Incremento del 25%: " + incremento);
		System.out.println("Nuevo salario: " + NS);

		}
}
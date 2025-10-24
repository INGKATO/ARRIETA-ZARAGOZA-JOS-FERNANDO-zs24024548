import java.util.Scanner;

public class ValoresComparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer tres valores
        System.out.print("Ingresa el primer valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Ingresa el tercer valor: ");
        double valor3 = sc.nextDouble();

        // Calcular promedio
        double promedio = (valor1 + valor2 + valor3) / 3;

        // Verificar si son iguales
        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("Los tres valores son iguales.");
        } else {
            // Determinar el mayor
            double mayor = valor1;
            if (valor2 > mayor) mayor = valor2;
            if (valor3 > mayor) mayor = valor3;

            // Determinar el menor
            double menor = valor1;
            if (valor2 < menor) menor = valor2;
            if (valor3 < menor) menor = valor3;

            // Mostrar resultados
            
            System.out.println("El valor mayor es: " + mayor);
            System.out.println("El valor menor es: " + menor);
            System.out.println("El promedio es: " + promedio);
            
        }

   
    }
}
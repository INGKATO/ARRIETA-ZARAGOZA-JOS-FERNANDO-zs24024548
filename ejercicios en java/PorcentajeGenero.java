import java.util.Scanner;

public class PorcentajeGenero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingresa la cantidad de hombres en el grupo: ");
        int hombres = sc.nextInt();

         System.out.print("Ingresa la cantidad de mujeres en el grupo: ");
        int mujeres = sc.nextInt();

     
        int total = hombres + mujeres;

                if (total == 0) {
            System.out.println("No hay estudiantes en el grupo.");
        } else {
            // Calcular porcentajes
            double porcentajeHombres = (hombres * 100.0) / total;
            double porcentajeMujeres = (mujeres * 100.0) / total;

            // Mostrar resultados
            System.out.println("Total de estudiantes: " + total);
            System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
            System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
  
        }

        
    }
}
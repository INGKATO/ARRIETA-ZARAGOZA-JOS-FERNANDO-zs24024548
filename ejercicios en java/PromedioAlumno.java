import java.util.Scanner;

	public class PromedioAlumno {
    		public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);



	System.out.println("Ingresa la calificación de la primara materia: ");
	double mat1 = sc.nextDouble();

	System.out.println("Ingresa la calificación de la segunda materia: ");
	double mat2 = sc.nextDouble();

	System.out.println("Ingresa la calificación de la tercera materia: ");
	double mat3 = sc.nextDouble();

		
	double promedio = (mat1 + mat2 + mat3)/3;

	System.out.println("Calificación 1: " + mat1);
        System.out.println("Calificación 2: " + mat2);
        System.out.println("Calificación 3: " + mat3);
        System.out.println("Promedio general: " + promedio);


		}
}
		
	


	
	

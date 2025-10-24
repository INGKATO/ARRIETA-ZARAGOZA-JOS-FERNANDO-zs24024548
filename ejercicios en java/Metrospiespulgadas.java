import java.util.Scanner;

	 public class Metrospiespulgadas {

	 public static void main(String[] args) {

	   Scanner sc = new Scanner (System.in);


		System.out.println("metro: ");

		double metro = sc.nextDouble();
	
		double ft = metro * 3.28084;
		
		double in = metro * 39.37;
	
		System.out.println("las pulgadas son: " + in);
		System.out.println("los pies son: " + ft);



	}
}
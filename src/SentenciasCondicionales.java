import java.util.Scanner;
public class SentenciasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se crea variable con número random de 1 a 10
		int nrand = (int)((Math.random()*10) + 1);
		
		//Se crea crea la variable scanner
		Scanner sc = new Scanner(System.in);
		int num = -1;
		int intentos = 0;
		do{
		intentos = intentos + 1;	
		//Se pide al usuario que introduzca el valor
		System.out.println("Introduzca un valor del 1 al 10:");
		
		//Se lee valor introducido y se crea la variable
		num = sc.nextInt();
		
		//Condicional para decir si es mayor o menor que el random
		if(num == nrand) {
			System.out.println("Ha adivinado el número en " + intentos + " intentos.");
		}
		else if (num > nrand){
			System.out.println("El número " + num + " es mayor que el número generado");
		}
		else {
			System.out.println("El número " + num + " es menor que el número a adivinar");
		}
		//Se añade un intento a la variable
		
		}while(num != nrand);

		sc.close();
	}

}
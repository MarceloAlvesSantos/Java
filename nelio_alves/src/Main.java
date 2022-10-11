import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String y;
			System.out.printf("Número: ");
			float x = sc.nextFloat();
			System.out.printf("Número: ");
			float m = sc.nextFloat();
			sc.nextLine();
			System.out.printf("Número: ");
			y = sc.nextLine();
			System.out.println("Você digitou: " + x);
			System.out.println("Você digitou: " + m);
			System.out.println("Você digitou: " + y);
		sc.close();
		
	}

}

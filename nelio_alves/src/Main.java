import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String y;
			System.out.printf("N�mero: ");
			float x = sc.nextFloat();
			System.out.printf("N�mero: ");
			float m = sc.nextFloat();
			sc.nextLine();
			System.out.printf("N�mero: ");
			y = sc.nextLine();
			System.out.println("Voc� digitou: " + x);
			System.out.println("Voc� digitou: " + m);
			System.out.println("Voc� digitou: " + y);
		sc.close();
		
	}

}

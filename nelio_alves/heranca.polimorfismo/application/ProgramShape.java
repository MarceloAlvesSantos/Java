package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramShape {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.next());	
			if ( ch == 'r') {
				System.out.print("Width: ");
				double Width = sc.nextDouble();
				System.out.print("Height: ");
				double Height = sc.nextDouble();
				Shape sh = new Rectangle(color, Width, Height);
				list.add(sh);
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape sh = new Circle(color, radius);
				list.add(sh);
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for ( Shape shape : list ) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		
		
		
		
		sc.close();
	}
}

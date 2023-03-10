package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of shapes: ");
		int n = scan.nextInt();
		
		System.out.println("");
		
		List<Shape> list = new ArrayList<Shape>();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i);
			System.out.print("Rectangle or Circle (r/c): ");
			char rc = scan.next().charAt(0);
			
			System.out.print("Color: ");
			Color color = Color.valueOf(scan.next());
			
			if (rc == 'r') {
				System.out.print("Height: ");
				double height = scan.nextDouble();
				
				System.out.print("Width: ");
				double width = scan.nextDouble();
				
				list.add(new Rectangle(color, width, height));
				
			} else {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println("");
		System.out.println("Shape Areas");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	}
}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<EmployeeList> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			System.out.println("\nEmplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			EmployeeList emp = new EmployeeList(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (emp == null){
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		//Integer pos = position(list, idSalary); // Opção mais trabalhosa, com função
		/*if (pos == null){
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}*/
	
		
		System.out.println("\nList of employees: ");
		
		for(EmployeeList empp: list) {
			System.out.println(empp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<EmployeeList> list, int id) {
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}

package main;
import java.util.Scanner;

import employee.Employee;
import service.CredentialService;

public class Application {

	public static void main(String[] args) {
		int option;
		String dept = "";
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee("Kartik", "G");
		
		System.out.println("Please enter the department from below");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		option = sc.nextInt();
		
		switch (option) {
			case 1:
				dept = "Technical";
				break;
			case 2:
				dept = "Admin";
				break;
			case 3:
				dept = "Human Resource";
				break;	
			case 4:
				dept = "Legal";
				break;		
			default: 
				System.out.println("Please enter a valid option");
				break;
			}
			 if(dept != "") {
				 
				 CredentialService cs = new CredentialService();
				emp.setEmail(cs.generateEmailAddress(dept, emp));
				emp.setPassword(cs.generatePassword());
				cs.showCredentials(emp);
		}
		
			 sc.close();
		}
		}

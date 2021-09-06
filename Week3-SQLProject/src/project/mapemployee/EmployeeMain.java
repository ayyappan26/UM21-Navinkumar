package project.mapemployee;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String arg[]){
		EmployeeBusiness empbo=new EmployeeBusiness();
		empbo.empSystem();
		
	}

}
class Scan {
	public static  Scanner getScannerInstance(){
		Scanner scan=new Scanner(System.in);
		return scan;
		
	}
}

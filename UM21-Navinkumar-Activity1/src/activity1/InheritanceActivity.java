package activity1;

public class InheritanceActivity{
	public static void main(String arg[]){
		Manager mymanager=new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee mytrainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("The Salary of the Manager:");
		mymanager.calculateSalary();
		System.out.println("The Salary of the Trainee:");
		mytrainee.calculateSalary();
		//System.out.println(mymanager.basicSalary);
		mytrainee.transportAllowance(mytrainee.basicSalary);
		mymanager.transportAllowance(mymanager.basicSalary);
		
	}
}
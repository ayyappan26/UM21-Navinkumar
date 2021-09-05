package assignment.javaActivities;

class CalculationWork{
	
	public int calculateSum(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			if((i%3==0)||(i%5==0)){
				sum=sum+i;
			}
		}
		return sum;
	}
	
}
public class ActivitiesMain {
	public static void main(String arg[]){
		CalculationWork cals=new CalculationWork();
		int x=cals.calculateSum(10);
		System.out.println(x);
	}

}

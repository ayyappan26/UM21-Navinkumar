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
	public int calculateDifference(int n){
		int sum=0;
		int s=0;
		for(int i=1;i<=n;i++){
			s=i*1;
			sum=sum+s;
		}
		return sum;
	}
	
}
public class ActivitiesMain {
	public static void main(String arg[]){
		CalculationWork cals=new CalculationWork();
		int x=cals.calculateSum(10);
		System.out.println(x);
		int d=cals.calculateDifference(5);
		System.out.println(d);
		
	}

}

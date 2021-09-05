package assignment.javaActivities;

class Difference{
	public int calculateDiff(int n){
		int sum=0;
		int s=0;
		for(int i=1;i<=n;i++){
			s=i*i;
			sum=sum+s;
		}
		int sum1=0;
		for(int j=0;j<=n;j++){
			sum1=sum1+j;
		}
		int s3=sum1^2;
		int di=sum-s3;
		return di;
	}
}
public class CalculateDifference {
	public static void main(String arg[]){
		Difference dif=new Difference();
		int d=dif.calculateDiff(5);
		System.out.println(d);
	}

}

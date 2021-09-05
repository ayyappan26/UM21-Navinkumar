package assignment.javaActivities;

class MirrorWork{
	public String getImage(String st) {
		StringBuffer buf = new StringBuffer(st);
		buf.reverse();
		System.out.println("Earth" + "|" + buf);
		return st;
	}
}
public class MirrorImage {
	public  static void main(String arg[]){
		MirrorWork mir=new MirrorWork();
		String st="EARTH";
		mir.getImage(st);
	}
}

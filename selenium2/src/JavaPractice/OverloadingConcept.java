package JavaPractice;

public class OverloadingConcept {
	
	public int add(int a , int b) {
		
		return a+b;
	}

	public String add(String a, String b) {
		return a + b;
	}
	
	public double add(double a, double b, double c) {
		
		return a+b+c;
	}
	
	public static void main (String[] args) {
		OverloadingConcept OLC = new OverloadingConcept();
		
		System.out.println(OLC.add(5, 7));
		System.out.println(OLC.add("Krishna", "  sharma"));
		System.out.println(OLC.add(2.5, 3.5, 4.7));
		
	}
}

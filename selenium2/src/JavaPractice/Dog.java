package JavaPractice;

public class Dog extends Animal{
	
	public void sounds() {
		super.sounds();
		System.out.println("Dog Barks");
	}
	
	public static void main(String[] args) {
		
		Animal Dog = new Dog();
		
		Dog.sounds();
		

}
}

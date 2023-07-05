class Bird {
		public void fly() {
		System.out.println("The bird is flying.");
	}
	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
  public void details(){
		System.out.println("I am more then Human.");
	}

}
class Birdy{
	public int ft=50;
	public void insect(){
		System.out.println("Total feets"+ft);
	}
}

class Bixby extends Bird{
	public void details(){
		System.out.println("The Bixby is flying.");
	}
}

public class TestBird {
	public static void main(String[] args) {
		Bird myBird = new Bird();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);

		Bixby by=new Bixby();
		by.details();

		Birdy bd=new Birdy();
		bd.insect();
	}
}

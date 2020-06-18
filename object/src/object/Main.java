package object;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("ポチ", 5, 12.3);
		System.out.println("名前 : " + dog.name);
		System.out.println("年齢 : " + dog.age + "歳");
		System.out.println("体重 : " + dog.weight + "kg");
		dog.run();
		animal.sleep();
		dog.sleep();
	}

}

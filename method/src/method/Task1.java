package method;

public class Task1 {

	public static void main(String[] args) {
		myProfile("コラボ");
		myProfile(30,178.0);
	}
	public static void myProfile(String name) {
		System.out.println("私の名前は" + name + "です。");
	}
	public static void myProfile(int age, double se) {
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + se + "cmです。");
		System.out.println("よろしくお願いします");
		}
}

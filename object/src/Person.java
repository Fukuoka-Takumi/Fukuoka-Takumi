
public class Person {
	String name;
	int age;
	static int wallet;

	//引数なし 引数ありのコンストラクト
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int money) {
		Person.wallet += money;
	}
	public String geName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void getAge(int age) {
		this.age = age;
	}
	public void myProfile() {
		System.out.println("私の名前は" + this.name +  "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}

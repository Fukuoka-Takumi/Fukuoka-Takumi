package variable;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("変換前");
		int intNum = 219;
		System.out.println(intNum);
		double doubleNum = 364.2;
		System.out.println(doubleNum);
		long longNum = 123456L;
		System.out.println(longNum);
		System.out.println("変換後");
		long x =(long)intNum;
		System.out.println(x);
	    float y =(float)doubleNum;
		System.out.println(y);
		double z =(double)longNum;
		System.out.println(z);
	}
}

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String str = "ABCDGOPQRSYZ";
		System.out.print("探したい文字: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		sc.close();


		if(str.contains(a)) {
			System.out.println(str + "は" + a + "を含む");
		}else {
			System.out.println(str + "は" + a + "を含まない");
		}
	}

}

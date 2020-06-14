
public class Task3 {

	public static void main(String[] args) {
		String some = "文字列: ABCDEFG";
		System.out.println(some);

		for(int i = some.length() -1 ; i >= 0 ; i--) {
			System.out.print(some.charAt(i));
		}
	}
}
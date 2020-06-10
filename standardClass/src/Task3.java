
public class Task3 {

	public static void main(String[] args) {
		String some = "文字列: ABCDEFG";
		System.out.println(some);
		char[] someChar = some.toCharArray();
		int j = someChar.length - 1;
		char temp;
		for(int i = 0; i <= someChar.length / 2; i++) {
			temp = someChar[i];
			someChar[i] = someChar[j];
			someChar[j] = temp;
			j--;
		}
		some = new String(someChar);
		System.out.println(some);
	}
}

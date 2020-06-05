package method;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("--①文字列だけの場合---");
		String letter = add("文字列1", "文字列2");
		System.out.println(letter);

		System.out.println("---②整数だけの場合----");
		int integer = add(3, 5);
		System.out.println(integer);

		System.out.println("---③小数だけの場合----");
		double decimal= add(3.5, 5.5);
		System.out.println(decimal);
	}
	public static String add(String moji1, String moji2) {
		return moji1 + moji2;//6line addを足すだけ処理＋上に戻す
	}
	public static int add(int num1, int num2) {
		return num1 + num2;//11line addを足す
	}
	public static double add(double num1, double num2) {
		return num1 + num2;//15line addをたす
	}

}

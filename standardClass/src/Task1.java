
public class Task1 {

	public static void main(String[] args) {
		String str1 = " tech-compass ";
		String str2 = str1.trim();//空白削除
		String upperstr1 = str2.toUpperCase();//大文字変換

		System.out.println("変換前: " + str1);
		System.out.println("変換後: " + upperstr1);
	}
}

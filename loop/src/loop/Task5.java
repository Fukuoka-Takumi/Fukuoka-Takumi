package loop;

public class Task5 {

	public static void main(String[] args) {
		for(int i = 1; i<=9; i++){
			for(int a = 1; a <= 9; a++) {
				int kuku = i * a;
				System.out.print(" ");
				if(10 > kuku) {
					System.out.print(" ");
				}
				System.out.print(kuku);
			}
			System.out.println();
		}
	}
}
package array;

public class Task1 {

	public static void main(String[] args) {
		int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		System.out.print("配列: [");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > array[10]) {
				System.out.print(array[i] + ",");
			}else {
				System.out.println(array[10] + "]");
			}
		}
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		System.out.println("合計: " + sum);
	}
}
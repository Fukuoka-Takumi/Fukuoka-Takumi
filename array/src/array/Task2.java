package array;

public class Task2 {

	public static void main(String[] args) {
		int[] array =new int[7];
		for(int i = 0; i < array.length; i++) {
			 array[i]  = 7 - i;
		}
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
		for(int i = array.length-1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}
	}
}		
package method;

public class Task4 {

	public static void main(String[] args) {
		String[] trial1 = {"a", "b", "c",};
		String[] trial2 = {"a", null, "c",};

		System.out.println("---配列にnullがない場合---");
		System.out.println(nullCheck(trial1));//true or false
		System.out.println("---配列にnullがある場合---");
		System.out.println(nullCheck(trial2));//true or false
	}
	public static boolean nullCheck(String[] arrays) { //配列一つにする
		boolean b1 = false;//変数指定
		for(int i = 0; i < arrays.length; i++) {
			if(arrays[i] == null) { //nullがあったときtrueにする
				b1 = true;
			}
		}
		return b1;//falseが表示される、戻り指定、それ以降実行されない
	}		
}
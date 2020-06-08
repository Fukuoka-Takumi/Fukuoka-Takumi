package method;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("三角形の面積");
 //高さ,底辺 修正8行目に入れた ローワーキャメル
		System.out.println(getTriangleArea(135.0, 2.0)); //面積値
	}
	public static double getTriangleArea(double takasa, double tei) {
		return Math.round(takasa / tei * 2); //三角形の面積 上に戻す math.roundで四捨五入
	}

}

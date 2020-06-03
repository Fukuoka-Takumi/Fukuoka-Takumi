package method;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("三角形の面積");
		double Area = getTriangleArea(135.0, 2.0); //高さ,底辺
		System.out.println(Area); //面積値
	}
	public static double getTriangleArea(double takasa, double tei) {
		double Area = takasa / tei * 2; //三角形の面積
		return Area; //結果を上に戻す
	}

}

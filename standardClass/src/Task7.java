import java.util.Calendar;

public class Task7 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print("現在日時: " + cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + "月");
		System.out.println(cal.get(Calendar.DATE) + "日");
		
		cal.add(Calendar.DATE, 7);
		System.out.print("１週間後: " + cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + "月");
		System.out.println(cal.get(Calendar.DATE) + "日");
		
		cal.set(2021,5,12);
		System.out.print("１年後  : " + cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + "月");
		System.out.print(cal.get(Calendar.DATE) + "日");
		String[] week = new String[7];
		week[0] = "日";
		week[1] = "月";
		week[2] = "火";
		week[3] = "水";
		week[4] = "木";
		week[5] = "金";
		week[6] = "土";
		int week_int = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("(" + week[week_int - 1]  + ")");
	}
}
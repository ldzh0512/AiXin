package practise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetWeekday {
	public static void main(String[] args) {
		System.out.println(getWeekOfDate1(new Date()));
		System.out.println(getWeekOfDate2(new Date()));
	}
	
	/**
	 * 获取当前日期是星期几<br>
	 * 
	 * @param date 要查询的日期
	 * @return 该日期的星期
	 */
	public static String getWeekOfDate1(Date date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	public static String getWeekOfDate2(Date date) {
		SimpleDateFormat dateFM = new SimpleDateFormat("E");
		String currSun = dateFM.format(date);
		return currSun;
	}
}

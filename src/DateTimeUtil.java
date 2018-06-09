import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
* 日期时间工具类
*/
public final class DateTimeUtil{
private DateTimeUtil(){}
private static String DATE_FORMAT_PATTERN = "yyyyMMdd";
private static String TIME_FORMAT_PATTERN = "HHmmss";
public static void main (String []args){
	        String currentData= getSystemDate(); // 返回当前日期，格式为yyyy-MM-ddDateTimeUtils.
			String beforeFiveDays = addDays(currentData, -5); //前五天DateTimeUtils.
			String afterFiveDays =addDays(currentData, 5); //后五天 DateTimeUtils.
			System.out.println(currentData+"now"+""+beforeFiveDays+"qian"+""+afterFiveDays+"");
}
/**
* 转换字符串为日期
*
* @param source
* 字符串形式的日期表示
* @return Date
*/
public static Date toDateTime(String source, String pattern){
Date date = null;
try
{
SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
date = dateFormat.parse(source);
}
catch (ParseException e)
{
// nothing
}
return date;
}
/**
* 转换字符串为日期
*
* @param source
* 字符串形式的日期<code>yyyyMMdd</code>
* @return Date
*/
public static Date toDate(String source)
{
return toDateTime(source, DATE_FORMAT_PATTERN);
}
/**
* 转换字符串为时间
*
* @param source
* 字符串形式的时间<code>HHmmss</code>
* @return Date
*/
public static Date toTime(String source)
{
return toDateTime(source, TIME_FORMAT_PATTERN);
}
/**
* 将一种形式的字符串日期转换为另一种形式的字符串日期
*
* @param source
* 原日期字符串
* @param fromPattern
* 原日期字符串格式
* @param toPattern
* 目标日期字符串格式
* @return 新的日期字符串
*/
public static String convert(String source, String fromPattern, String toPattern)
{
Date date = toDateTime(source, fromPattern);
if (date == null)
{
return null;
}
SimpleDateFormat dateFormat = new SimpleDateFormat(toPattern);
return dateFormat.format(date);
}
/**
* 在指定的日期上面增加指定的天数
*
* @param source
* 源日期(yyyyMMdd)
* @param days
* 天数,正负皆可
* @return
*/
public static String addDays(String source, int days)
{
Date date = toDate(source);
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
calendar.add(Calendar.DATE, days);
SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
return dateFormat.format(calendar.getTime());
}
/**
* 在指定的日期上面增加指定的月数
*
* @param source
* 原日期(yyyyMMdd)
* @param months
* 月数,正负皆可
* @return
*/
public static String addMonth(String source , int months)
{
Date date = toDate(source);
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
calendar.add(Calendar.MONTH, months);
SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
return dateFormat.format(calendar.getTime());
}
/**
* 在指定的日期上面增加指定的年数
*
* @param source
* 原日期(yyyyMMdd)
* @param years
* 年数,正负皆可
* @return
*/
public static String addYears(String source, int years)
{
Date date = toDate(source);
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
calendar.add(Calendar.YEAR, years);
SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
return dateFormat.format(calendar.getTime());
}
/**
* 返回指定格式的时间字符串
*
* @param format
* (返回字符串的格式)
* @return dateStr
* @throws ParseException
*/
public static String getSystemDateTime(String format)
{
Date date = new Date();
SimpleDateFormat simpDate = new SimpleDateFormat(format);
String dateStr = simpDate.format(date);
return dateStr;
}
/**
* 取当前日期,格式yyyyMMdd
*
* @return
*/
public static String getSystemDate()
{
return getSystemDateTime(DATE_FORMAT_PATTERN);
}
/**
* 取当前时间,格式HHmmss
*
* @return
*/
public static String getSystemTime()
{
return getSystemDateTime(TIME_FORMAT_PATTERN);
}
/**
* 格式化指定日期
*
* @param date
* 日期
* @param pattern
* 格式串
* @return
*/
public static String format(Date date, String pattern)
{
SimpleDateFormat simpDate = new SimpleDateFormat(pattern);
String dateStr = simpDate.format(date);
return dateStr;
}
/**
* 格式化指定日期
*
* @param date
* 日期
* @param pattern
* 格式串
* @return
*/
public static String format(long date, String pattern)
{
Date date2 = new Date(date);
return format(date2, pattern);
}
}
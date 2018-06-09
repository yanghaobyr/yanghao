import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

public class Try {

 

    public static void main(String[] args) throws ParseException {

        String time="2018-05-08 14:12";//设置时间

        String hourTime,dayTime,monthTime,yearTime;

        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date e;

        e = sdf.parse(time);

        c.setTime(e);

      System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+"/"+c.get(Calendar.MONTH));//获得时,分,月(0为1月)

        int d=(c.get(Calendar.HOUR_OF_DAY)*60+c.get(Calendar.MINUTE))/5;//多少个5分钟

        if (c.get(Calendar.HOUR_OF_DAY) >= 12) {

            c.set(Calendar.MINUTE, 0);

            c.set(Calendar.SECOND, 0);

            c.add(Calendar.HOUR_OF_DAY,0);//-1取之前一个小时整点，0取当前一个小时整点，以此类推.

            hourTime = dateToString(c.getTime(),

                    "yyyy-MM-dd HH:mm:ss");

 

        } else {

            c.set(Calendar.MINUTE, 0);

            c.set(Calendar.SECOND, 0);

            c.add(Calendar.HOUR_OF_DAY,0);//-1取之前一个小时整点，0取当前一个小时整点，以此类推

            hourTime = dateToString(c.getTime(),

                    "yyyy-MM-dd HH:mm:ss");

        }

       

         System.out.println(hourTime+"//"+d);

         if (c.get(Calendar.HOUR_OF_DAY) >= 12) {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);//0取上一个月最后一天 1取这个月第一天，以此类推.

                dayTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

 

            } else {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);//0取上一个月最后一天 1取这个月第一天，以此类推.

                dayTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

            }

         System.out.println(dayTime+"//");

         

         if (c.get(Calendar.HOUR_OF_DAY) >= 12) {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);

                c.set(Calendar.MONTH,0);//在控制天数的情况下,进行控制月份，0为1月， 1为2月 ，以此类推

                monthTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

 

            } else {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);

                c.set(Calendar.MONTH,0);//在控制天数的情况下,进行控制月份，0为1月， 1为2月， 以此类推

                monthTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

            }

         System.out.println(monthTime+"//");

         if (c.get(Calendar.HOUR_OF_DAY) >= 12) {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);

                c.add(Calendar.YEAR,1);//在控制天数的情况下,进行控制月份，0为今年， 1为加一年 ，以此类推

                yearTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

 

            } else {

                c.set(Calendar.MINUTE, 0);

                c.set(Calendar.SECOND, 0);

                c.set(Calendar.DAY_OF_MONTH,1);

                c.add(Calendar.YEAR,1);//在控制天数的情况下,进行控制月份，0为今年， 1为加一年 ，以此类推

                yearTime = dateToString(c.getTime(),

                        "yyyy-MM-dd HH:mm:ss");

            }

         System.out.println(yearTime+"//");

    }

    public static String dateToString(Date date, String formatString) {

        if (formatString == null || formatString.equals(""))

            formatString = "yyyy-MM-dd HH:mm:ss";

        try {

            SimpleDateFormat sdf = new SimpleDateFormat(formatString);

            return sdf.format(date);

        } catch (Exception e) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            return sdf.format(date);

        }

    }

    public static Date stringToDate(String strDate, Date defaultValue) {

        return stringToDate(strDate, "yyyy-MM-dd HH:mm:ss", defaultValue);

    }

    public static Date stringToDate(String strDate, String formatString,

            Date defaultValue) {

        if (formatString == null || formatString.equals(""))

            formatString = "yyyy-MM-dd HH:mm:ss";

        try {

            SimpleDateFormat sdf = new SimpleDateFormat(formatString);

            return sdf.parse(strDate);

        } catch (Exception e) {

            return defaultValue;

        }

    }

 

}
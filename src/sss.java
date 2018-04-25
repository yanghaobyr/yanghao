import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.Socket;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*package com.cnpc.framework.utils;

import com.fh.util.DateUtil;

public class sss {
	public static void main(String[]args)throws Exception {
		int[] arr = {2,9,6,7,4,1} ;
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
	static void bubbleSort(int[] arr) {
		//第一轮
		for(int times = 0 ; times <= arr.length ; times ++ ) {
			for(int i = 0 ; i < arr.length - times ; i ++) {
				try {
					if(arr[i] > arr[i-1] ) {
						swap(arr , i , i+1);
					}
				} catch (Exception e) {
					System.out.println(i);
					
				}
		   }
		
		}
		
	}
	
	static void swap(int[] arr ,int index1,int index2) {
		int map = arr[index1] ;
		arr[index1] = arr[index2] ;
		arr[index2] = map ;
	}
	
	
	
	
	static void printArray(int[] arr) {
		if(arr == null) {
			System.out.println("null");
			return ;  //结束方法
		}
		String ret = "[" ;
		for(int index = 0 ; index < arr.length ; index ++ ) {
			ret = ret + arr[index] ;
			if(index != arr.length - 1) {
				ret = ret + "," ;
			}
			
		}
		ret = ret + "]" ;
		System.out.println(ret);
		
		
	}
	
	
}*/




/*package com.cnpc.framework.utils;

public class sss{
	public static void main(String []args) throws Exception {
		
		    System.out.println("123456789012345".replaceAll("\\d{4}(?!$)", "$0 "));
	        System.out.println("1234567890123456".replaceAll("\\d{4}(?!$)", "$0 "));
	        System.out.println("12345678901234567".replaceAll("\\d{4}(?!$)", "$0 "));
	        System.out.println("123456789012345678".replaceAll("\\d{4}(?!$)", "$0 "));
	        
	        String bankAccount="1234567890987654321";
	        int length=bankAccount.length();
	        String str=bankAccount.substring(0, length-11)+"*******"+bankAccount.substring(length-4);
	        System.out.println(str);
	        
	        
	        String name="weicc-20100107-00001";
	        System.out.println(name.substring(name.length()-5));//输出00001
	        
	        String name1="weicc-20100107-00001";
	        System.out.println(name.substring(name1.length()-5,name1.length()));//输出00001
	        
	        String str1="weicc-20100107-00001";
	        String newStr=str1.substring(str1.length()-5);
	        System.out.println(newStr);
	        
	        String bankAccount6="123456789091212212";                     
	        String str5= bankAccount6.substring(0,5);
	        System.out.println(str5);
	        
	    
	        
	}
}*/

public  class sss {
	public static void main (String[] args) throws Exception{
		
		double   fyh   =   111231.5585;  
		BigDecimal  byh =   new   BigDecimal(fyh);  
		double   f1yh   =   byh.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();  
		System.out.println(f1yh);
		
		double x111=23.5455; 
		NumberFormat ddf1=NumberFormat.getNumberInstance() ;
		ddf1.setMaximumFractionDigits(2); 
		String s222= ddf1.format(x111) ; 
		System.out.println(s222); 
		
		DecimalFormat df=new DecimalFormat(".##");
		double d=1252.2563;
		String st=df.format(d);
		System.out.println(st+"\n"+" 111");
		
		    Set set=new HashSet();
		    set.add(new Date());    //向列表中添加数据

		    set.add("apple");     //向列表中添加数据

		    set.add(new Socket());    //向列表中添加数据

		    int size=set.size();
		    System.out.println("Set集合的大小为：" + size);

		    set.clear();

		    System.out.println("执行clear方法后Set集合的大小为：" + set.size());
	        System.out.println(DateUtil.getTime());
	       
	       String Mtext="ninhao!123您好！";//中文加密解密
	       Mtext=java.net.URLEncoder.encode(Mtext,"GBK");   
	       byte ptext[]=Mtext.getBytes("GBK");//将字符串转换成byte类型数组，实质是各个字符的二进制形式  
	       BigInteger m=new BigInteger(ptext);//二进制串转换为一个大整数  
	       System.out.println(m);
	       byte[]mt=m.toByteArray();//m为密文的BigInteger类型  
	       System.out.println(mt);
	       String str=(new String(mt,"GBK")); 
	       System.out.println(str);
	       str=java.net.URLDecoder.decode(str,"GBK");   
	         
	         
	       System.out.println(str);  
	       
	       String []list={"ma","cao","yuan"};
	       String a="macaoyuan";
	       System.out.println(list.length);
	       System.out.println(a.length());

	       List array=new ArrayList();
	       array.add(a);
	       System.out.println(array.size());
	       
	       
	       String s = "I AM an Object!"; 
	       
	       Integer hah =44;
	       
	       Boolean haha=true;
	       System.out.println(haha.getClass().getName());
	       if("java.lang.Integer".equalsIgnoreCase((hah.getClass().getName()))){
	    	   System.out.println("对啦");
	       }
	       
	       System.out.println(hah.getClass().getName());
	       System.out.println(s.getClass().getName()); 
		
	       
	       Object sos = "I AM an Object!"; 
	       boolean isObject = sos instanceof Integer; 
	       boolean isObject1 = sos instanceof String; 
	       if(isObject)
	       {
	       System.out.println(sos);
	       }else{
	    	   System.out.println("eee！");
	       }
	       if(isObject1)
	       {
	       System.out.println(sos);
	       }else{
	    	   System.out.println("eee！");
	       }
	      
	        String good;
	        boolean isObject1666 = "good".equals("good"); 
	       if(isObject1666){
	    	   System.out.println("对啦");
	       }
	       
	       int i=1; //int类型变量
	       String ert; 
	       System.out.println(getType("ert")); //打印变量类型为int
	       
	       
	       String type = getType("123");  
	       System.out.println(type.substring(type.lastIndexOf('.')+1, type.length())); 
	       
	       int [] shdz = {1,2,3,3,3,3,3,4};
	       StringBuilder sb23=new StringBuilder();
	       for(int a666 : shdz){
	    	   sb23.append(a666);
	   		System.out.println(a666);
	   	  }
	       String result23=sb23.toString();
	       System.out.println(result23);
	       
	       String[] arrs=new String[]{"1","2","3","4","5"};
	       StringBuilder sb=new StringBuilder();
	       for(String sww:arrs){
	           sb.append(sww);
	       }
	       String result=sb.toString();
	       System.out.println(result);
	         
	       //整形数组
	       int[] arrs2=new int[]{1,2,3,4,5};
	       StringBuilder sb2=new StringBuilder();
	       for(int num:arrs2){
	    	   System.out.println(num);
	           sb2.append(num);
	       }
	       String result2=sb2.toString();
	       System.out.println(result2);
	       
	       int ccc = 0;
	       int[] x = { 1, 2, 3 };
	       for (int y = 0; y < x.length; y++) {
	    	    ccc = x[y];
	    	  
	           System.out.println(x[y]);
	       }
	       
	       String reqDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	       System.out.println(reqDate);
	       
	       StringBuffer s4 = new StringBuffer(); 
	       String ac="555";
	       String xv="mmmm";
	       String aaa="666";
	       s4.append(ac);
	       s4.append(xv);
	       s4.insert(0, aaa);
	       System.out.println(s4);
	       String asde=ac+" "+xv;
	       System.out.println(asde);
	       String aa = "121212";
	       char[] ss = aa.toCharArray();
		System.out.println(ss);
	
		sss toSting = new sss();
		toSting.AddString("aaa");
		toSting.AddString("bbb");
		System.out.println(toSting.getValue());
		
		int wc = 1;
		String ggg = String.valueOf(wc * 2);
		System.out.println(ggg);
		
		String str666 = "0000012345";
		int i666 = Integer.parseInt(str666);
		System.out.println(i666);
	
		Map<String, Object> dd = new HashMap<String, Object>();
		dd.put("FHZT", 123456.6362532525);// .03
		Object ob = dd.get("FHZT");
		Double dddd = Double.valueOf(ob.toString());
		System.out.println(dddd * 3);
		Double asasasa = (Double) ob;
		System.out.println(Math.round(asasasa));
		double f = (double) ob;
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, RoundingMode.HALF_UP).doubleValue();
		System.out.println(f1+" +++");
		
		
		
		  // create 3 BigInteger objects
        BigInteger bi1, bi2, bi3;

        bi1 = new BigInteger("7");
        bi2 = new BigInteger("20");

        // multiply bi1 with bi2 and assign result to bi3
	bi3 = bi1.multiply(bi2);

        String str666888 = bi1 + " * " + bi2 + " = " +bi3;

	// print bi3 value
	System.out.println("Multiplication result is " +str666888);
		
	// create 3 BigDecimal objects
    BigDecimal bg1, bg2, bg3;

    bg1 = new BigDecimal("100.123");
    bg2 = new BigDecimal("50.56");

    // subtract bg1 with bg2 and assign result to bg3
    bg3 = bg1.subtract(bg2);
	Calendar calendar=Calendar.getInstance();

String str888666 = "The Result of Subtraction is " + bg3;
int nian=calendar.get(Calendar.YEAR);
java.sql.Date time = new java.sql.Date(getCurrYearLast(nian).getTime());
System.out.println(time);
    // print bg3 value
    System.out.println( str888666 );

		/*SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date ddqqq = new Date();
		String regtage = df.format(ddqqq);
		System.out.println("kaishile++++++++++++++++++");
		System.out.println(regtage);
		Date enddate;
		Date date666;
		date666 = df.parse(regtage);
		System.out.println(date666);
		String[] partdate = regtage.split("/");
		int yy = Integer.parseInt(partdate[0]);
		int mm = Integer.parseInt(partdate[1]);
		int ddeee = Integer.parseInt(partdate[2]);
		System.out.println(yy+" "+ mm +" "+ddeee);
		mm = mm + 1;
		if (mm > 12) {
			yy = yy + 1;
			mm = 1;
		}
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, yy);
		System.out.println(cal);
		cal.set(Calendar.MONTH, mm - 1);// Java月份才0开始算 6代表上一个月7月
		System.out.println(cal);
		int dateOfMonth = cal.getActualMaximum(Calendar.DATE);
		System.out.println(dateOfMonth);
		if (ddeee > dateOfMonth) {
			ddeee = dateOfMonth;
		}
		String enddatestr = yy + "/" + mm + "/" + ddeee;
		enddate = df.parse(enddatestr);
		System.out.println(enddate);
		
		System.out.println("jieshule++++++++++++++++++");*/

		     String hello = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			 System.err.println(hello+"666");
		     Calendar calendar22=Calendar.getInstance();
		     calendar22.setTime(new Date());
		     System.out.println("现在时间是："+new Date());
		     String year=String.valueOf(calendar22.get(Calendar.YEAR));
		     String month=String.valueOf(calendar22.get(Calendar.MONTH)+1);
		     String day=String.valueOf(calendar22.get(Calendar.DAY_OF_MONTH));
		     String week=String.valueOf(calendar22.get(Calendar.DAY_OF_WEEK)-1);
		     System.out.println("现在时间是："+year+"年"+month+"月"+day+"日，星期"+week);
		     long now=calendar22.getTimeInMillis();
		     calendar22.set(1994,6,7);//这里与真实的月份之间相差1
		     long year1994=calendar22.getTimeInMillis();
		     long days=(now-year1994)/(1000*60*60*24);
		     System.out.println("今天和1994年7月7日相隔"+days+"天，"+"也就是说我在这个美丽的星球上已经幸福的生活了"+days+"天。");
		// Integer b = Integer.parseInt(ob.toString());
		/*
		 * int hhhh = b * 3; System.out.println(hhhh); System.out.println(b *
		 * 3);
		 */

		/*
		 * DecimalFormat df = new DecimalFormat("#.00"); String strMoney
		 * =df.format((new BigDecimal(hhhh).setScale(2,
		 * BigDecimal.ROUND_HALF_UP)));
		 */
		 
		     
		String IP = InetAddress.getLocalHost().toString();
		System.out.println(IP);
		/*BigDecimal d = new BigDecimal(100000); // 存款
		BigDecimal r = new BigDecimal(0.001875 * 3); // 利息
		BigDecimal i11 = d.multiply(r).setScale(2, RoundingMode.HALF_EVEN); // 使用银行家算法
		System.out.println("季利息是：" + i11);

		System.out.println("123456789012345".replaceAll("\\d{4}(?!$)", "$0 "));*/
		};
	
	//1234 5678 9012 345
		public static String getType(Object o) { // 获取变量类型方法
			return o.getClass().toString(); // 使用int类型的getClass()方法
		}
	
		private ArrayList<String> StringList = null;
	
		private StringBuilder tempString = null;
	
		public sss() {
			StringList = new ArrayList<String>();
			tempString = new StringBuilder();
		}
	
		public void AddString(String value) {
			StringList.add(value);
		}
	
		public String getValue() {
			tempString.append("{");
			for (String temp : StringList) {
				tempString.append("\"").append(temp).append("\",");
			}
			String temp_1 = tempString.toString();
			temp_1 = (String) temp_1.substring(0, temp_1.length() - 1);
			temp_1 = temp_1 + "}";
			return temp_1;
		}
		
		public static Date getCurrYearLast(int year){
			Calendar calendar = Calendar.getInstance();
			calendar.clear();
			calendar.set(Calendar.YEAR, year);
			calendar.roll(Calendar.DAY_OF_YEAR, -1);
			Date currYearLast = calendar.getTime();

			return currYearLast;
			}
}
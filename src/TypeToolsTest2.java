import java.util.Date;

public class TypeToolsTest2 {
	    private static int ii=0;  
	    private static Date d=new Date();  
	    private static String good;   
	    
	    public static void main(String[] args) throws Exception  
	    {  
	        //补充一：获得成员变量的类型  
	        System.out.println(TypeToolsTest2.class.getDeclaredField("ii").getType());   
	        System.out.println(TypeToolsTest2.class.getDeclaredField("d").getType());   
	        System.out.println("----------------------");  
	          
	        //补充二：isInstance可判断出包装类型，从而得知基本类型  
	        System.out.println(Integer.class.isInstance(ii));  
	        System.out.println(Date.class.isInstance(d));
	        if (Date.class.isInstance(d)==true) {
				System.out.println("好的");
			}
	        System.out.println(String.class.isInstance("good"));
	        System.out.println("----------------------");  
	          
	        //补充三：泛型方式判断类型  
	        System.out.println(TypeToolsGenerics.getType(ii));  
	        System.out.println(TypeToolsGenerics.getType(2.2));  
	        System.out.println(TypeToolsGenerics.getType(true));  
	        System.out.println(TypeToolsGenerics.getType('a'));  
	        System.out.println(TypeToolsGenerics.getType(d));
	        System.out.println(TypeToolsGenerics.getType("d"));  

	    }  
}

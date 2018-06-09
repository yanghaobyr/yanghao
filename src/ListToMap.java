import java.beans.BeanInfo;  
import java.beans.IntrospectionException;  
import java.beans.Introspector;  
import java.beans.PropertyDescriptor;  
import java.lang.reflect.Method;  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
import org.apache.commons.beanutils.BeanUtils;  
  
public class ListToMap {  
    public static class DemoClass{  
        private Integer id;  
        private String name;  
        public DemoClass(){}  
        public DemoClass(Integer id, String name) {  
            super();  
            this.id = id;  
            this.name = name;  
        }  
        public Integer getId() {  
            return id;  
        }  
        public void setId(Integer id) {  
            this.id = id;  
        }  
        public String getName() {  
            return name;  
        }  
        public void setName(String name) {  
            this.name = name;  
        }      
    }  
      
    public static <K, V> Map<K, V> list2Map1(List<V> list, String fieldName4Key) {  
        Map<K, V> map = new HashMap<K, V>();  
        if (list != null) {  
            try {  
                for (int i = 0; i < list.size(); i++) {  
                    V value = list.get(i);  
                    @SuppressWarnings("unchecked")  
                    K k = (K) BeanUtils.getProperty(value, fieldName4Key);  
                    map.put(k, value);  
                }  
            } catch (Exception e) {  
                throw new IllegalArgumentException("field can't match the key!");  
            }  
        }  
  
        return map;  
    }  
    /** 
     * transfer list into map 
     * @param list 
     * @param fieldName4Key 
     * @return map 
     *  
     * @author sherlock 
     * @date 2016-9-16 12:58:53 
     */  
    public static <K, V> Map<K, V> list2Map2(List<V> list, String fieldName4Key,Class<V> c) {  
        Map<K, V> map = new HashMap<K, V>();  
        if (list != null) {  
            try {  
                PropertyDescriptor propDesc = new PropertyDescriptor(fieldName4Key, c);  
                Method methodGetKey = propDesc.getReadMethod();  
                for (int i = 0; i < list.size(); i++) {  
                    V value = list.get(i);  
                    @SuppressWarnings("unchecked")  
                    K key = (K) methodGetKey.invoke(list.get(i));  
                    map.put(key, value);  
                }  
            } catch (Exception e) {  
                throw new IllegalArgumentException("field can't match the key!");  
            }  
        }  
  
        return map;  
    }  
      
    public static <K, V> Map<K, V> list2Map3(List<V> list, String keyMethodName,Class<V> c) {  
        Map<K, V> map = new HashMap<K, V>();  
        if (list != null) {  
            try {  
                Method methodGetKey = c.getMethod(keyMethodName);  
                for (int i = 0; i < list.size(); i++) {  
                    V value = list.get(i);  
                    @SuppressWarnings("unchecked")  
                    K key = (K) methodGetKey.invoke(list.get(i));  
                    map.put(key, value);  
                }  
            } catch (Exception e) {  
                throw new IllegalArgumentException("field can't match the key!");  
            }  
        }  
  
        return map;  
    }  
  
    public static Map<Integer, DemoClass> traditionalWay(List<DemoClass> list) {  
        Map<Integer, DemoClass> map = new HashMap<Integer, DemoClass>();  
        if (list != null) {  
            for (int i = 0; i < list.size(); i++) {  
                DemoClass value = list.get(i);  
                map.put(value.getId(), value);  
            }  
        }  
  
        return map;  
    }  
    public static void main(String[] args) throws Exception{  
        List<DemoClass> list = new ArrayList<>();  
        for (int i = 0; i < 1000000; i++) {  
            list.add(new DemoClass(i,"aaa"));  
        }  
        long start1 = System.nanoTime();  
        //list2Map1(list,"id");  //2265651285  
        //list2Map2(list,"id",DemoClass.class); //95193405    
         list2Map3(list,"getId",DemoClass.class);  
        //Map<Integer,DemoClass> map = traditionalWay(list); //75825131  
        long end1 = System.nanoTime();  
          
        System.out.println(end1 - start1);  
    }  
}  
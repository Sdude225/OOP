package lab5;
import java.lang.reflect.*;

public class Utilities {
	
	public static void printFields(Object obj, boolean superFields) throws Exception {
	    Class<?> objClass = obj.getClass(); 
	    Field[] fields;
	
	    fields = objClass.getDeclaredFields();

	    for(Field field : fields) {
	        String name = field.getName();
	        Object value = field.get(obj);

	        System.out.println(name + ": " + value.toString());
	    }
	    
	    fields = objClass.getFields();

	    for(Field field : fields) {
	        String name = field.getName();
	        Object value = field.get(obj);

	        System.out.println(name + ": " + value.toString());
	    }
	}

}

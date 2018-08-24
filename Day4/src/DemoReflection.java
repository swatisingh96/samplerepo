import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class DemoReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class class1;
		try {
			class1= Class.forName("java.lang.String");
			System.out.println("name:-"+class1.getCanonicalName());
			Constructor[] constructors = class1.getConstructors();
			for(Constructor constr: constructors) {
				Type [] types = constr.getGenericParameterTypes();
				for(Type t: types) {
					System.out.println(t.getTypeName()+"\t");
				
				}
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}

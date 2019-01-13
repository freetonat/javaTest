package anno_test;

import java.lang.reflect.Method;

public class TestRealAnno {
	
	public static void main(String[] args) {
		TestUseAnno tua = new TestUseAnno();
		
		try {
			Method m = tua.getClass().getDeclaredMethod("UseAnno");
			System.out.println("m = " + m);
			System.out.println("isAnno = " + m.isAnnotationPresent(TestAnno.class));
			if(m.isAnnotationPresent(TestAnno.class))
			{
				tua.UseAnno();
			}
		} catch (NoSuchMethodException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * implement through reflection
 */
public class Calculate {

    public static int calc(int a, int b) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class arithmetic = Arithmetic.class;
        Method m = arithmetic.getMethod("add", int.class, int.class);

        Object o1 = arithmetic.getDeclaredConstructor().newInstance();
        System.out.println("My superclass is: " + o1.getClass().getName());
        System.out.println(m.invoke(o1, a, b).toString());
        return (Integer) m.invoke(o1, a, b);
    }

}

package week03.class04;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) {
        Method[] methods = Service.class.getDeclaredMethods();

        for (Method method: methods) {
            // check PrintAnnotation
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
                // print method name
                System.out.println("method.getName() = " + method.getName());
                // print divider
                for (int i = 0; i < printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    // call method
                    method.invoke(new Service());
                } catch (Exception e) {}
                System.out.println();
            }
        }
    }
}

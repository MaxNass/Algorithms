package new_In_Java_8;

import java.io.File;
import java.io.FileFilter;

public class AnonymousAndLambdaClass {

    public static void main (String[] args) {


        // The type of a Lambda expression is a Functional Interface
        // Functional Interface = Only one abstract method + default method and Static method does not count + Method from the Object Class dont count

        // @FunctionalInterface (no mandatory) The compiler will tell us if an annotated interface is functional or not

        // We can put a Lambda expression in a variable (can be an argument or return value of a method)

        // A lambda expression is not an object (its new object object without his identity = not a regular object)

        // A lot of functional Interfaces added in Java.Util.Function.
        // 4 categories (Consumer(Object param return nothing), Supplier(no param return Object, Predicate(object as param and return boolean, function(object as param return object))

        // Anonymous class = because don't have a name and put the code where the code will be executed
        // Lambda expressions are created to make anonymous class easier to write and read!
        FileFilter fileFilter = new FileFilter() {

            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        // Anonymous class to a lambda expression
        FileFilter fileFilter1 = (File file) -> file.getName().endsWith(".java");

        File directory = new File("/MaxNass/");

        Runnable runnableLambda = () -> {
            for (int i = 0; i<=3; i++) {
                System.out.println("something");
            }
        };

    }


}

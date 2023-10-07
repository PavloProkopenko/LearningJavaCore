package wrapperClasses;

public class wrapperClasses {
    public static void main(String[] args) {
        int x = 1;
        Integer x2 = 123; // wrap
        System.out.println(x2);
        x2 = Integer.parseInt("123321");
        System.out.println(x2);
        int someNumber = x2; // Unwrap
        // Double, Float, Long, Short, Byte, Character, Boolean
        // You can use this, if you want to do some operations with value, if you not - use primitive types
    }
}

package longToInt;

public class longToInt {
    public static void main(String[] args) {
        float number = 12.2f; // If we want to make float variable in Java
//        we should put f (or F) at the end. Default for number with point is double type
        int a = 123;

        long newLongNumber = a;
        a = (int)newLongNumber; // we can't do this without brackets and type of value in it

    }
}

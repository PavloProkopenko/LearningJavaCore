package stringBuilder;
//Working with string class
public class Main {
    public static void main(String[] args) {
        String example1 = new String("       example1      "); // we can initialize String variable like this
        String example2 = "example2"; // or like this

        System.out.println(example1.trim());

        System.out.printf("You will be programmer %d percent", 100); // You can write your line like in C language

        Test example = new Test("Example");
        System.out.println("\n"+example.toString());
    }

}
class Test {
    String name;

    public Test(String name){
        this.name = name;
    }
}

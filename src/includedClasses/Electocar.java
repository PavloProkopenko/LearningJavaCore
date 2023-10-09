package includedClasses;

public class Electocar {
    private int id;
    // included non-static class
    private class Engine {
        public void startEngine() {
            System.out.println("Engine" + id + "is starting...");
        }
    }

    // included static class
    public static class Battery {
        public void charging(){
            System.out.println("Battery is charging...");
        }
    }
    public Electocar(int id){
        this.id = id;
    }

    public void start(){
        Engine carEngine = new Engine();
        carEngine.startEngine();
        System.out.println("Electrocar" + id + "is starting...");
    }
}

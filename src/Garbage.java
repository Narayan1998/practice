import exceptions.First;

public class Garbage {
    public static void main(String[] args) {
        First obj = new First();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()
        // System.gc();
        Runtime.getRuntime().gc();
        System.out.println("End of the garbage collection");
    }

    // defining the finalize method
    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}

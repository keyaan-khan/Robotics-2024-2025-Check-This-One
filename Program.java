public class Program {
    public static void main(String[] args) {
        
        final String immutableVariable = "Immutable String";

        int[] mutableVariable = {1, 2, 3};

        System.out.println("Immutable variable: " + immutableVariable);

        System.out.print("Mutable variable: ");

        System.out.println(java.util.Arrays.toString(mutableVariable));
    }
}


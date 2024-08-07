public class Program {
    public static void main(String[] args) {
        
        final int[] immutableVariable = {1, 2, 3};

        
        int[] mutableVariable = {1, 2, 3};

        
        System.out.print("Immutable variable: ");
        for (int i : immutableVariable) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Mutable variable: ");
        for (int i : mutableVariable) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

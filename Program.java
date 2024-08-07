public class Program {
    public static void main(String[] args) {
        double x = 111; 

        if (x < 100) {
            x = x + 50;
        }

    
        if (x > 100) {
            x = x / 20;
        }

       
        System.out.println("Final value of x: " + x);
    }
}

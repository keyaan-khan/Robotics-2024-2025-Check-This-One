public class Program {
    public static void main(String[] args) {
        int x = 80; 

        
        if (x < 100) {
            x = x + 50;
        }

        
        if (x > 100) {
            x = x / 20;
        }

       
        System.out.println("Final value of x: " + x);
    }
}

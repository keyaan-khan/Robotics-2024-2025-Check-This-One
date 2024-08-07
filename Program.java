public class Program {
    public static void main(String[] args) {
        double x = 80.5;

        if (x < 100) {
            x = x + 50.5;
        }

        if (x >= 100) {
            if (x <= 150) {
                x = x / 20.0;
            } else {
                x = x % 20.0;
            }
        }

        if (x == 0) {
            x = x + 100.0;
        } else if (x < 10) {
            x = x * 10.0;
        } else {
            x = x - 5.0;
        }

        System.out.println("final value of x: " + x);
    }
}


// Prime.java
public class Prime {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Prime <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

package branching;

public class quizDoubt {
    public static void main(String[] args) {
        int x = 5;
        // int y = ++x * 2 - 4; // increments the x and also calls incremented x
        int y = x++ * 2 - 4; // increments the x in the memory but uses the value that wa previously
                             // initiated

        if (x < y) {
            System.out.println("x < y");
        } else if (x > y) {
            System.out.println("x > y");
        } else {
            System.out.println("x == y");
        }
    }
}

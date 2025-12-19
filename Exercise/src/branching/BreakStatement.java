package branching;

public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("---------------SwitchCase---------------------");
        int a = 0;
        switch (a) {
            case 0:
                System.out.println("Hi");
                break;
            case 1:
                System.out.println("Hello");
                break;

            default:
                break;
        }

        System.out.println("--------------------------forLoop--------------------------");
        for (int i = 0; i < 7; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}

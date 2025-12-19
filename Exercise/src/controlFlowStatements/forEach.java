package controlFlowStatements;

public class forEach {
    public static void main(String[] args) {
        int numbers[] = { 4, 6, 5, 8, -3 };
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        char letters[] = { 'h', 'e', 'l', 'l', 'o' };
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

        System.out.println("calculating sum upto n");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The Sum is : " + sum);
    }
}

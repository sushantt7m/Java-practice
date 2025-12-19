package controlFlowStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 5);
        System.out.println("The last value of i :" + i);

        int age = 15;
        do {
            age--;
            while (age > 20) {
                System.out.println("age : " + age);
                age++;
            }
        } while (age < 15);

    }

}

package branching;

public class labelledLoop {
    public static void main(String[] args) {
        // labelled loops
        // outerLoop:for (int i = 1; i <= 3; i++) {
        // // innerloop
        // innerLoop:for (int j = 1; j <= 3; j++) {
        // System.out.println("OuterLoop: " + i + " innerLoop : " + j);
        // if (i == 2 && j == 2) {
        // break outerLoop;
        // }
        // }
        // }

        /*
         * String animals[] = { "Cat", "Dog", "Cow", "Lion", "Rabbit" };
         * int index = 0;
         * String animal = null;
         * 
         * animalsLoop: while (index < animals.length) {
         * animal = animals[index];
         * if (animal == "Lion") {
         * System.out.println(animal);
         * break animalsLoop;
         * }
         * index++;
         * }
         */
        System.out.println("---------------Without LabelledLoop------------------------");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println("OuterLoop : " + i + " InnerLoop: " + j);
            }
        }

        System.out.println("---------------With LabelledLoop------------------------");
        outerLoop:for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println("OuterLoop : " + i + " InnerLoop: " + j);
            }
        }
    }
}

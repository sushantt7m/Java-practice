package branching;

public class Continue {
    public static void main(String[] args) {
        // continue keyword is used to skip something inside a loop 
        for(int i=0;i<100;i++){
            //now we have to print only odd numbers btw 0 to 100
            // so we will skip even numbers
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        /// This is the first comment line
        // This is the second commnet

        /*
        This is a multi line comment
         */


        int x = 1;
        int y = 6;
        int z = 7;

        if (x > y ){

            if(z == 7){
                System.out.println("z is 7");
            }else{
                System.out.println("z is not 7");
            }
            System.out.println("x is greater than y");
        }else if (x == y) {
            System.out.println("x is equal to y");
        }else{
            System.out.println("y is greater than x");
        }

        System.out.println("Hello world!");
    }
}
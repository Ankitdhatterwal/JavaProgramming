package BasicOfJava.basic.Basics;

public class Pattern {
    public static void patter(int n ){
        for (int i = n; i >0 ; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print("*"+ " ");
            }
            System.out.println();
            for (int j = 0; j <n-i+1 ; j++) {

                System.out.print(" ");

            }





        }

    }
}

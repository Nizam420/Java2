import java.util.Scanner;

public class Loopps {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++){
        //     System.out.println(i);
        // }

        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(i + " ");
            input.close();
        }       
    }
}

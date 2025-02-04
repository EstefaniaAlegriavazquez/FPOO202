import java.util.Scanner;
public class ExamenEje1 {
    public static void main (String [] args){
        Scanner scn = new Scanner(System. in);

        for(int i=10; i>=1000; i++){
            System.out.println(i);
            if(i<100){
                System.out.println(",");
            }
        }


    }

}

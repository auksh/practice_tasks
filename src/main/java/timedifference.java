
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");



        int time1[];
        int time2[];
        time1 = new int[3];
        time2 = new int[3];

        for (int i = 0; i < time1.length; i++) {

            time1[i] = sc.nextInt();
        }

        for (int i = 0; i < time2.length; i++) {

            time2[i] = sc.nextInt();
        }



        int _hours =  ( time2[0] - time1[0] ) * 3600;
        int _mins = ( time2[1]  - time1[1] ) * 60;
        int _secs = ( time2[2] - time1[2] );

        int _sum = _hours +_mins+ _secs;
        System.out.println(_sum);

    }

}


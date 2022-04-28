import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Task 1
        int n=3;
        String[] x= new String[3];
        System.out.println("Enter the elements: ");

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            x[i] = sc.nextLine();
        }

        for (int i = x.length-1; i >= 0; i--) {
            System.out.print(x[i] + "\n");
        }
        // Task 2
       int i = 9;

        System.out.println("Numbers in Reverse : ");
         while( i >=0)
        {
            System.out.print(i + " " );
            i--;
        }

        Task 3
        int n=3;
        String[] user_input= new String[3];


        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            user_input[i] = sc.nextLine();
        }
        System.out.print("The form for " +user_input[0]+ " is completed.\n");
        System.out.print("We will contact you if we need a chef who cooks " +user_input[1]+ " dishes and has " +user_input[2]+ " years of experience.");


        //Task 4





        String[] guest_list  = new String[4];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<( guest_list.length  );  i++)
        {
            guest_list[i]=sc.nextLine();

        }

        for(int x= guest_list.length -1 ;  x >= 0; x-- )
        {
            String[] arrOfStr = guest_list[x].split(" ", 0);
            for (int y = arrOfStr.length -1 ; y >=0 ; y--) {
                System.out.println(arrOfStr[y]);
            }
        }

         */

        System.out.println("Enter the limit : ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int previous_num = 0;
        int next_num = 1;
        for (int i = 1; i <= limit;  i ++){

            int sum = previous_num + next_num;
            previous_num = next_num;
            next_num = sum;

        }
        System.out.println(previous_num);
    }
}






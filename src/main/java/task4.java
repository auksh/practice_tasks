import java.util.Arrays;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
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
     }
 }
import java.util.Arrays;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
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

import java.util.Arrays;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	 	int n=3;
        String[] user_input= new String[3];


        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            user_input[i] = sc.nextLine();
        }
        System.out.print("The form for " +user_input[0]+ " is completed.\n");
        System.out.print("We will contact you if we need a chef who cooks " +user_input[1]+ " dishes and has " +user_input[2]+ " years of experience.");
}
}
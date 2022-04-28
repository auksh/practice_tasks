import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
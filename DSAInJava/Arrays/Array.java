package DSAInJava.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int sizeOfArray = inp.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            int a = inp.nextInt();
            arr[i] = a;
        }
        inp.close();
        System.out.println("Array data are : ");
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}

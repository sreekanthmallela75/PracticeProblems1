package recursion.array;

import java.util.Scanner;

public class RightRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("the original Elements are");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(+arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        System.out.println();
        System.out.println("The right rotated Elements are");
        for (int i=0;i< arr.length;i++){
            System.out.println(+arr[i]+" ");
        }
    }

}
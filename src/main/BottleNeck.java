package main;

import java.util.Scanner;

public class BottleNeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int A[] = new int[a];

        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();

        }
        int f = 0, c;
        for (int i = 0; i < a; i++) {
            c = 0;
            for (int j = 0; j < a; j++) {
                if (A[i] == A[j]) {
                    c++;
                }
            }
            if (c > f) {
                f = c;
            }
        }
        System.out.println((f));
    }
}

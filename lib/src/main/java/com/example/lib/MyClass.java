package com.example.lib;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入三角形三邊長");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int [] ar = new int[3];

        ar[0] = x;
        ar[1] = y;
        ar[2] = z;

        Arrays.sort(ar);

        if((ar[0]+ar[1])>ar[2]){
            System.out.println("可以拼出");
        }else{
            System.out.println("不能拼出");
        }

    }

}

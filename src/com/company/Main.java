package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Main {

    public static void main(String[] args) {
        int fib[];
        // int[] fib; - another variant to declarate an array
        fib = new int[20];
        // int[] fib = new int[20]; - declaration and definition of array
/*
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Ведите количество чисел Фибоначчи от 1 до 20: ");
        String sNum = bufferedReader.readLine();
        int nNum = Integer.parseInt(sNum);*/

        int nNum = 20;
        System.out.println(nNum + " чисел Фибоначчи: ");

        if (nNum > 20 || nNum < 1)
            System.out.println("Неверно указано количество чисел");
        else if (nNum == 1){
            fib[0] = 1;
            System.out.print(fib[0] + "; ");
        }
        else if (nNum == 2){
            fib[0] = 1;
            System.out.print(fib[0] + "; ");
            fib[1] = 1;
            System.out.print(fib[1] + "; ");
        }
        else {
            fib[0] = 1;
            System.out.print(fib[0] + "; ");
            fib[1] = 1;
            System.out.print(fib[1] + "; ");
            for (int i = 2; i < nNum; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                System.out.print(fib[i] + "; ");
            }
        }
    }
}

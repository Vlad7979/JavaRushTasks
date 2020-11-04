package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        byte[][] a3 = new byte[][]{
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1}
        };
        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
        int count3 = getRectangleCount(a3);
        System.out.println("count = " + count3 + ". Должно быть 5");
       /* print(a1);
        a1=addZero(a1);
        System.out.println("------------------");
        print(a1);*/

    }

    public static int getRectangleCount(byte[][] a) {
        int resault = 0;
        a = addZero(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[j][i] == 1) {
                    if ((a[j + 1][i] == 0) && (a[j][i + 1] == 0))
                        resault++;
                }

            }

        }
        // можно попытаться добавить справа столбик с нулями
        //и добавить снизу столбик с нулями. Искть ед.  проверять - справа и синзу 0 , если да, то каунт +1

        return resault;
    }

    public static byte[][] addZero(byte[][] a) {

        byte[][] a1 = new byte[a.length + 1][a[0].length + 1];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a1[j][i] = a[j][i];
                if (j == a[i].length - 1)
                    a1[i][j + 1] = 0;
            }
            a1[i][a.length - 2] = 0;
        }
        return a1;
    }


    public static void print(byte[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
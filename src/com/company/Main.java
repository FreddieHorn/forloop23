package com.company;


import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

         /* int c = n.nextInt();

        int suma = 0;
        for (int i=1; i <= c; i=i+2){
            for(int k=0;k<((c/2)-i/2); k++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        } */
      /*  for (int y=1; y<=100; y++)
        {
            if (y%13 == 0)
            {
                System.out.println(y);
            }
        } */

      /*  System.out.println("Podaj rok poczatkowy: ");
        int rok = n.nextInt();
        System.out.println("Podaj rok końcowy: ");
        int rok2 = n.nextInt();

        for (int r=rok; r <=rok2; r++)
        {
            if ((r%4==0 && r%100!=0) || r%400==0)
            {
                System.out.println("rok przestępny: "+r);
            }
        } */
        /*int x=1;
        int y=1;
        for (int i=1;i<=10;i++)
        {
            for (int j=1; j<=10; j++)
            {
                System.out.print(i*j+"\t");

            }
            System.out.println();
        }*/
    /*    int a = n.nextInt();
        int b = n.nextInt();

        int i=a;

        while(i<=b)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;
        } */

    /*    int a = n.nextInt();

        int i=1;
        while (i<=a)
        {
            System.out.println(2*i-1);
            i++;
        } */


     /*   int m = n.nextInt();
        int k = n.nextInt();
        int i=0;
        int j=0;
        while(i<m)
        {
            while(j<k)
            {
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.println(" ");
            i++;
        } */
         /*int x =-3;
        do
        {

            System.out.print("podaj liczbe dodatnia aby wyjsc z petli: ");
            x = n.nextInt();
        } while (x<0);
        System.out.println("wyszedles z petli"); */

        /*int x =4;
        do {
            System.out.println("Oblicz pole: 1-prostokata ; 2- kwadratu ; 3- trojkata; 0-wyjscie");
            x=n.nextInt();
            if (x==1)
            {
                int a,b;
                System.out.println("podaj boki a,b: ");
                a= n.nextInt();
                b= n.nextInt();
                System.out.println("Pole prostokata: "+a*b);
            }
            else if (x==2)
            {
                int a;
                System.out.println("Podaj bok kwadratu: ");
                a = n.nextInt();
                System.out.println("Pole kwadratu: " + Math.pow(a, 2));
            }
            else if (x==3)
            {
                int a,h;
                System.out.println("Podaj podstawe oraz wysokosc trojkata: ");
                a = n.nextInt();
                h = n.nextInt();
                System.out.println("Pole trojkata: " + a*h/2);
            }
        } while (x != 0);

         */


    }
}

package com.company;
import java.util.Scanner;

public class Main {
    static void reverse(int a[], int n)
    {
        int i,t;
        for(i=0;i<n/2;i++){
         t = a[i];
         a[i] = a[n-i-1];
         a[n-i-1]=t;
    }}   public static void main(String[] args) {
	// write your code here
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of n");
                int n=sc.nextInt();
                String[] arr=new String[n];
                System.out.println("Enter the values of array");
                for(int i=0;i<n;i++) {
                    String tmps=sc.next();
                    arr[i]=tmps;
                }

                }
            }


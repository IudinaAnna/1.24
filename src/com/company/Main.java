package com.company;
import java.util.Scanner;
public class Main {
    public static int Sum(int x1, int x2, int x3, int x4, int x5) {
	return x1+x2+x3+x4+x5;
    }
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("первое число");
        int x1=input.nextInt();
        System.out.println("второе число");
        int x2=input.nextInt();
        System.out.println("3 число");
        int x3=input.nextInt();
        System.out.println("4 число");
        int x4=input.nextInt();
        System.out.println("5 число");
        int x5=input.nextInt();
        int result=Sum(x1,x2,x3,x4,x5);
        System.out.println("sum:"+result);
        int max=0;
        int []array={x1,x2,x3,x4,x5};
        for(int i=0;i<5;i++){
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("biggest:"+max);
        int min=array[0];
        for(int i=0;i<5;i++){
            if(array[i]<min)
                min=array[i];
        }
        System.out.println("наименьшее:"+min);
    }
}

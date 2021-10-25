package com.company.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        System.out.println("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//1 Puncture

        System.out.println("Number to square = " +ToSquare(n));

        String k = String.valueOf(ToSquare(n));
        String[] x = new String[]{k};
        char find = '3';
        int count=0;
for (int i = 0; i < x.length ; i++ ){
        if(x[i].contains(String.valueOf(find))){
            count++;
        }
}
if (count>0){
        System.out.println("The specified number is included");
    }
        else {
    System.out.println("The specified number is not included");
}

        //2 Puncture
        String str=new String();
        String simpleNumber = String.valueOf(n);
        for (int i = 1;i<simpleNumber.length()+1;i++){
            str += simpleNumber.charAt(simpleNumber.length()-i);
        }
        System.out.println(str);

        //3 Puncture
        char[] swap = simpleNumber.toCharArray();
        char temp = swap[0];
        swap[0] = swap[swap.length-1];
        swap[swap.length-1]=temp;
        String swapStr=new String(swap);
        System.out.println(swapStr);

        //4 Puncture
        String str2 = new String();
        for(int i=0;i<simpleNumber.length()+2;i++)
        {
            if(i==0||i==simpleNumber.length()+1)
            {
                str2+="1";
            }
            else
            {
                 str2+=simpleNumber.charAt(i-1);
            }
        }
        System.out.println(str2);
    }
    public static int ToSquare(int d){
        int result = d * d;
        return result;
        }
    }



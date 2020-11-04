package exercise6;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number= input.nextInt();
        int length=String.valueOf(number).length();
        boolean p=false;
        for (int i=0;i<length-1;i++)
        {
            if ((String.valueOf(number).charAt(i)+String.valueOf(number).charAt(length-1-i))/2==String.valueOf(number).charAt(i))
            {
                p=true;
            }
            else
            {
                p=false;
                break;
            }
        }
        System.out.println("Palindrome: "+p);
    }
}

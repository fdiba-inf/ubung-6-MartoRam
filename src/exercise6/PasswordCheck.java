package exercise6;

import java.util.Scanner;

public class PasswordCheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        var pass=input.next();
        int digitcounter=0;
        boolean valiable=false;
        System.out.println(pass.length());
        for (int i=0;i<pass.length();i++)
        {
            if (Character.isDigit(pass.charAt(i)))
            {
                digitcounter++;
            }
        }
        for (int i=0;i<pass.length();i++)
        {
            if (pass.length()>=8 &&Character.isLetterOrDigit(pass.charAt(i))&&digitcounter>=2)
            {
                valiable=true;
            }
            else
                {
                break;
                }
        }
        if (valiable)
        {
            System.out.println("Password valid!");
        }
    }
}

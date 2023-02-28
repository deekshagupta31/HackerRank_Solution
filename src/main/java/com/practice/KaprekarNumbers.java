package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
Consider a positive whole number 'n'  with 'd' digits. We square 'n' to arrive at a number that
 is either 2xd digits long or (2xd)-1 digits long.
 Split the string representation of the square into two parts, 'l' and 'r' .
 The right hand part, 'r' must be 'd' digits long. The left is the remaining substring.
  Convert those two substrings back to integers, add them and see if you get 'n'.

  Given two positive integers  and  where  is lower than ,
   write a program to print the modified Kaprekar numbers in the range between  and , inclusive.
   If no modified Kaprekar numbers exist in the given range, print INVALID RANGE
 */
public class KaprekarNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(bufferedReader.readLine().trim());
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        kaprekarNumbers(p, q);
        bufferedReader.close();
    }
    /*
    p and q denotes the range

     */
    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        StringBuffer finalResult=new StringBuffer();
        for(int n=p;n<=q;n++){
            //length
            BigInteger nn=new BigInteger(String.valueOf(n));
            int d=(nn).toString().length();
            String doubleVal=nn.multiply(nn).toString();
            int lenDouble=doubleVal.length();
            int r=Integer.parseInt(doubleVal.substring(lenDouble-d).equalsIgnoreCase("")?"0":doubleVal.substring(lenDouble-d));
            int l=Integer.parseInt(doubleVal.substring(0,lenDouble-d).equalsIgnoreCase("")?"0":doubleVal.substring(0,lenDouble-d));
            int finSum=r+l;
            if(finSum==n){
                finalResult.append(n).append(" ");
            }
        }
        if(!finalResult.toString().equals("")) {
            System.out.print(finalResult);
        }
        else{
            System.out.println("INVALID RANGE");
        }

    }

}


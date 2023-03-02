package com.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
A Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1).
e.g. 378
prime factors- 2,3,3,7
sum of digits - 3+7+8=18
sum of prime factors- 2+3+3+7=18

e.g.4937775
prime factor - 3,5,5,65837
sum of digits - 4+9+3+7+7+7+5=42
sum of prime factors - 3+5+5+6+5+8+3+7=42
 */

public class SmithNumber {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = solve(n);
        System.out.println("result.."+result);

        bufferedReader.close();
    }
    // Find out if the number is prime or not and return boolean
    public static boolean isPrime(int p){
        for(int i=2;i<p;i++){
            if(i%p==0){
                return false;
            }
        }
        return true;
    }
    public static int solve(int n) {
        // sum of digits of n
        List<Integer> primeFactors=new ArrayList<>();
        int sumOfPrime=0;
        int originalNumber=n;
        while(n%2==0){
            primeFactors.add(2);
            n=n/2;
        }
        for(int x=3;x<=n;x+=2){
            if(isPrime(x)){
                while(n%x==0){
                    System.out.println(n);
                    primeFactors.add(x);
                    n=n/x;
                }
            }
        }
        System.out.println(primeFactors);
        // find sum of prime factors
        for(int i:primeFactors){
            String numStr=Integer.toString(i);
            //System.out.println("i.."+i+"..numStr.."+numStr);
            for(int y=0;y<numStr.length();y++){
                int c=Character.getNumericValue(numStr.charAt(y));
                System.out.println("x.."+sumOfPrime);
                sumOfPrime+=c;
                System.out.println("y.."+sumOfPrime);
            }
        }
        System.out.println(sumOfPrime);
        // find sum of each digit of n
        int sumOfDigits=0;
        String numStr=Integer.toString(originalNumber);
        for(int y=0;y<numStr.length();y++){
            int c=Character.getNumericValue(numStr.charAt(y));
            sumOfDigits+=c;
        }
        System.out.println(sumOfDigits);
        if(sumOfDigits==sumOfPrime){
            return 1;
        }
        return 0;
    }
}

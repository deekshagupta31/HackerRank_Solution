package com.practice;

import java.io.*;
/*
Given the time in numerals we may convert it into words
At minutes=0, use 'o' clock'. For 1<=minutes<=30 , use 'past', and for  minutes >30 use 'to'.
 Note the space between the apostrophe and clock in o' clock.
 Write a program which prints the time in words for the input given in the format described.
 int h: the hour of the day 1<=h<=12
int m: the minutes after the hour 0<=m<60
eg, Input: 5, 47
Output: thirteen minutes to six

eg, Input: 3, 00
Output: three o' clock

eg, Input: 7, 15
Output: quarter past seven

 */
public class TimeInWords {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = timeInWords(h, m);
        //System.out.println("result.."+result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static String timeInWords(int h,int m){
        try{
           // String hour=hourInWord(h);
            String min=minInWord(m);
            if(h>12){
                return "Incorrect Entry";
            }
            if(m==0){
              return(hourInWord(h)+" o' clock");
            }
            else if(m>=1 && m<=30){
                return(min+" past "+hourInWord(h));
            }
            else if(m>30 && m<=59){
                return (min+" to "+hourInWord(h==12?1:h+1));
            }
            else{
                return "Incorrect entry";
            }
        }catch(Exception e){
            System.out.println("Exception>>"+e);
        }
        return "Incorrect entry";
    }
    public static String hourInWord(int h){
        switch(h){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            default:
                return "";
        }
    }
    public static String minInWord(int m){
         if(m==1 || m==59){
            return ("one minute");
        }
        else if(m==2 || m==58){
            return ("two minutes");
        }
        else if(m==3 || m==57){
            return ("three minutes");
        }
        else if(m==4 || m==56){
            return ("four minutes");
        }
        else if(m==5 || m==55){
            return ("five minutes");
        }
        else if(m==6 || m==54){
            return ("six minutes");
        }
        else if(m==7 || m==53){
            return ("seven minutes");
        }
        else if(m==8 || m==52){
            return ("eight minute");
        }
        else if(m==9 || m==51){
            return ("nine minutes");
        }
        else if(m==10 || m==50){
            return ("ten minutes");
        }
        else if(m==11 || m==49){
            return ("eleven minutes");
        }
        else if(m==12 || m==48){
            return ("twelve minutes");
        }
        else if(m==13 || m==47){
            return ("thirteen minutes");
        }
        else if(m==14 || m==46){
            return ("fourteen minutes");
        }
        else if(m==15 || m==45){
            return ("quarter");
        }
        else if(m==16 || m==44){
            return ("sixteen minutes");
        }
        else if(m==17 || m==43){
            return ("seventeen minutes");
        }
        else if(m==18 || m==42){
            return ("eighteen minutes");
        }
        else if(m==19 || m==41){
            return ("nineteen minutes");
        }
        else if(m==20 || m==40){
            return ("twenty minutes");
        }
        else if(m==21 || m==39){
            return ("twenty one minutes");
        }
        else if(m==22 || m==38){
            return ("twenty two minutes");
        }
        else if(m==23 || m==37){
            return ("twenty three minutes");
        }
        else if(m==24 || m==36){
            return ("twenty four minutes");
        }
        else if(m==25 || m==35){
            return ("twenty five minutes");
        }
        else if(m==26 || m==34){
            return ("twenty six minutes");
        }
        else if(m==27 || m==33){
            return ("twenty seven minutes");
        }
        else if(m==28 || m==32){
            return ("twenty eight minutes");
        }
        else if(m==29 || m==31){
            return ("twenty nine minutes");
        }
        else if(m==30){
            return ("half");
        }
        else {
            return ("");
        }
    }
}

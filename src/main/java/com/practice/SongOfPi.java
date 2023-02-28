package com.practice;
import java.util.*;
/*
"Now, I wish I could recollect pi.
'Eureka,' cried the great inventor.
Christmas Pudding, Christmas Pie
Is the problem's very center."
Writing number of letters in each word together we get:
314159265358979323846- That's the value of pi! Ignoring the decimal
Code to determine which songs are pi songs and which are not.
(Assuming the pi value doesn't exceed- 3.1415926535897932384626433833)
 */
    public class SongOfPi {
    public static String piValue="31415926535897932384626433833";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] len = new String [sc.nextInt()];
        List<String> songs=new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < len.length; i++)
        {
            songs.add(sc.nextLine());
        }
        List<String> finalResult=checkForPi(len.length,songs);
        for(String eachval:finalResult){
            System.out.println(eachval);
        }
    }
   /*
   len stand for the number of songs in the input
   songs contains the list of songs to be verified
   returen type is the RESULT for each song in their inout order.
    */
    public static List<String> checkForPi(int len,List<String> songs){
        List<String> finalResult=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(songs.size()>i){
                if(songs.get(i)!=null && !songs.get(i).equalsIgnoreCase("")){
                    boolean isPi=true;
                    String eachSong=songs.get(i);
                    for(int j=0;j<eachSong.split(" ").length;j++){
                        String lenEachWord=Integer.toString(eachSong.split(" ")[j].length());
                        String actualValue=String.valueOf(piValue.charAt(j));
                        if(!actualValue.equalsIgnoreCase(lenEachWord)){
                            isPi=false;
                            break;
                        }
                    }
                    if(isPi){
                        finalResult.add("Its a pi song.");
                    }
                    else{
                        finalResult.add("Its not a pi song.");
                    }
                }
            }
        }
        return finalResult;
    }
}

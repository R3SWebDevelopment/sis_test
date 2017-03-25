/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tercero3
 */
public class Test {
    private static int STRING_MAX = 1000;
    private static int MAX_CHUNCK = 5;
    private static int MIN_CHUNCK = 3;

    public Test(String fileName){
        String data = readFile(fileName);
        data = data.substring(0, STRING_MAX);
        ArrayList<String> numbers = generateIntList(data);
        int chunk = MAX_CHUNCK;
        ArrayList palindrome = new ArrayList();
        while (palindrome.size() == 0 && chunk >= MIN_CHUNCK) {
            palindrome = getPalindrome(chunk, numbers);
            chunk --;
        }
        if(palindrome.size() > 0){
            System.out.println("Palindrome:");
            System.out.println(palindrome);
        }else{
            System.out.println("There are not palindromes");
        }
    }
    
    private ArrayList<String> getPalindrome(int chunk, ArrayList<String> numbers){
        ArrayList<String> palindrome = new ArrayList<>();
        Iterator<String> iterator = numbers.iterator();
        while(iterator.hasNext()){
            String number = iterator.next();
            if(number.length() == chunk && number.equals(reverse(number))){
                palindrome.add(number);
            }
        }
        return palindrome;
    }
    
    private String reverse(String string){
        StringBuilder reverse = new StringBuilder(string);
        reverse = reverse.reverse();
        return reverse.toString();
    }
    
    private ArrayList<String> generateIntList(String data){
        ArrayList<String> list = new ArrayList();
        for(String num: data.split(",")){
            list.add(num);
        }
        return list;
    }
    
    private String readFile(String fileName){
        FileReader fr = null;
        BufferedReader br = null;
        String data = "";
        String line;
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while((line = br.readLine()) != null){
                data += line;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return data;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = args[0];
        new Test(fileName);
    }
    
}

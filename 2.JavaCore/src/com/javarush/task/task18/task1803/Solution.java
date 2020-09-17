 package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.* ;                                                  
                                                                                           
/*                                                                                                     
Самые частые байты                                                                                                    
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine()) ;
        ArrayList<Integer> list = new ArrayList<>() ;
        Map<Integer, Integer> in = new HashMap<>();

        while(file.available() > 0){

            list.add(file.read());
        }
        file.close () ;

        for(int i =0 ; i<list.size() ; i++) {
            int count = 0 ;
            for(int j = list.size () - 1; j>=0 ; j--) {
                if(list.get(i) == list.get(j)){
                    count++;

                }
                in.put(list.get(i), count) ;
            }
            Integer max = Collections.max(in.values() );


            for(Map.Entry pair :in.entrySet()){

                if(pair.getValue() == max ) {

                    System.out.print(pair.getKey() + " ");
                }
            }

        }
    }

}
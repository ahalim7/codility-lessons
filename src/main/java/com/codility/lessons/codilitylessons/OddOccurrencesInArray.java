/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AbdElHalim
 */
public class OddOccurrencesInArray {

    public int solution(int[] a) {

        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int number : a) {

            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }
        }
        
        for(int key : occurrences.keySet()){
            if(occurrences.get(key) == 1){
                return key;
            }
        }
        return 0;
    }

}

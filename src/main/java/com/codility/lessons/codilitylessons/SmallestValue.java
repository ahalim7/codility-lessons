/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author AbdElHalim
 */
public class SmallestValue {
    
    public int solution (int[] a){
        
        int size = a.length + 1;
        Set<Integer> set = new HashSet<>();
        
        for(int x : a){
            set.add(x);
        }
        
        for(int i=1; i < size +1 ; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        throw new RuntimeException("shouldn't reach here");
    }
}

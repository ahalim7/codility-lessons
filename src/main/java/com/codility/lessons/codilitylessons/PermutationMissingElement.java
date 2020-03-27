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
public class PermutationMissingElement {

    public int solution(int[] A) {
        int max = A.length + 1;

        //load array elements into array so would be quick to check if elements exist
        Set incompleteSet = new HashSet();
        for (int i = 0; i < A.length; i++) {
            incompleteSet.add(A[i]);
        }

        for (int i = 1; i < max + 1; i++) {
            if (!incompleteSet.contains(i)) {
                return (i);
            }
        }
        throw new RuntimeException("shouldn't reach here");
    }
}

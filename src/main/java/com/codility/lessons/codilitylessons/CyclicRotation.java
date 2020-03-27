/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

/**
 *
 * @author AbdElHalim
 */
public class CyclicRotation {

    public int[] solution(int[] a, int k) {

        int[] rotatedA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            //rotated index needs to "wrap" around end of array
            int rotatedIndex = (i + k) % a.length;

            rotatedA[rotatedIndex] = a[i];
        }
        return rotatedA;
    }
}

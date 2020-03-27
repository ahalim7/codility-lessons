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
public class TapeEquilibrium {

    public int solution(int[] a) {

        int arraySum = 0;
        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }

        int lowerPart = 0;
        int difference = 0, minDiff = arraySum;

        for (int i = 0; i < a.length - 1; i++) {
            lowerPart += a[i];
            arraySum -= a[i];
            difference = Math.abs(arraySum - lowerPart);
            if (difference < minDiff) {
                minDiff = difference;
            }
        }

        return minDiff;
    }
}

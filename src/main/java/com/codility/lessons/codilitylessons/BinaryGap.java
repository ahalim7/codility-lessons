/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AbdElHalim
 */
public class BinaryGap {

    public int solution(int n) {

        String binaryRepresentation = Integer.toBinaryString(n);

        int longestGap = 0;
        int zeros = 0, ones = 0;
        for (int index = 0; index < binaryRepresentation.length(); index++) {

            //check for Math.pow
            if (binaryRepresentation.charAt(index) == '1') {

                if (ones != 0 && zeros > 1) {
                    
                    if(zeros > longestGap){
                        longestGap = zeros;
                    }
                    zeros = 0;
                    
                } else {
                    ones += 1;
                }
            } else {
                zeros += 1;
            }

        }
        return longestGap;
//        String binaryString = Integer.toBinaryString(n);
//
//        int longestBinaryGap = 0;
//        List onesList = new ArrayList();
//
//        for (int i = 0; i < binaryString.length(); i++) {
//            if (binaryString.charAt(i) == '0') {
//                continue;
//            }
//            onesList.add(i);
//        }
//
//        for (int i = 0; i < onesList.size() - 1; i++) {
//            //subtract 1 so that don't count 1's next to each other as having any gap
//            int indicesDiff = (int)onesList.get(i + 1) - (int)onesList.get(i) - 1;
//
//            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
//        }
//        return longestBinaryGap;
    }
}

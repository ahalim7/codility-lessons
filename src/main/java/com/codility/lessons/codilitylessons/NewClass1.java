/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

import com.sun.javafx.fxml.expression.BinaryExpression;
import com.sun.org.apache.xpath.internal.operations.Neg;

/**
 *
 * @author AbdElHalim
 */
public class NewClass1 {

    public String solution(int U, int L, int[] C) {
        // write your code in Java SE 8
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int upperRowSum =0, lowerRowSum=0;
        for (int value : C) {
            if (value == 2) {
                s1.append('1');
                s2.append('1');
                upperRowSum+=1;
                lowerRowSum+=1;
            } else if (value == 0) {
                s1.append('0');
                s2.append('0');
            } else if (value == 1) {
                if(upperRowSum <= U){
                    //insert in lower row
                    s1.append('1');
                    s2.append('0');
                    upperRowSum +=1;
                }else if (lowerRowSum <= L){
                    s1.append('0');
                    s2.append('1');
                    lowerRowSum+=1;
                }else{
                    return "IMPOSSIBLE";
                }
            }
        }
        return s1.toString() + ',' + s2.toString();
    }

    public static void main(String[] args) {
        String s = new NewClass1().solution(3, 2, new int[]{2, 1, 1, 0, 1});
        System.out.println(s);
    }
}

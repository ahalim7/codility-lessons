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
public class FrogJump {

    public int solution(int x, int y, int d) {

//        int jumps = 0;
//        while (true) {
//            if (x + (d * jumps) >= y) {
//                return jumps;
//            }
//            jumps += 1;
//        }

        int distanceToJump = y - x;
        int jumpsRequired = distanceToJump / d;
        if (distanceToJump % d != 0) {
            jumpsRequired++; //only add extra jump if remainder exists
        }
        return jumpsRequired;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.codilitylessons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AbdElHalim
 */
public class NewClass {

    public int solution(Point2D[] A) {
        // write your code in Java SE 8
        Map<Integer, List<Point2D>> map = new HashMap<>();

        for (Point2D point : A) {
            if (point.x < 0) {
                if (point.y < 0) {
                    //part3
                    addToMap(map, point, 3);
                } else {
                    //part2
                    addToMap(map, point, 2);
                }
            } else if (point.x > 0) {
                if (point.y > 0) {
                    //part1
                    addToMap(map, point, 1);
                } else {
                    //part4
                    addToMap(map, point, 4);
                }
            }
        }

        int raysCount = 0;
        for (Integer key : map.keySet()) {
            List<Point2D> partPoints = map.get(key);
            if (partPoints.size() == 1) {
                raysCount += 1;
            } else {
                raysCount += numberOfSameLines(partPoints);
            }
        }
        return raysCount;
    }

    public int numberOfSameLines(List<Point2D> partPoints) {
        int counter = 1, currentX = 0;
        Point2D prev = null;
        for (Point2D point : partPoints) {
            if (prev == null) {
                prev = point;
            }else{
                if((point.x % prev.x >1) && (point.y % prev.y >1)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public void addToMap(Map<Integer, List<Point2D>> map, Point2D point, int key) {

        List<Point2D> points = new ArrayList<>();
        points.add(point);
        if (map.containsKey(key)) {
            points.addAll(map.get(key));
            map.put(key, points);
        } else {
            map.put(key, points);
        }

    }

    public static void main(String[] args) {
        Point2D[] A = new Point2D[]{new Point2D(-1, -2),
            new Point2D(1, 2), new Point2D(2, 4),
            new Point2D(-3, 2), new Point2D(2, -2)};

        int result = new NewClass().solution(A);
        System.out.println(result);
    }
}

class Point2D {

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int x;
    public int y;
}

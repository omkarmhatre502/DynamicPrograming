package com.company;

import java.util.HashMap;
import java.util.Map;

/*
Say that you are travel on 2D grid. Yo begin in the top-left corner and your goal is to travel
to the bottom right corner. You may only move down or right.
In how many ways can you travel to the goal on a 2D grid with dimension m*n
 */
public class GridProblem {

    public static void main(String[] args) {
	System.out.println("hello");
        Map<String, Long> memo = new HashMap<String, Long>();
        long ways=travel(18,18,memo);
        System.out.println(ways);

    }

    private static long travel(int m, int n, Map<String, Long> memo) {
        String key=m+","+n;
        if( m==1 && n==1)
            return 1;
        if(m ==0 || n== 0)
            return 0;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        long count = travel(m,n-1,memo) + travel(m-1,n,memo);
        memo.put(key,count);
        return count;
    }
}

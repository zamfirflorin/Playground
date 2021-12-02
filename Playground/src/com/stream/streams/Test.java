package com.stream.streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Test {


		public static void main(String[] args) {

			char[][] input = new char[][] 
				{{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}};

			Solution sol = new Solution();
			int res = sol.numIslands(input);
			System.out.println(res);
			
		}
}

class Solution {

    public static final char LAND = '1';
    public static final char WATER = '0';
    public static final List<int[]> directions = Arrays.asList(
        new int[] {-1, 0},
        new int[] {1, 0},
        new int[] {0, 1},
        new int[] {0, -1}
        
    );

    public int numIslands(char[][] grid) {
        int islands = 0;
        Set<int[]> visited = new HashSet<>();
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
            	int pos[] = {r, c};
                if (visited.contains(pos)) {
                    continue;
                }
                if (grid[r][c] == LAND) {
                	islands += traverse(r, c, grid);
                }
                
            }
        }
        return islands;
    }
    
    public int traverse(int r, int c, char[][]grid) {
    	ArrayDeque<int[]> queue = new ArrayDeque<>();
    	int[] pos = {r, c};
        queue.add(pos);
        int res = 1;
        while (!queue.isEmpty()) {
            
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            List<int[]> neighbors = unvisitedNeighbors(row, col, grid);
            grid[row][col] = WATER;
            for (int [] neighbor : neighbors) {
                queue.add(neighbor);
            }
            
        }
        return res;
    }
    
    public List<int[]> unvisitedNeighbors(int r, int c, char[][]grid) {
       List<int[]> unvisitedNeighbors = new ArrayList<>();
    int m = grid.length;
    int n = grid[0].length;
        for (int[] direction : directions) {
            int row = r + direction[0];
            int col = c + direction[1];
            int[] pos = {row, col};
            if (row < 0 || col < 0 || row >= m || col >= n || grid[r][c] == WATER) {
                continue;
            } 
            unvisitedNeighbors.add(pos);
        }
        
        return unvisitedNeighbors;
    }
}
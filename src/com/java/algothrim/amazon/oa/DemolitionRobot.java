package com.java.algothrim.amazon.oa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//runtime: O(m*n) where m is length and n is width
//space: O(m*n)
//https://www.youtube.com/watch?v=kAYh0e1wav0

public class DemolitionRobot {
        public static int moveObstacle(List<List<Integer>> lot){
            if(lot == null){
                return -1;
            }
            if(lot.size() <= 0 || lot.get(0).size() <= 0){
                return  -1;
            }

            Queue<int[]> q = new LinkedList<>();
            boolean[][] visited = new boolean[lot.size()][lot.get(0).size()];
            int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
            q.add(new int[]{0,0});
            int result = 0;
            //loop over the each step
            while(q.size() > 0){
                //get the size of current level
                int size = q.size();

                //loop over current level
                for(int i = 0; i < size; i++){
                    int[] node = q.poll();
                    int x = node[0];
                    int y = node[1];
                    visited[x][y] = true;
                    //if the current point is 9, we found the obstcial
                    if(lot.get(x).get(y) == 9){
                        return result;
                    }

                    // adding the possible neighbour to the queue
                    for(int[]direction : directions){
                        int nx = y + direction[0];
                        int ny = y + direction[1];

                        if((nx < 0 || nx >= lot.size() || ny < 0 || ny > lot.get(nx).size() ||
                                lot.get(nx).get(ny) == 0 || visited[nx][ny])){
                            continue;
                        }
                        q.offer(new int[]{ny,ny});
                    }
                }
                result++;
            }
            return -1;
        }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

/**
 *
 * @author s2000
 */

import java.util.*;


public class main {
    public static void main(String[] args) {
        int[][] graph = {{0, 10, 0, 30, 100},
                         {0, 0, 50, 0, 0},
                         {0, 0, 0, 0, 10},
                         {0, 0, 20, 0, 60},
                         {0, 0, 0, 0, 0}};
        int start = 0;
        int[] dist = Dijkstra.dijkstra(graph, start);
        System.out.println(Arrays.toString(dist));
    }
}

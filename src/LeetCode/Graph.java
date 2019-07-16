package LeetCode;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Graph {

    public static void main(String[] args) {
        int carry = 1;
        int sum = '1' - '0' + '0' - '0' + carry;
        String s = "Hello baby";
        StringBuilder sb  = new StringBuilder(s);
        sb.length();
    System.out.println(sum%2);
//        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(10);
//        for (int i = 0; i < 10; i++) {
//            adjList.add(new ArrayList<Integer>());
//        }
//        adjList.get(0).add(1);
//        adjList.get(1).add(2);
//        adjList.get(0).add(2);
//        adjList.get(2).add(0);
    }

    public void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void bfs(ArrayList<ArrayList<Integer>> adjList, int V){

        LinkedHashSet<Boolean> visitedSet = new LinkedHashSet<>();
        for(int i = 1; i <= V; i++){
            visitedSet.add(false);
        }

    }

}

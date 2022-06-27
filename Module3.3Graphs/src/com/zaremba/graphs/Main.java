package com.zaremba.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static ArrayList<Node> queue = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS(0);
    }

    /**
     * Breath-first Search method
     * Explores graph specified node index in the graph(directionally)
     * @param start index of the node in the graph to start searching from
     */
    private static void BFS(int start) {
        if(start >= 0 && start < graph.size()){
            queue.add(graph.get(start)); // add the node @ start to search queue
            System.out.println("Starting search from node: "+  queue.get(0).getKey());
            visitIndex(0); // start visit node from beginning of queue
            queue.clear(); // clear queue array after search completed
            System.out.println("Search completed");
        }
        else{
            System.out.println("Starting index out of bounds of graph.");
        }
    }

    /**
     * Recursive method to explore nodes starting with the node at specified position in queue
     * @param queueIndex index of the node in the queue to start exploring
     */
    private static void visitIndex(int queueIndex){
        if(queue.size() > queueIndex){ //
            Node node = queue.get(queueIndex);
            for (Integer subnodeKey:
                    node.getNodes()) {
                if(!queue.contains(graph.get(subnodeKey - 1))){ // subtract 1 from the key of any subnodes to get the index position in the graph array.
                    queue.add(graph.get(subnodeKey - 1)); // add to queue of nodes to be explored if not already there
                }
            }
            System.out.println("Visited node: " + node.getKey());
            visitIndex(queueIndex + 1); // visit the next node in the queue using method recursively.
        }
        else {
            return;
        }
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}

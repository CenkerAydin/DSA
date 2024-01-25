package Tree;

import Graph.GraphNode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BFSPrint {

   public static void BFSPrintTree(TreeNode node){
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(node);

        TreeNode currentNode;
        Set<TreeNode> alreadyVisited=new HashSet<>();
        System.out.print("Visited Nodes: ");
        while (!queue.isEmpty()){
            currentNode=queue.remove();
            System.out.print(currentNode.getValue()+ " | ");

            alreadyVisited.add(currentNode);
            queue.addAll(currentNode.getChildNodes());
            queue.removeAll(alreadyVisited);
        }
    }
    public static void BFSPrintGraph(GraphNode node){
        Queue<GraphNode> queueGr =new ArrayDeque<>();
        queueGr.add(node);

        GraphNode currentNode;
        Set<GraphNode> alreadyVisited=new HashSet<>();
        System.out.print("Visited Nodes: ");
        while (!queueGr.isEmpty()){
            currentNode= queueGr.remove();
            System.out.print(currentNode.getValue()+ " | ");

            alreadyVisited.add(currentNode);
            queueGr.addAll(currentNode.getAdjacentNodes());
            queueGr.removeAll(alreadyVisited);
        }
    }
}

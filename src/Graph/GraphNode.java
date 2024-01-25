package Graph;

import Tree.BFSPrint;
import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public static void main(String[] args) {
        GraphNode root = new GraphNode("Rafael");
        GraphNode brunoNode = new GraphNode("Bruno");
        GraphNode jamesNode = new GraphNode("James Gosling");
        GraphNode dukeNode = new GraphNode("Duke");
        GraphNode johnNode = new GraphNode("John");

        root.connect(brunoNode);
        root.connect(johnNode);
        root.connect(dukeNode);
        brunoNode.connect(jamesNode);

        root.showNodes();
    }
    Object value;
    private List<GraphNode> adjacentNodes=new ArrayList<>();
    public GraphNode(Object value){
        this.value=value;
    }
    public void addAdjacentNodes(GraphNode node){
        this.adjacentNodes.add(node);
    }
    public List<GraphNode> getAdjacentNodes(){
        return adjacentNodes;
    }
    public void showNodes(){
        BFSPrint.BFSPrintGraph(this);
    }
    public Object getValue(){
        return value;
    }
    public void connect(GraphNode gNode){
        if(this==gNode) throw new IllegalArgumentException("Can't connect node to itself");
        this.adjacentNodes.add(gNode);
        gNode.adjacentNodes.add(this);
    }
}

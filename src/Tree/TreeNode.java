package Tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    public static void main(String[] args) {
        TreeNode root=new TreeNode("Computer");
        TreeNode node1=new TreeNode("Users");
        TreeNode node2=new TreeNode("Desktop");
        TreeNode node3=new TreeNode("CSE 2 FALL");
        TreeNode node4=new TreeNode("CSE 2 SPRING");
        root.addChild(node1);
        root.addChild(node2);
        node2.addChild(node3);
        node2.addChild(node4);

        root.showTree();
    }
    private String value;
    private List<TreeNode> childNodes;

    TreeNode(String value){
        this.value=value;
        this.childNodes=new LinkedList<>();
    }

    public void addChild(TreeNode childNode){
        this.childNodes.add(childNode);
    }
    public void showTree(){
        BFSPrint.BFSPrintTree(this);
    }
    public String getValue(){
        return value;
    }
    public List<TreeNode> getChildNodes(){
        return childNodes;
    }
}

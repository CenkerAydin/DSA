package Searching


    fun main(){
        val bst=BST()
        bst.insert(9)
        bst.insert(10)
        bst.insert(4)
        bst.insert(6)
        bst.insert(8)
        bst.insert(12)
        bst.insert(16)
        println("bfs: "+ bst.breadthFirstSearch())
        println("look for 8: " +bst.look(8))

        val queue = ArrayList<Node?>()
        queue.add(bst.root)

        println("bfs recursive: " + bst.BFSRecursive(queue, ArrayList()))
        println("dfs inOrder: " + bst.DFSInOrder())
        println("dfs preOrder: " + bst.DFSPreOrder())
        println("dfs postOrder: " + bst.DFSPostOrder())
        bst.remove(8)
        println("look for 20 after removing 20: " + bst.look(8))
    }

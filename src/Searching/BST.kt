package Searching

import java.util.AbstractQueue

class BST {
    var root: Node?=null

    fun insert(value:Int){
        val newNode=Node(value)
        if (this.root==null) this.root=newNode
        else{
            var current=this.root
            while (true){
                if (current!!.value<value){
                    if (current.right !=null) current=current.right;
                    else {
                        current.right=newNode
                        break
                    }
                }else{
                    if (current.left !=null){
                        current=current.left
                    }else{
                        current.left=newNode
                        break
                    }
                }
            }
        }
    }

    fun look(value:Int):Boolean{
        var current=this.root
        while (current!=null){
            current =when {
                current.value > value ->{
                    current.left
                }
                current.value< value -> {
                    current.right
                }
                else -> return true
            }
        }
        return false
    }

    fun remove(value:Int){
        if (this.root==null) return

        var current=this.root
        var parentNode:Node?=null

        while (current !=null){
            when {
                value < current.value -> {
                    parentNode=current
                    current=current.left
                }
                value > current.value -> {
                    parentNode =current
                    current=current.right
                }
                else -> {
                    //No right child
                    if (current.right ==null){
                        if (parentNode==null) this.root=current.left
                        else{
                            if (current.value < parentNode.value){
                                parentNode.left =current.left
                            }else if (current.value > parentNode.value){
                                parentNode.right=current.left
                            }
                        }
                    }else if (current.right!!.left ==null){
                        //Right child has no left child.
                        if (parentNode==null){
                            this.root==current.right
                        }else{
                            if (current.value<parentNode.value){
                                parentNode.left=current.right
                            }else if (current.value > parentNode.value){
                                parentNode.right=current.right
                            }
                        }
                    }else{
                        //Right child has left child
                        if (parentNode==null){
                            val leftNode=this.root!!.left
                            val rightNode=this.root!!.right

                            this.root= current.right!!.left
                            rightNode!!.left =rightNode.left!!.right
                            this.root!!.left=leftNode
                            this.root!!.right=rightNode
                        }else{
                            if (current.value<parentNode.value){
                                parentNode.left=current.right!!.left
                            }else if (current.value >parentNode.value){
                                parentNode.right=current.right!!.left
                            }
                        }
                    }
                    return
                }
            }
        }
    }

    fun breadthFirstSearch():ArrayList<Int>{
        var currentNode=this.root
        val resultArray=ArrayList<Int>()
        val queue=ArrayList<Node?>()
        queue.add(currentNode)

        while (queue.size > 0){
            currentNode =queue.removeAt(0)
            resultArray.add(currentNode!!.value)
            if (currentNode.left !=null) queue.add(currentNode.left)
            if (currentNode.right !=null) queue.add(currentNode.right)

        }
        return resultArray
    }

    fun BFSRecursive(
            queue:ArrayList<Node?>,
            resultArray:ArrayList<Int>
    ):ArrayList<Int>{
        if (queue.size==0) return resultArray

        val currentNode=queue.removeAt(0)
        resultArray.add(currentNode!!.value)

        if (currentNode.left!=null) queue.add(currentNode.left!!)
        if (currentNode.right!=null) queue.add(currentNode.right!!)

        return BFSRecursive(queue,resultArray)

    }

    fun traversInOrder(
            node:Node?,
            array:ArrayList<Int?>
    ):ArrayList<Int?>{
        if (node?.left!=null) traversInOrder(node.left,array)
        array.add(node?.value)
        if (node?.right !=null) traversInOrder(node.right,array)
        return array

    }
    fun DFSInOrder():ArrayList<Int?>{
        val answer= ArrayList<Int?>()
        return traversInOrder(this.root,answer)
    }

    fun traversePreOrder(
            node:Node?,
            array: ArrayList<Int?>
    ): ArrayList<Int?>{
        array.add(node?.value)
        if (node?.left !=null) traversePreOrder(node.left,array)
        if (node?.right !=null) traversePreOrder(node.right,array)
        return array
    }

    fun DFSPreOrder():ArrayList<Int?>{
        val answer=ArrayList<Int?>()
        return traversePreOrder(this.root,answer)
    }

    fun traversePostOrder(
            node:Node?,
            array:ArrayList<Int?>
    ):ArrayList<Int?>{
        if (node?.left !=null) traversePostOrder(node.left,array)
        if (node?.right !=null) traversePostOrder(node.right,array)
        array.add(node?.value)
        return array
    }

    fun DFSPostOrder():ArrayList<Int?>{
        val answer=ArrayList<Int?>()
        return traversePostOrder(this.root,answer)
    }
}
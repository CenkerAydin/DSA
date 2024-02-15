package LinkedList

fun main() {
    val node1=Node(value = 1)
    val node2=Node(value = 2)
    val node3=Node(value = 3)
    node1.next=node2
    node2.next=node3
    println(node1)

    println()

    val list=LinkedList<Int>()
    list.pushFront(23)
    list.pushFront(2)
    list.pushFront(32)
    println(list)

    println()
    val list1=LinkedList<Int>()
    list1.pushFront(3)
    list1.pushFront(2)
    list1.pushFront(1)
    println("Before inserting: $list1")
    var middleNode=list1.nodeAt(1)!!
    for (i in 1..3){
        middleNode=list1.insert(-1*i,middleNode)
    }
    println("After inserting: $list1")

}
package LinkedList

class LinkedList<T> {
    private var head:Node<T>?=null
    private var tail:Node<T>?=null
    private var size=0
    fun isEmpty():Boolean{
        return size==0
    }

    override fun toString(): String {
        return if (isEmpty()){
            "Empty List"
        }else{
            head.toString()
        }
    }

    //Adds a value at the front of the list
    fun pushFront(value:T){
        head=Node(value, next = head)
        if (tail==null) tail=head
        size++
    }

    //Adds a value at the end of the list
    fun append(value: T){
        if (isEmpty()) {
            pushFront(value)
         return
        }

    }
}
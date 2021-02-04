class DoublyLinkedList<T>(private var headPointer : Node<T>? = null,
                          private var tailPointer : Node<T>? = null){

    fun insertAtBegining(value : T){
        var newNode = Node(value)
        if(headPointer == null){
            headPointer = newNode
            tailPointer = newNode
        }else{
            headPointer?.prev = newNode
            newNode.next = headPointer
            headPointer = newNode
        }
    }

    fun insertAtEnd(value : T){
        var newNode = Node(value)
        if(headPointer == null){
            headPointer = newNode
            tailPointer = newNode
        }else{
            tailPointer?.next = newNode
            newNode.prev = tailPointer
            tailPointer = newNode
        }
    }

    fun delete(element : T){
        if(headPointer == null){
            println("Abe gadhe.. data hi nahi hai")
        }else{
            var currentNode = headPointer
            while(currentNode?.next != null){
                if(currentNode?.info == element){
                    //if the element that needs to be deleted is head
                    if(currentNode?.prev == null){
                        var temp = headPointer
                        headPointer = headPointer?.next
                        headPointer?.prev = null
                        temp = null
                    }else{
                        var temp = currentNode
                        currentNode?.prev?.next = currentNode?.next
                        currentNode?.next?.prev = currentNode?.prev
                        temp = null
                    }

                }
                currentNode = currentNode?.next
            }

            if(currentNode?.info == element){
                //if the element that needs to be deleted is only element in linked list

                if(currentNode?.prev == null){
                    headPointer = null
                    tailPointer = null
                }else{
                    //if the element that needs to be deleted is having more elements
                    tailPointer = currentNode?.prev
                    tailPointer?.next = null
                }
                currentNode = null

            }
        }
    }

    override fun toString():String{
        return "$headPointer"
    }


}
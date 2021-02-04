fun main(){
    println("Welcome to Code Hunt")

    val dll = DoublyLinkedList<Int>()


    dll.insertAtBegining(10)
    dll.insertAtBegining(60)

    dll.insertAtBegining(80)
    dll.insertAtBegining(100)
    dll.insertAtBegining(20)
    dll.insertAtBegining(1000)

    dll.insertAtEnd(120)
    println("$dll")
    dll.delete(50)

    println("Elements after deletion : $dll")
}
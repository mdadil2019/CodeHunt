data class Node<T>(var info : T,
                   var prev : Node<T>? = null,
                   var next : Node<T>? = null){

    override fun toString():String{
        return "$info -> $next"
    }
}
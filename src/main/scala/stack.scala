// methods - pop,push,peek,isempty,size
// properties - maxno, 

class stack(max_elements: Int){
    val top_pointer:Int = -1
    val elements_array: Array[<E>] = new Array[<E>](max_elements)

    def push(element: <E>)=Unit{
        top_pointer +=1
        elements_array[top_pointer]= element
    }
    def pop():Unit = {
        elements_array[top_pointer] = null
        top_pointer -= 1
    }
    def peek():Int = {
        return top_pointer
    }
    def isEmpty():Boolean = {
        val empty_state:Boolean = false
        if (top_pointer==-1){
            empty_state = true
        }
        return empty_state
    }
    def size():Int = {
        return top_pointer+1
    }
    def capacity():Int = {
        return max_elements
    }
}
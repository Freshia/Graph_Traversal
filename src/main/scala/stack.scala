// methods - pop,push,peek,isempty,size
// properties - maxno, 

class stack(max_elements: Int){
    var top_pointer:Int = -1
    val elements_array: Array[Int] = new Array[Int](max_elements)

    def push(element: Int):Unit={
        top_pointer = top_pointer + 1
        elements_array(top_pointer)= element
    }
    def pop():Unit = {
        //elements_array(top_pointer) = null
        top_pointer = top_pointer - 1
        //return elements_array(top_pointer)
    }
    def peek():Int = {
        return elements_array(top_pointer)
    }
    def isEmpty():Boolean = {
        var empty_state:Boolean = false
        if (top_pointer == -1){
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
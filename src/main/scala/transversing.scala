
class transversing(start_location:Int){

    val mygraph: graph = new graph();
    val thestack: stack = new stack(20)
    //val locations:Array[Vertex] = mygraph.get_locations()
    
    // var number_of_locations = mygraph.get_size()
    
    def getadj_unvisited(v:Int,locations:Array[Vertex], adj_matrix: Array[Array[Int]], number_of_locations:Int ): Int = {
        var present:Int = -1
        for(j<-0 to number_of_locations - 1){
            if(adj_matrix(v)(j) != 0 && locations(j).wasVisited == false){
                    present = j
            }
        }
        return present
    }
    def print_vertex(v: Int,locations:Array[Vertex]){
        println(locations(v))
    }
    def dfs(locations: Array[Vertex], adj_matrix: Array[Array[Int]], number_of_locations:Int):Unit = {
        
        println("My start locatin")
        println(locations(start_location).vertex_name)
        locations(start_location).wasVisited = true
        thestack.push(start_location)
        print_vertex(start_location,locations)
        while(!thestack.isEmpty){
            val v:Int = getadj_unvisited(thestack.peek(),locations, adj_matrix, number_of_locations)

            if(v == -1){
                thestack.pop()
            }
            else{
                locations(v).wasVisited = true
                print_vertex(v,locations)
                thestack.push(v)
            }
        }
    }
    def reset(locations: Array[Vertex], number_of_locations: Int):Unit = {
        for(i<-0 to number_of_locations){
            locations(i).wasVisited = false
        }
    }

}
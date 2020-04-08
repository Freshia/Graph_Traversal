
class transversing(start_location:Int){

    val mygraph: graph = new graph();
    val thestack: stack = new stack(20)
    val locations:Array[Vertex] = mygraph.get_locations()
    val adj_matrix= mygraph.adj_matrix
    var number_of_locations = mygraph.get_size()
    
    def getadj_unvisited(v:Int): Int = {
        var present:Int = -1
        for(j<-0 to number_of_locations){
            if(adj_matrix(v)(j) != 0 && locations(j).wasVisited == false){
                    present = j
            }
        }
        return present
    }
    def print_vertex(v: Int){
        println(locations(v))
    }
    def dfs():Unit = {
        locations(start_location).wasVisited = true
        thestack.push(start_location)
        print_vertex(start_location)
        while(!thestack.isEmpty){
            val v:Int = getadj_unvisited(thestack.peek())

            if(v == -1){
                thestack.pop()
            }
            else{
                locations(v).wasVisited = true
                print_vertex(v)
                thestack.push(v)
            }
        }
    }
    def reset():Unit = {
        for(i<-0 to number_of_locations){
            locations(i).wasVisited = false
        }
    }

}
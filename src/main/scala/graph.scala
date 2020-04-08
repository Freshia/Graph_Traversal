
class graph{

    val max_locations = new stack.capacity()
    var adj_matrix:Array[Int][Int] = new Array[Int][Int](max_locations)
    var no_of_vertex = 0
    var vertices: Array[Vertex] = new Array[Vertex](max_locations)

    for(i<-0 to max_locations; j<-0 to max_locations){
        adj_matrix[i][j] = 0;
    }
    def add_edge(start:Int, stop: Int):Unit = {
        adj_matrix[start][stop] = 1
        adj_matrix[stop][start] = 1
    }
    def add_vertex(name: String):Unit = {
        val vertex = new Vertex(name);
        vertices[no_of_vertex] = vertex
        no_of_vertex +=1
        
    }
    def get_size():Int = {
        return no_of_vertex
    }
    def get_locations(): Array[Vertex] = {
        return vertices
    }

}
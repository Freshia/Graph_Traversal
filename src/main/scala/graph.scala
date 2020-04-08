
class graph{

    val max_locations = new stack(20).capacity()
    val adj_matrix = Array.ofDim[Int](max_locations,max_locations)
    var no_of_vertex = 0
    var vertices: Array[Vertex] = new Array[Vertex](max_locations)

    for(i<-0 to max_locations - 1; j<-0 to max_locations-1){
        adj_matrix(i)(j) = 0;
    }
    def add_edge(start: Int, stop: Int):Unit = {
        adj_matrix(start)(stop) = 1
        adj_matrix(stop)(start) = 1
    }
    def add_vertex(name: String):Unit = {
        val vertex = new Vertex(name);
        vertices(no_of_vertex) = vertex
        no_of_vertex +=1
    }
    def get_size():Int = {
        return no_of_vertex
    }
    def get_locations(): Array[Vertex] = {
        return vertices
    }

}
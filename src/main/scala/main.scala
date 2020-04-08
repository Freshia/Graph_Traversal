
object main{
    val my_bus = new transversing(0)
    val my_graph = new graph()

    def main(args: Array[String]){
        val locations:Array[Vertex] = my_graph.get_locations()
        val adj_matrix= my_graph.adj_matrix
        var number_of_locations = my_graph.get_size()
		my_graph.add_vertex("A"); // 0
		my_graph.add_vertex("B"); // 1
		my_graph.add_vertex("C"); // 2
		my_graph.add_vertex("D"); // 3
		my_graph.add_vertex("E"); // 4
		my_graph.add_vertex("F"); // 5 
		my_graph.add_vertex("G"); // 6
		my_graph.add_vertex("H"); // 7
		my_graph.add_vertex("I"); // 8
		my_graph.add_vertex("J"); // 9

		my_graph.add_edge(0, 1); // AB
		my_graph.add_edge(0, 2); // AC
		my_graph.add_edge(2, 3); // CD
		my_graph.add_edge(2, 8); // CI
		my_graph.add_edge(3, 6); // DG
		my_graph.add_edge(3, 4); // DE
		my_graph.add_edge(4, 5); // EF
		my_graph.add_edge(1, 7); // BH
		my_graph.add_edge(1, 8); // BI
		my_graph.add_edge(4, 9); //EJ

        println("Visits: ")
        my_bus.dfs(locations,adj_matrix,number_of_locations)
        my_bus.reset(locations, number_of_locations)
    }

    
}
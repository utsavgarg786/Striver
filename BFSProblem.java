package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSProblem {

	public static void main(String[] args) {

		int V = 5;
		int E = 4;
		List<List<Integer>> adj = new ArrayList<>();
		//List<List<Integer>> adj1 = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(),Arrays.asList(4),Arrays.asList(),Arrays.asList());
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(0).add(3);
		
		adj.get(2).add(4);
		System.out.println(adj);
		List<Integer> bfs = graph(V,adj);
		System.out.println(bfs);
	}

	private static List<Integer> graph(int v, List<List<Integer>> adj) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[v];
		List<Integer> bfs = new ArrayList<>();
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			Integer a = queue.remove();
			bfs.add(a);
			
			for(Integer num : adj.get(a)) {
				if(visited[num] == false) {
					visited[num] = true;
					queue.add(num);
				}
			}
			
		}
		return bfs;
	}

}

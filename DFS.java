package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	public static void main(String[] args) {
		int V = 5;
		int E = 4;
		List<List<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(2);
		adj.get(0).add(3);
		adj.get(0).add(1);
		
		adj.get(2).add(0);
		adj.get(2).add(4);
		
		adj.get(3).add(0);
		adj.get(1).add(0);
		System.out.println(adj);
		List<Integer> dfs = graph(V,adj);
		System.out.println(dfs);
	}

	private static List<Integer> graph(int v, List<List<Integer>> adj) {

		boolean[] visited = new boolean[v];
		List<Integer> list = new ArrayList<>();
		int start = 0;
		dfs(start, adj, visited, list);
		return list;
	}

	private static void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> list) {

		visited[node] = true;
		list.add(node);
		
		for(Integer num : adj.get(node)) {
			if(visited[num] == false) {
				dfs(num, adj, visited, list);
			}
		}
	}

}

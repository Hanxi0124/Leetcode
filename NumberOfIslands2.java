// by bfs

class NumberOfIslands2{
	int[][] dirs = {{0, 1},{1, 0},{0, -1},{-1, 0}};

	public List<Integer> numIsLands(int m, int n, int[][] position){
		List<Integer> res = new ArrayList<>();
		if (m <=0 || n <= 0) return rest;
		
		int count = 0;
		int[] roots = new int[m * n];
		Array.fill(roots, -1);

		for (int[] pair : position) {
			int position = n * pair[0] + pair[1];
			roots[position]	= position;	
			count++;

			for (int[] dir : dirs ) {
				int x = pair[0] + dir[0];
				int y = pair[0] + dir[0];
				int curPos = n * x + y;					
							}				
			}			
		
	}

}
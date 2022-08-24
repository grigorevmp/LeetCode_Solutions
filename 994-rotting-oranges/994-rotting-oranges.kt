class Solution {

fun orangesRotting(grid: Array<IntArray>): Int {
    
    if (grid.isEmpty()) return 0
    val queue : Queue<Pair<Int, Int>> = LinkedList()
    var fresh = 0
    var minutes = 0
    
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            when (grid[i][j]) {
                0 -> {}
                1 -> fresh++
                else -> queue.offer(i to j)
            }
        }
    }
   
   
    if (fresh == 0) return 0 
    else if (queue.isEmpty()) return -1 
    else if (queue.size == grid.size*grid[0].size) return 0 
    
    while (queue.isNotEmpty()) {
        var size = queue.size
        while (size != 0) {
            val (i, j) = queue.poll()
            if (isValid(grid, i-1, j)) { 
                grid[i-1][j] = 2
                queue.offer(i-1 to j)
                --fresh
            }
            if (isValid(grid, i+1, j)) { 
                grid[i+1][j] = 2
                queue.offer(i+1 to j)
                --fresh
            }
            if (isValid(grid, i, j-1)) {
                grid[i][j-1] = 2
                queue.offer(i to j-1)
                --fresh
            }
            if (isValid(grid, i, j+1)) { 
                grid[i][j+1] = 2
                queue.offer(i to j+1)
                --fresh
            }
            --size
        }
        minutes++
    }
    
    return if (fresh == 0) minutes - 1 else -1
}

    private fun isValid(grid: Array<IntArray>, i: Int, j: Int) = i in grid.indices && j in grid[i].indices && grid[i][j] == 1
}
data class Cell(val x: Int, val y: Int)

class Solution {
    fun updateMatrix(mats: Array<IntArray>): Array<IntArray> {
        val mat = mats.toMutableList().map { it.toMutableList() }
        val xLength = mat.size
        val yLength = mat.first().size

        val queue = ArrayDeque<Pair<Cell, Int>>()
        for (i in mat.indices) {
            for (j in mat[i].indices) {
                if (mat[i][j] == 0) {
                    queue.addLast(Cell(i, j) to 0)
                } else {
                    mat[i][j] = Int.MAX_VALUE
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (cell, depth) = queue.removeFirst()
            fun getCellMoves() =
                listOf(
                    Cell(cell.x + 1, cell.y),
                    Cell(cell.x - 1, cell.y),
                    Cell(cell.x, cell.y + 1),
                    Cell(cell.x, cell.y - 1)
                )
            for (c in getCellMoves()) {
                if (c.x >= 0 && c.x < mat.size && c.y >= 0 && c.y < mat[0].size) {
                    val value = mat[c.x][c.y]
                    if (depth + 1 < value) {
                        mat[c.x][c.y] = depth + 1
                        queue.addLast(c to depth + 1)
                    }
                }
            }
        }

        return mat.map { it.toIntArray() }.toTypedArray()
    }
}
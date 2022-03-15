data class MinesweeperBoard(var inputMatrix: List<String>) {

    var matrix:MutableList<String> = mutableListOf<String>();

    init {
        for((xIndex, row) in inputMatrix.withIndex()){
            var chars = row.toCharArray()
            for ((yIndex, cell) in chars.withIndex()){
                // calculate what is around me
                if(cell.isWhitespace()) {
                    println(cell)
                    val count =
                    (Math.max(0, xIndex - 1)..Math.min(inputMatrix.size - 1, xIndex + 1))
                    .flatMap { x ->
                        (Math.max(0, yIndex - 1)..Math.min(inputMatrix[x].length - 1, yIndex + 1))
                        .map { y ->
                            if (inputMatrix[x][y] == '*') 1 else 0
                        }
                    }.sum()
                    if (count > 0){
                    	chars[yIndex] = Character.forDigit(count, 10)
                    }
                }
            }
            matrix.add(chars.joinToString(""))
        }
    }

    fun withNumbers(): List<String> {
        return matrix.toList();
    }
}

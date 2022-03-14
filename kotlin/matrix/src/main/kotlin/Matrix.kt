class Matrix(private val matrixAsString: String) {
    fun column(colNr: Int): List<Int> {
        val rows =  matrixAsString.split("\n");
        var column = arrayListOf<Int>()
        for (row in rows){
            val tempCol = row.trim().split("\\s+".toRegex()).map{ it.toInt() }.elementAt(colNr-1)
            column.add(tempCol)
        }
        return column.toList();
    }
    fun row(rowNr: Int): List<Int> {
        return matrixAsString.split("\n").elementAt(rowNr-1).split(" ").map(String::toInt);
    }
}
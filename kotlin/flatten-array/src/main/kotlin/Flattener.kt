object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        return source.flatMap{when(it) {
                is Int -> listOf(it)
                is List<*> -> flatten(it)
                else -> emptyList()
            }
        }.filter { it != null }
    }
}

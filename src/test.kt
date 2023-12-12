fun main() {
    val strs: List<String> = listOf("one", "two", "three", "four")
    for (s in strs) {
        if (s.length == 3) {
            println(s)
        }
    }
}
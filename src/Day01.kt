fun main() {
    fun part1(input: List<String>): Int {
        val numRegex = "[0-9]".toRegex()

        var result = 0

        for (line in input) {
            val nums = numRegex.findAll(line).map { it.value.toInt() }
            val sum = (buildString {
                append(nums.first())
                append(nums.last())
            }).toInt()
            result += sum
        }

        return result
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}

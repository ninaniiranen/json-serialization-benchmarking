package dev.zacsweers.jsonserialization.android

fun main() {

    val data = """
    5,368,211   ns       25149 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=first]
    1,968,378   ns        2329 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=first]
   52,089,739   ns       81446 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=first]
    3,322,161   ns        5451 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=first]
    5,338,205   ns       25137 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=last]
    1,946,549   ns        2329 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=last]
   52,074,949   ns       81446 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=last]
    4,790,746   ns        5456 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=last]
    5,852,979   ns       25203 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=first]
    1,962,804   ns        2329 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_toJson[minified=false,typeKeyLocation=first]
   52,207,552   ns       81446 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_toJson[minified=false,typeKeyLocation=first]
    4,271,177   ns        5459 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=first]
    5,885,173   ns       25191 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=last]
    1,967,656   ns        2329 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_toJson[minified=false,typeKeyLocation=last]
   52,012,551   ns       81446 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.gson_toJson[minified=false,typeKeyLocation=last]
    6,817,343   ns        5465 allocs    Trace    Method Trace    AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=last]
    """.trimIndent()
    val regex =
        """\s*(?<time>[0-9,.]+)\s+(?<timeunit>[a-zA-Z]+)\s+(?<allocs>[0-9]+)\sallocs\s+Trace\s+Method\sTrace\s+(?<benchmark>.+)""".toRegex()

    // Skip the header line
    val results = data.lineSequence()
        .map { line ->
            val match = regex.matchEntire(line)!!
            Analysis(
                benchmark = match.groups["benchmark"]!!.value,
                score = match.groups["time"]!!.value.replace(",", "").toLong(),
                units = match.groups["timeunit"]!!.value,
            )
        }
        .filterNot {
            // Minified doesn't matter in toJson, so filter out half of them
            "_toJson" in it.benchmark && "minified=false" in it.benchmark
        }
        .toList()

    PolymorphicResultType.values().forEach { printResults(it, results) }
}

private fun printResults(type: PolymorphicResultType, results: List<Analysis>) {
    val groupedResults = type.groupings.associateWith { grouping ->
        results.filter {
            grouping.matchFunction(it.benchmark)
        }
    }
    val benchmarkLength = results.maxBy { it.benchmark.length }!!.benchmark.length
    val scoreLength = results.maxBy { it.formattedScore.length }!!.formattedScore.length

    check(groupedResults.values.flatten().size == results.size) {
        "Missing information!"
    }

    val output = buildString {
        appendLine()
        append(type.description)
        appendLine(':')
        appendLine()
        appendLine("```")
        groupedResults.entries
            .joinTo(this, "\n\n", postfix = "\n```") { (grouping, matchedAnalyses) ->
                val content = matchedAnalyses.sortedBy { it.score }
                    .joinToString("\n") { it.formattedString(benchmarkLength, scoreLength) }
                "${grouping.name}\n$content"
            }
    }

    println(output)
}

private enum class PolymorphicResultType(val description: String, val groupings: List<Grouping>) {
    SERIALIZATION_TYPE(
        description = "Grouped by serialization type (read, write)",
        groupings = listOf(
            Grouping("Read") {
                "_fromJson" in it
            },
            Grouping("Write") {
                "_toJson" in it
            }
        )
    )
}


package dev.zacsweers.jsonserialization.jmh

import java.util.Locale

fun main() {

    val data = """
        JmhBenchmark.gson_autovalue_buffer_fromJson                 true                N/A  thrpt   25  2103.365 ± 174.869  ops/s
        JmhBenchmark.gson_autovalue_buffer_fromJson                false                N/A  thrpt   25  1954.412 ± 113.271  ops/s
        JmhBenchmark.gson_autovalue_buffer_toJson                   true                N/A  thrpt   25  1514.904 ±  16.609  ops/s
        JmhBenchmark.gson_autovalue_buffer_toJson                  false                N/A  thrpt   25  1481.336 ±  35.738  ops/s
        JmhBenchmark.gson_autovalue_string_fromJson                 true                N/A  thrpt   25  2062.427 ±  66.146  ops/s
        JmhBenchmark.gson_autovalue_string_fromJson                false                N/A  thrpt   25  1841.426 ± 148.223  ops/s
        JmhBenchmark.gson_autovalue_string_toJson                   true                N/A  thrpt   25  1627.834 ±  33.426  ops/s
        JmhBenchmark.gson_autovalue_string_toJson                  false                N/A  thrpt   25  1603.215 ±  14.168  ops/s
        JmhBenchmark.gson_reflective_string_fromJson                true                N/A  thrpt   25  2049.419 ±  76.138  ops/s
        JmhBenchmark.gson_reflective_string_fromJson               false                N/A  thrpt   25  2068.076 ± 168.088  ops/s
        JmhBenchmark.gson_reflective_string_toJson                  true                N/A  thrpt   25  2180.831 ±   9.871  ops/s
        JmhBenchmark.gson_reflective_string_toJson                 false                N/A  thrpt   25  2107.935 ± 109.361  ops/s
        JmhBenchmark.kserializer_string_fromJson                    true                N/A  thrpt   25  2386.430 ±  72.566  ops/s
        JmhBenchmark.kserializer_string_fromJson                   false                N/A  thrpt   25  2081.687 ±  24.161  ops/s
        JmhBenchmark.kserializer_string_toJson                      true                N/A  thrpt   25  2319.955 ±  23.325  ops/s
        JmhBenchmark.kserializer_string_toJson                     false                N/A  thrpt   25  2320.671 ±  10.548  ops/s
        JmhBenchmark.moshi_autovalue_buffer_fromJson                true                N/A  thrpt   25  2250.529 ±  38.698  ops/s
        JmhBenchmark.moshi_autovalue_buffer_fromJson               false                N/A  thrpt   25  2006.315 ± 245.780  ops/s
        JmhBenchmark.moshi_autovalue_buffer_toJson                  true                N/A  thrpt   25  2473.902 ±  15.000  ops/s
        JmhBenchmark.moshi_autovalue_buffer_toJson                 false                N/A  thrpt   25  2437.310 ±  26.590  ops/s
        JmhBenchmark.moshi_autovalue_string_fromJson                true                N/A  thrpt   25  1823.716 ±  16.474  ops/s
        JmhBenchmark.moshi_autovalue_string_fromJson               false                N/A  thrpt   25  1337.389 ±  10.059  ops/s
        JmhBenchmark.moshi_autovalue_string_toJson                  true                N/A  thrpt   25  2324.336 ±   4.649  ops/s
        JmhBenchmark.moshi_autovalue_string_toJson                 false                N/A  thrpt   25  2320.138 ±   4.284  ops/s
        JmhBenchmark.moshi_kotlin_codegen_buffer_fromJson           true                N/A  thrpt   25  3034.497 ±  10.684  ops/s
        JmhBenchmark.moshi_kotlin_codegen_buffer_fromJson          false                N/A  thrpt   25  1880.226 ±  72.607  ops/s
        JmhBenchmark.moshi_kotlin_codegen_buffer_toJson             true                N/A  thrpt   25  2023.463 ±  36.440  ops/s
        JmhBenchmark.moshi_kotlin_codegen_buffer_toJson            false                N/A  thrpt   25  1960.394 ± 136.440  ops/s
        JmhBenchmark.moshi_kotlin_codegen_string_fromJson           true                N/A  thrpt   25  1829.507 ±  17.065  ops/s
        JmhBenchmark.moshi_kotlin_codegen_string_fromJson          false                N/A  thrpt   25  1292.627 ±  14.854  ops/s
        JmhBenchmark.moshi_kotlin_codegen_string_toJson             true                N/A  thrpt   25  2268.301 ±  44.580  ops/s
        JmhBenchmark.moshi_kotlin_codegen_string_toJson            false                N/A  thrpt   25  2300.977 ±  14.831  ops/s
        JmhBenchmark.moshi_kotlin_reflective_buffer_fromJson        true                N/A  thrpt   25  2819.941 ±   9.045  ops/s
        JmhBenchmark.moshi_kotlin_reflective_buffer_fromJson       false                N/A  thrpt   25  2107.247 ±   2.270  ops/s
        JmhBenchmark.moshi_kotlin_reflective_buffer_toJson          true                N/A  thrpt   25  2154.950 ±  11.820  ops/s
        JmhBenchmark.moshi_kotlin_reflective_buffer_toJson         false                N/A  thrpt   25  2128.022 ±  17.086  ops/s
        JmhBenchmark.moshi_kotlin_reflective_string_fromJson        true                N/A  thrpt   25  1667.428 ±  30.378  ops/s
        JmhBenchmark.moshi_kotlin_reflective_string_fromJson       false                N/A  thrpt   25  1223.684 ±  21.723  ops/s
        JmhBenchmark.moshi_kotlin_reflective_string_toJson          true                N/A  thrpt   25  2021.824 ±  18.905  ops/s
        JmhBenchmark.moshi_kotlin_reflective_string_toJson         false                N/A  thrpt   25  2012.454 ±   9.425  ops/s
        JmhBenchmark.moshi_reflective_string_fromJson               true                N/A  thrpt   25  1681.915 ±  40.099  ops/s
        JmhBenchmark.moshi_reflective_string_fromJson              false                N/A  thrpt   25  1252.076 ±  12.122  ops/s
        JmhBenchmark.moshi_reflective_string_toJson                 true                N/A  thrpt   25  2168.825 ±  11.590  ops/s
        JmhBenchmark.moshi_reflective_string_toJson                false                N/A  thrpt   25  2142.532 ±  16.654  ops/s
        JmhPolymorphicBenchmark.gson_fromJson                       true              first  thrpt   25  1490.646 ±  13.550  ops/s
        JmhPolymorphicBenchmark.gson_fromJson                       true               last  thrpt   25  1479.061 ±  18.394  ops/s
        JmhPolymorphicBenchmark.gson_fromJson                      false              first  thrpt   25  1351.586 ±  19.889  ops/s
        JmhPolymorphicBenchmark.gson_fromJson                      false               last  thrpt   25  1363.713 ±  14.112  ops/s
        JmhPolymorphicBenchmark.gson_toJson                         true              first  thrpt   25  1185.974 ±   8.372  ops/s
        JmhPolymorphicBenchmark.gson_toJson                         true               last  thrpt   25  1202.024 ±  12.233  ops/s
        JmhPolymorphicBenchmark.gson_toJson                        false              first  thrpt   25  1215.910 ±   2.158  ops/s
        JmhPolymorphicBenchmark.gson_toJson                        false               last  thrpt   25  1212.528 ±   9.489  ops/s
        JmhPolymorphicBenchmark.moshi_fromJson                      true              first  thrpt   25  3030.687 ±  14.369  ops/s
        JmhPolymorphicBenchmark.moshi_fromJson                      true               last  thrpt   25  1785.175 ±  11.282  ops/s
        JmhPolymorphicBenchmark.moshi_fromJson                     false              first  thrpt   25  2026.361 ±   3.814  ops/s
        JmhPolymorphicBenchmark.moshi_fromJson                     false               last  thrpt   25  1128.178 ±  12.706  ops/s
        JmhPolymorphicBenchmark.moshi_toJson                        true              first  thrpt   25  2393.520 ±  33.620  ops/s
        JmhPolymorphicBenchmark.moshi_toJson                        true               last  thrpt   25  2346.835 ±  33.592  ops/s
        JmhPolymorphicBenchmark.moshi_toJson                       false              first  thrpt   25  2399.376 ±  18.408  ops/s
        JmhPolymorphicBenchmark.moshi_toJson                       false               last  thrpt   25  2377.733 ±  23.126  ops/s
        """.trimIndent()
    val regex =
        """\s*(?<benchmark>\S+)\s+(?<minified>true|false)\s+(?<type>[a-zA-Z/]+)\s+(?<mode>[a-zA-Z]+)\s+(?<count>[0-9]+)\s+(?<score>[0-9,.]+)\s+±\s+(?<error>[0-9,.]+)\s+(?<units>.+)""".toRegex()

    // Skip the header line
    val results = data.lineSequence()
        .mapNotNull { line ->
            val groups = regex.matchEntire(line)!!.groups
            val benchmark = groups["benchmark"]!!.value
            val minified = groups["minified"]!!.value
            val mode = groups["mode"]!!.value
            val count = groups["count"]!!.value
            val score = groups["score"]!!.value
            val error = groups["error"]!!.value
            val units = groups["units"]!!.value

            if ("_toJson" in benchmark && !minified.toBoolean()) {
                // Minified doesn't matter in toJson so just filter them out
                return@mapNotNull null
            }
            Analysis(
                "$benchmark[minified=$minified]",
                mode,
                count.toInt(),
                score.toDouble(),
                error.toDouble(),
                units
            )
        }
        .toList()

    ResultType.values().forEach {
        printResults(it, results)
    }
}

private fun printResults(type: ResultType, results: List<Analysis>) {
    val groupedResults = type.groupings.associate { grouping ->
        grouping to results.filter {
            grouping.matchFunction(it.benchmark)
        }
    }
    val benchmarkLength = results.maxBy { it.benchmark.length }!!.benchmark.length
    val scoreLength = results.maxBy { it.score.toString().length }!!.score.toString().length
    val errorLength = results.maxBy { it.error.toString().length }!!.error.toString().length

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
                val content = matchedAnalyses.sortedByDescending { it.score }
                    .joinToString("\n") {
                        it.formattedString(
                            benchmarkLength,
                            scoreLength,
                            errorLength
                        )
                    }
                "${grouping.name}\n$content"
            }
    }

    println(output)
}

private enum class ResultType(val description: String, val groupings: List<Grouping>) {
    SERIALIZATION_TYPE(
        description = "Grouped by serialization type (read, write, buffered, string)",
        groupings = listOf(
            Grouping("Read (buffered)") {
                "buffer" in it && "fromJson" in it
            },
            Grouping("Read (string)") {
                "string" in it && "fromJson" in it
            },
            Grouping("Write (buffered)") {
                "buffer" in it && "toJson" in it
            },
            Grouping("Write (string)") {
                "string" in it && "toJson" in it
            },
            Grouping("Polymorphic Read") {
                "Polymorphic" in it && "fromJson" in it
            },
            Grouping("Polymorphic Write") {
                "Polymorphic" in it && "toJson" in it
            }
        )
    ),
    LIBRARY(
        description = "Grouped by library (interesting to see how reflection vs custom adapters affects perf within a library)",
        groupings = listOf(
            Grouping("GSON") {
                "gson" in it
            },
            Grouping("Kotlinx Serialization") {
                "kserializer" in it
            },
            Grouping("Moshi") {
                "moshi" in it && "kotlin" !in it
            },
            Grouping("Moshi Kotlin") {
                "moshi_kotlin" in it
            }
        )
    )
}

private data class Grouping(
    val name: String,
    val matchFunction: (String) -> Boolean,
)

private data class Analysis(
    val benchmark: String,
    val mode: String,
    val count: Int,
    val score: Double,
    val error: Double,
    val units: String,
) {
    override fun toString() = "$benchmark\t$mode\t$count\t$score\t±\t$error\t$units"
    fun formattedString(benchmarkLength: Int, scoreLength: Int, errorLength: Int): String {
        return String.format(
            Locale.US,
            "%-${benchmarkLength}s  %s  %s  %${scoreLength}s  ±  %${errorLength}s  %s",
            benchmark, mode, count, score, error, units
        )
    }

}

private operator fun <T> List<T>.component6(): T = this[5]
private operator fun <T> List<T>.component7(): T = this[6]
private operator fun <T> List<T>.component8(): T = this[7]

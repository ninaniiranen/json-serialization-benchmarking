package dev.zacsweers.jsonserialization.android

import java.util.Locale

fun main() {

    val data = """
    2,907,614   ns        9990 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=true]
    2,365,389   ns        9230 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]
    3,291,213   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]
    2,700,573   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]
    3,719,274   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]
   49,701,771   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]
    3,304,158   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]
    4,201,765   ns        7682 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]
    1,961,368   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]
    3,751,024   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]
    4,655,439   ns        7711 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]
    3,516,033   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]
    4,401,051   ns        9608 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=true]
    3,657,083   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=true]
    2,845,949   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=true]
    2,564,754   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]
    1,878,791   ns        2045 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=true]
    3,669,262   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=true]
    2,138,975   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]
    4,157,874   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]
    4,098,317   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]
    3,667,723   ns        9402 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]
    3,112,994   ns        9983 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=false]
    2,544,135   ns        9223 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]
    4,217,546   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]
    2,701,951   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=false]
    4,840,880   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]
   49,903,177   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=false]
    4,242,172   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]
    5,141,588   ns        7677 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]
    1,956,718   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=false]
    4,836,122   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]
    5,733,787   ns        7720 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]
    3,504,924   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=false]
    4,596,421   ns        9608 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=false]
    3,663,407   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=false]
    2,849,725   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=false]
    2,564,999   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=false]
    1,887,524   ns        2045 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=false]
    3,655,524   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=false]
    2,133,149   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=false]
    5,257,675   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]
    4,106,915   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=false]
    4,137,564   ns        9456 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]
    """.trimIndent()
    val regex = """\s*(?<time>[0-9,.]+)\s+(?<timeunit>[a-zA-Z]+)\s+(?<allocs>[0-9]+)\sallocs\s+Trace\s+Method\sTrace\s+(?<benchmark>.+)""".toRegex()

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

    ResultType.values().forEach { printResults(it, results) }
}

private fun printResults(type: ResultType, results: List<Analysis>) {
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

private enum class ResultType(val description: String, val groupings: List<Grouping>) {
    SERIALIZATION_TYPE(
        description = "Grouped by serialization type (read, write, buffered, string)",
        groupings = listOf(
            Grouping("Read (buffered)") {
                "_buffer" in it && "_fromJson" in it
            },
            Grouping("Read (string)") {
                "_string" in it && "_fromJson" in it
            },
            Grouping("Write (buffered)") {
                "_buffer" in it && "_toJson" in it
            },
            Grouping("Write (string)") {
                "_string" in it && "_toJson" in it
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
                "moshi_" in it && "kotlin" !in it
            },
            Grouping("Moshi Kotlin") {
                "moshi_kotlin" in it
            }
        )
    )
}

internal data class Grouping(
    val name: String,
    val matchFunction: (String) -> Boolean,
)

internal data class Analysis(
    val benchmark: String,
    val score: Long,
    val units: String,
) {
    override fun toString() = "$benchmark\t$score\t$units"

    fun formattedString(benchmarkLength: Int, scoreLength: Int): String {
        return String.format(
            Locale.US,
            "%-${benchmarkLength}s  %${scoreLength}s  %s",
            benchmark, formattedScore, units
        )
    }

    val formattedScore: String
        get() = String.format(Locale.US, "%,d", score)
}

internal operator fun <T> List<T>.component6(): T = this[5]
internal operator fun <T> List<T>.component7(): T = this[6]

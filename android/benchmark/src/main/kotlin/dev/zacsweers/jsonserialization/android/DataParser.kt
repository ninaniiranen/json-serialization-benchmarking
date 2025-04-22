package dev.zacsweers.jsonserialization.android

import java.util.Locale

fun main() {

    val data = """
    2,919,041   ns        9990 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=true]
    2,352,604   ns        9230 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]
    3,306,197   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]
    2,721,072   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]
    3,736,171   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]
   49,739,010   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]
    3,309,735   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]
    4,404,120   ns        7682 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]
    1,970,133   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]
    3,748,823   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]
    4,856,903   ns        7711 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]
    3,630,563   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]
    4,392,632   ns        9608 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=true]
    3,650,885   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=true]
    2,851,678   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=true]
    2,572,689   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]
    1,894,218   ns        2045 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=true]
    3,660,240   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=true]
    2,155,847   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]
    4,185,454   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]
    4,204,230   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]
    3,674,936   ns        9402 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]
    3,102,295   ns        9983 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=false]
    2,520,659   ns        9223 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]
    4,257,130   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]
    2,718,044   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=false]
    4,849,890   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]
   49,722,865   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=false]
    4,267,296   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]
    5,304,337   ns        7677 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]
    1,965,364   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=false]
    4,848,599   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]
    5,904,821   ns        7720 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]
    3,575,925   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=false]
    4,612,776   ns        9608 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=false]
    3,660,349   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=false]
    2,855,217   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=false]
    2,571,705   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=false]
    1,899,375   ns        2045 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=false]
    3,665,889   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=false]
    2,153,954   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=false]
    5,271,666   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]
    4,201,725   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=false]
    4,132,925   ns        9456 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]
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

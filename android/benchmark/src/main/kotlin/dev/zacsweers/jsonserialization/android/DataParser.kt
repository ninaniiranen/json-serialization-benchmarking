package dev.zacsweers.jsonserialization.android

import java.util.Locale

fun main() {

    val data = """
    2,834,600   ns        9990 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=true]
    2,414,226   ns        9230 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]
    3,312,363   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]
    2,685,229   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]
    3,757,564   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]
    51,239,115   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]
    3,355,845   ns        5402 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]
    4,400,347   ns        7682 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]
    2,018,725   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]
    3,806,987   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]
    4,840,885   ns        7711 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]
    3,557,734   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]
    3,119,104   ns       10565 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=true]
    3,686,192   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=true]
    2,837,780   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=true]
    2,604,572   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]
    2,503,541   ns         263 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=true]
    3,660,961   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=true]
    2,117,916   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]
    4,206,401   ns        5431 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]
    4,101,052   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]
    3,812,332   ns        9402 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]
    2,997,468   ns        9983 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_fromJson[minified=false]
    2,591,292   ns        9223 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]
    4,248,973   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]
    2,681,005   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_toJson[minified=false]
    4,859,000   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]
    51,336,978   ns       68395 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_toJson[minified=false]
    4,299,301   ns        5397 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]
    5,313,846   ns        7677 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]
    2,011,029   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=false]
    4,918,512   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]
    5,898,057   ns        7720 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]
    3,498,356   ns       14186 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=false]
    3,375,230   ns       10565 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_fromJson[minified=false]
    3,679,681   ns        3517 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_string_toJson[minified=false]
    2,846,756   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_toJson[minified=false]
    2,599,062   ns        2316 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=false]
    2,505,501   ns         263 allocs    Trace    Method Trace    AndroidBenchmark.kserializer_string_toJson[minified=false]
    3,648,846   ns        3560 allocs    Trace    Method Trace    AndroidBenchmark.gson_reflective_string_toJson[minified=false]
    2,120,773   ns        2329 allocs    Trace    Method Trace    AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=false]
    5,289,765   ns        5440 allocs    Trace    Method Trace    AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]
    4,138,183   ns       14173 allocs    Trace    Method Trace    AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=false]
    4,310,629   ns        9456 allocs    Trace    Method Trace    AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]
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
        appendln()
        append(type.description)
        appendln(':')
        appendln()
        appendln("```")
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

# JSON Serialization Benchmarking

Miscellaneous benchmarks for JSON serialization on JVM/Android.

### [zacsweers.github.io/json-serialization-benchmarking](https://zacsweers.github.io/json-serialization-benchmarking/)

License
-------

    Copyright (C) 2019 Zac Sweers

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


Grouped by serialization type (read, write, buffered, string):

```
Read (buffered)
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,312,363  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,355,845  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,812,332  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,248,973  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,299,301  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,310,629  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,400,347  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,313,846  ns

Read (string)
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,414,226  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,591,292  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,834,600  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           2,997,468  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                3,119,104  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               3,375,230  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,757,564  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,806,987  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,206,401  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,840,885  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,859,000  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,918,512  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,289,765  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,898,057  ns

Write (buffered)
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         2,018,725  ns
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,117,916  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,557,734  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              51,239,115  ns

Write (string)
AndroidBenchmark.kserializer_string_toJson[minified=true]                  2,503,541  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,604,572  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,685,229  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,837,780  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,660,961  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,686,192  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,101,052  ns
```

Grouped by library (interesting to see how reflection vs custom adapters affects perf within a library):

```
GSON
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,414,226  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,591,292  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,834,600  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           2,997,468  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,660,961  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,686,192  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,812,332  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,310,629  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              51,239,115  ns

Kotlinx Serialization
AndroidBenchmark.kserializer_string_toJson[minified=true]                  2,503,541  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                3,119,104  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               3,375,230  ns

Moshi
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,117,916  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,685,229  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,837,780  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,312,363  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,757,564  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,206,401  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,248,973  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,859,000  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,289,765  ns

Moshi Kotlin
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         2,018,725  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,604,572  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,355,845  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,557,734  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,806,987  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,101,052  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,299,301  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,400,347  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,840,885  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,918,512  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,313,846  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,898,057  ns
```
---

Grouped by serialization type (read, write, buffered, string):

```
Read (buffered)
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,291,213  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,304,158  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,667,723  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,137,564  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,201,765  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,217,546  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,242,172  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,141,588  ns

Read (string)
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,365,389  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,544,135  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,907,614  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           3,112,994  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,719,274  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,751,024  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,157,874  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                4,401,051  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               4,596,421  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,655,439  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,836,122  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,840,880  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,257,675  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,733,787  ns

Write (buffered)
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         1,961,368  ns
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,138,975  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,516,033  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              49,701,771  ns

Write (string)
AndroidBenchmark.kserializer_string_toJson[minified=true]                  1,878,791  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,564,754  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,700,573  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,845,949  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,657,083  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,669,262  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,098,317  ns
```

Grouped by library (interesting to see how reflection vs custom adapters affects perf within a library):

```
GSON
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,365,389  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,544,135  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,907,614  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           3,112,994  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,657,083  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,667,723  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,669,262  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,137,564  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              49,701,771  ns

Kotlinx Serialization
AndroidBenchmark.kserializer_string_toJson[minified=true]                  1,878,791  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                4,401,051  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               4,596,421  ns

Moshi
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,138,975  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,700,573  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,845,949  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,291,213  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,719,274  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,157,874  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,217,546  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,840,880  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,257,675  ns

Moshi Kotlin
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         1,961,368  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,564,754  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,304,158  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,516,033  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,751,024  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,098,317  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,201,765  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,242,172  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,655,439  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,836,122  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,141,588  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,733,787  ns
```



---
---
---

Grouped by serialization type (read, write):

```
Read
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=first]    3,378,828  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=first]   4,329,855  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=last]     4,879,797  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=last]      5,302,170  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=first]     5,327,615  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=first]    5,876,313  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=last]     5,890,116  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=last]    6,895,086  ns

Write
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=last]       1,992,348  ns
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=first]      2,016,965  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=last]       52,391,093  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=first]      52,477,188  ns
```
---

Grouped by serialization type (read, write):

```
Read
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=first]    3,329,127  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=first]   4,260,677  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=last]     4,779,583  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=last]      5,386,666  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=first]     5,404,305  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=first]    5,881,033  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=last]     5,898,242  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=last]    6,843,697  ns

Write
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=last]       1,936,888  ns
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=first]      1,953,812  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=first]      52,263,073  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=last]       52,539,428  ns
```
---
---
---
---
Grouped by serialization type (read, write, buffered, string):

```
Read (buffered)
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,306,197  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,309,735  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,674,936  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,132,925  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,257,130  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,267,296  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,404,120  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,304,337  ns

Read (string)
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,352,604  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,520,659  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,919,041  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           3,102,295  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,736,171  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,748,823  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,185,454  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                4,392,632  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               4,612,776  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,848,599  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,849,890  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,856,903  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,271,666  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,904,821  ns

Write (buffered)
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         1,970,133  ns
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,155,847  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,630,563  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              49,739,010  ns

Write (string)
AndroidBenchmark.kserializer_string_toJson[minified=true]                  1,894,218  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,572,689  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,721,072  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,851,678  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,650,885  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,660,240  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,204,230  ns
```

Grouped by library (interesting to see how reflection vs custom adapters affects perf within a library):

```
GSON
AndroidBenchmark.gson_autovalue_string_fromJson[minified=true]             2,352,604  ns
AndroidBenchmark.gson_autovalue_string_fromJson[minified=false]            2,520,659  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=true]            2,919,041  ns
AndroidBenchmark.gson_reflective_string_fromJson[minified=false]           3,102,295  ns
AndroidBenchmark.gson_autovalue_string_toJson[minified=true]               3,650,885  ns
AndroidBenchmark.gson_reflective_string_toJson[minified=true]              3,660,240  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=true]             3,674,936  ns
AndroidBenchmark.gson_autovalue_buffer_fromJson[minified=false]            4,132,925  ns
AndroidBenchmark.gson_autovalue_buffer_toJson[minified=true]              49,739,010  ns

Kotlinx Serialization
AndroidBenchmark.kserializer_string_toJson[minified=true]                  1,894,218  ns
AndroidBenchmark.kserializer_string_fromJson[minified=true]                4,392,632  ns
AndroidBenchmark.kserializer_string_fromJson[minified=false]               4,612,776  ns

Moshi
AndroidBenchmark.moshi_autovalue_buffer_toJson[minified=true]              2,155,847  ns
AndroidBenchmark.moshi_autovalue_string_toJson[minified=true]              2,721,072  ns
AndroidBenchmark.moshi_reflective_string_toJson[minified=true]             2,851,678  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=true]            3,306,197  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=true]            3,736,171  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=true]           4,185,454  ns
AndroidBenchmark.moshi_autovalue_buffer_fromJson[minified=false]           4,257,130  ns
AndroidBenchmark.moshi_autovalue_string_fromJson[minified=false]           4,849,890  ns
AndroidBenchmark.moshi_reflective_string_fromJson[minified=false]          5,271,666  ns

Moshi Kotlin
AndroidBenchmark.moshi_kotlin_codegen_buffer_toJson[minified=true]         1,970,133  ns
AndroidBenchmark.moshi_kotlin_codegen_string_toJson[minified=true]         2,572,689  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=true]       3,309,735  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_toJson[minified=true]      3,630,563  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=true]       3,748,823  ns
AndroidBenchmark.moshi_kotlin_reflective_string_toJson[minified=true]      4,204,230  ns
AndroidBenchmark.moshi_kotlin_codegen_buffer_fromJson[minified=false]      4,267,296  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=true]    4,404,120  ns
AndroidBenchmark.moshi_kotlin_codegen_string_fromJson[minified=false]      4,848,599  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=true]    4,856,903  ns
AndroidBenchmark.moshi_kotlin_reflective_buffer_fromJson[minified=false]   5,304,337  ns
AndroidBenchmark.moshi_kotlin_reflective_string_fromJson[minified=false]   5,904,821  ns
```
---

Grouped by serialization type (read, write):

```
Read
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=first]    3,322,161  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=first]   4,271,177  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=true,typeKeyLocation=last]     4,790,746  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=last]      5,338,205  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=true,typeKeyLocation=first]     5,368,211  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=first]    5,852,979  ns
AndroidPolymorphicBenchmark.gson_fromJson[minified=false,typeKeyLocation=last]     5,885,173  ns
AndroidPolymorphicBenchmark.moshi_fromJson[minified=false,typeKeyLocation=last]    6,817,343  ns

Write
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=last]       1,946,549  ns
AndroidPolymorphicBenchmark.moshi_toJson[minified=true,typeKeyLocation=first]      1,968,378  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=last]       52,074,949  ns
AndroidPolymorphicBenchmark.gson_toJson[minified=true,typeKeyLocation=first]      52,089,739  ns
```

package com.mada.kotlin.kotlincourse.tldbits

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    val res = capitalAndPopulation(country)
    return Triple(country, res.first, res.second)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("Spain")

    println(result.first + "\n" + result.second.toString())

    val smthing = countryInformation("Spain")
    println("""

        ${smthing.first}
        ${smthing.second}
        ${smthing.third}
    """.trimIndent())

    val (capital, population) = capitalAndPopulation("Spain")
    println("""

        ${capital}
        ${population}

        """.trimIndent())

    val listOfCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital2, country2) in listOfCapitalsAndCountries)
        println("capital: $capital2 of country: $country2")
}
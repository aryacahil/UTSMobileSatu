package com.example.utskotlin

// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ligaChampions: Int,
    val ligaEropa: Int

) {
    val totalTrophy: Int
        get() = epl + fa + efl + ligaChampions + ligaEropa
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $epl trofi Liga Premier Inggris, $fa trofi FA, $efl trofi EFL, $ligaChampions trofi Liga Champion, dan $ligaEropa trofi Liga Eropa UEFA"

}
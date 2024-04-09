package com.practiceKotlin.lec10

class Cat(
    species: String
) : JavaAnimal(species, 4) {

    override fun move() {
        println("고양이가 사분 사분 걸어가~")
    }
}
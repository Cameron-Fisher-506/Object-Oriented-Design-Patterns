package za.co.objectorienteddesignpatterns.structural.adapter

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(private val squarePeg: SquarePeg): RoundPeg() {
    override fun getRadius(): Double {
        // Calculate a minimum circle radius, which can fit this peg.
        val result = (sqrt((squarePeg.width / 2).pow(2.0) * 2))
        return result
    }
}
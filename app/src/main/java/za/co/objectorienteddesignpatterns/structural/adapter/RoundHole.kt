package za.co.objectorienteddesignpatterns.structural.adapter

class RoundHole(private val radius: Double) {
    fun fits(roundPeg: RoundPeg): Boolean {
        return radius >= roundPeg.getRadius()
    }
}
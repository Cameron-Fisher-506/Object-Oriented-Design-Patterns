package za.co.objectorienteddesignpatterns.structural.adapter.roundHoleSquarePeg

class RoundHole(private val radius: Double) {
    fun fits(roundPeg: RoundPeg): Boolean {
        return radius >= roundPeg.getRadius()
    }
}
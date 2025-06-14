package za.co.objectorienteddesignpatterns.structural.adapter.roundHoleSquarePeg

fun main() {
    val hole = RoundHole(5.0)

    val roundPeg = RoundPeg(3.3)
    println("Round peg with radius ${roundPeg.getRadius()} fits: ${hole.fits(roundPeg)}")

    val squarePegOne = SquarePeg(1.1)
    var squarePegAdapter = SquarePegAdapter(squarePegOne)
    println("Square peg with width ${squarePegOne.width} fits: ${hole.fits(squarePegAdapter)}")

    val squarePegTwo = SquarePeg(7.1)
    squarePegAdapter = SquarePegAdapter(squarePegTwo)
    println("Square peg with width ${squarePegTwo.width} fits: ${hole.fits(squarePegAdapter)}")
}
package za.co.objectorienteddesignpatterns.structural.adapter

open class RoundPeg {
    private var radius: Double = 0.0

    constructor()

    constructor(radius: Double) {
        this.radius = radius
    }

    open fun getRadius(): Double = radius
}
package com.mix.data_object

open class Canvas {
    private val defaultColor = "red"
    open fun draw() {
        println("Canvas draw ${this.defaultColor}")
    }
}

class Rect : Canvas() {
    private val rectColor = "black"
    private var _width: Number = 0
    var width: Number
        get() {
            return this._width
        }
        set(value) {
            this._width = value
            this.draw()
        }

    override fun draw() {
        super.draw()
        println("Rect draw ${this.rectColor} width ${this.width}")
    }
}

fun main() {
    val rect = Rect()
    rect.draw()
    rect.width = 10
}
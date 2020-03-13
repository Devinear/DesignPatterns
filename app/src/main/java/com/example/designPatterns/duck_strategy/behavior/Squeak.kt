package com.example.designPatterns.duck_strategy.behavior

class Squeak : QuackBehavior {
    override fun quack() : String = "삑삑!"
}
package com.example.designPatterns.duck_strategy.behavior

class Quack : QuackBehavior {
    override fun quack() : String = "꽥!꽥!"
}
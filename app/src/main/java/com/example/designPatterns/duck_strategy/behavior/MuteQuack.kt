package com.example.designPatterns.duck_strategy.behavior

class MuteQuack : QuackBehavior {
    override fun quack() : String = "조용조용..."
}
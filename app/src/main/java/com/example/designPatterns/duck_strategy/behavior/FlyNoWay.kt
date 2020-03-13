package com.example.designPatterns.duck_strategy.behavior

class FlyNoWay : FlyBehavior {
    override fun fly() : String = "어떻게 날지...?"
}
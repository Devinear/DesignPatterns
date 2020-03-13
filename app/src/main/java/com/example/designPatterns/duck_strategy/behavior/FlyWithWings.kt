package com.example.designPatterns.duck_strategy.behavior

class FlyWithWings : FlyBehavior {
    override fun fly() : String = "I Can Fly!"
}
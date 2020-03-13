package com.example.designPatterns.duck_strategy

import com.example.designPatterns.duck_strategy.behavior.FlyWithWings
import com.example.designPatterns.duck_strategy.behavior.Quack

class MallardDuck : Duck() {

    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() : String = "이오리가 아닌 물오리!!"
}
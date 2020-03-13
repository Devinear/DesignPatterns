package com.example.designPatterns.duck_strategy

import com.example.designPatterns.duck_strategy.behavior.FlyNoWay
import com.example.designPatterns.duck_strategy.behavior.Squeak

class RubberDuck : Duck() {

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Squeak()
    }

    override fun display(): String = "장난감 오리는 날지 못한다!"
}
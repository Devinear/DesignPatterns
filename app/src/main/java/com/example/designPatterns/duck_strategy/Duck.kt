package com.example.designPatterns.duck_strategy

import android.content.Context
import android.widget.Toast
import com.example.designPatterns.duck_strategy.behavior.FlyBehavior
import com.example.designPatterns.duck_strategy.behavior.QuackBehavior

abstract class Duck {
    var flyBehavior : FlyBehavior? = null
    var quackBehavior : QuackBehavior? = null

    abstract fun display() : String

    fun performFly(context: Context) {
        Toast.makeText(context, flyBehavior?.fly()?:"PerformFly", Toast.LENGTH_SHORT).show()
    }

    fun performQuack(context: Context) {
        Toast.makeText(context, quackBehavior?.quack()?:"PerformQuack", Toast.LENGTH_SHORT).show()
    }

    fun swim(context: Context) {
        Toast.makeText(context, "모든 Duck는 물에 뜨지 않을까?", Toast.LENGTH_SHORT).show()
    }
}
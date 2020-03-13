package com.example.designPatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designPatterns.duck_strategy.MallardDuck
import com.example.designPatterns.duck_strategy.RubberDuck

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun simulatorDuck() {
        val mallard = MallardDuck()
        mallard.performFly(this)
        mallard.performQuack(this)
        mallard.display()

        val rubber = RubberDuck()
        rubber.performFly(this)
        rubber.performQuack(this)
        rubber.display()
    }
}

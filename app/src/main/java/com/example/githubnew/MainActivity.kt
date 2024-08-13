package com.example.githubnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubnew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupPlus()
        setupMinus()
        setupMultiply()
        setupDivide()

    }
    private fun setupPlus() {
        binding.plus.setOnClickListener {
            val firstNum = binding.firstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = binding.secondNum.text.toString().toDoubleOrNull() ?: 0.0
            val result = firstNum + secondNum
            binding.result.text = result.toString()
        }
    }
    private fun setupMinus() {
        binding.minus.setOnClickListener {
            val firstNum = binding.firstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = binding.secondNum.text.toString().toDoubleOrNull() ?: 0.0
            val result = firstNum - secondNum
            binding.result.text = result.toString()
        }
    }
    private fun setupMultiply() {
        binding.multiply.setOnClickListener {
            val firstNum = binding.firstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = binding.secondNum.text.toString().toDoubleOrNull() ?: 0.0
            val result = firstNum * secondNum
            binding.result.text = result.toString()


        }
    }

    private fun setupDivide() {
        binding.divide.setOnClickListener {
            val firstNum = binding.firstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = binding.secondNum.text.toString().toDoubleOrNull() ?: 0.0
            if (secondNum != 0.0) {
                val result = firstNum / secondNum
                binding.result.text = result.toString()


            }

        }
    }
}
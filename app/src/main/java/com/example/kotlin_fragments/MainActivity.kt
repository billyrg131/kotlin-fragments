package com.example.kotlin_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.kotlin_fragments.databinding.ActivityMainBinding
private lateinit var fragmentManager : FragmentManager
private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener {
            goToFragment(Fragment1())
        }

        binding.fragment2Btn.setOnClickListener {
            goToFragment(Fragment2())
        }
    }

    private fun goToFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}
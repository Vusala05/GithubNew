package com.example.githubnew

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.githubnew.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("NoteData", Context.MODE_PRIVATE)
        binding.save.setOnClickListener{
            val note = binding.notes.text.toString()

            val preferencesEdit = sharedPreferences.edit()
            preferencesEdit.putString("notes",note)
            preferencesEdit.apply()
            Toast.makeText(this,"notes successfully saved", Toast.LENGTH_SHORT).show()
            binding.notes.text.clear()

        }
        binding.display.setOnClickListener{
            val storedData = sharedPreferences.getString("notes"," ")
            binding.noteText.text = "$storedData"
        }



    }
}

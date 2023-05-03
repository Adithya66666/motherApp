package com.example.babycare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babycare.databinding.ActivityChatBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class Chat : AppCompatActivity() {
    private lateinit var binding:ActivityChatBinding
    private lateinit var user:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityChatBinding.inflate(layoutInflater)
        user = FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
    }
}
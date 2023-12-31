package com.example.passleybank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Retrieving references to buttons
        val accountsButton: Button = findViewById(R.id.accountsButton)
        val transactionsButton: Button = findViewById(R.id.transactionsButton)

        // Setting click listeners for the buttons
        accountsButton.setOnClickListener {
            // Perform an action when the Accounts button is clicked
            val intent = Intent(this@MainActivity, AccountsActivity::class.java)
            startActivity(intent)
        }

        transactionsButton.setOnClickListener {
            // Perform an action when the Transactions button is clicked
            val intent = Intent(this@MainActivity, TransactionsActivity::class.java)
            startActivity(intent)
        }
    }
}

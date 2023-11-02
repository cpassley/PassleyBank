package com.example.passleybank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class AccountsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accounts)

        // Retrieving references to buttons
        val homeButton: Button = findViewById(R.id.accountsToHomeButton)
        val transactionsButton: Button = findViewById(R.id.accountsToTransactionsButton)

        // Setting click listeners for the buttons
        homeButton.setOnClickListener {
            // Perform an action when the Home button is clicked
            val intent = Intent(this@AccountsActivity, MainActivity::class.java)
            startActivity(intent)
        }

        transactionsButton.setOnClickListener {
            // Perform an action when the Transactions button is clicked
            val intent = Intent(this@AccountsActivity, TransactionsActivity::class.java)
            startActivity(intent)
        }
    }
}

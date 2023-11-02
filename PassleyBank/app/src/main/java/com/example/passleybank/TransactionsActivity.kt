package com.example.passleybank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class TransactionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checking_transactions)

        // Retrieving references to navigation buttons
        val homeButton: Button = findViewById(R.id.checkingToHomeButton)
        val accountsButton: Button = findViewById(R.id.checkingToAccountsButton)

        // Setting click listeners for the navigation buttons
        homeButton.setOnClickListener {
            // Perform an action when the Home button is clicked
            val intent = Intent(this@TransactionsActivity, MainActivity::class.java)
            startActivity(intent)
        }

        accountsButton.setOnClickListener {
            // Perform an action when the Accounts button is clicked
            val intent = Intent(this@TransactionsActivity, AccountsActivity::class.java)
            startActivity(intent)
        }
    }
}

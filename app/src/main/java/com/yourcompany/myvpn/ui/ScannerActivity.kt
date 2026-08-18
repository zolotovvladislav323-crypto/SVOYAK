package com.yourcompany.myvpn.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yourcompany.myvpn.R

class ScannerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner)
        supportActionBar?.title = "Сканер QR"
    }
}

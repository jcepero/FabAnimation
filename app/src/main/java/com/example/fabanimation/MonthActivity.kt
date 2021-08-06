package com.example.fabanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)

        val items = listOf(
            Header("2019"),
            Month("Septiembre","Octubre"),
            Month("Noviembre","Diciembre"),
            Header("2020"),
            Month("Enero","Febrero"),
            Month("Marzo","Abril"),
            Month("Mayo","Junio"),
            Month("Julio","Agosto")
        )

        findViewById<RecyclerView>(R.id.rv).adapter = MonthAdapter(items)
    }
}
package stta.gabriel.chat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listViewType = mutableListOf(
            AdapterRecyclerView.ITEM_A,
            AdapterRecyclerView.ITEM_B,
            AdapterRecyclerView.ITEM_A,
            AdapterRecyclerView.ITEM_B,
            AdapterRecyclerView.ITEM_B,
            AdapterRecyclerView.ITEM_A,
            AdapterRecyclerView.ITEM_A,
            AdapterRecyclerView.ITEM_B,
            AdapterRecyclerView.ITEM_A
        )
        val adapterRecyclerView = AdapterRecyclerView(listViewType = listViewType)
        recyclerView.adapter = adapterRecyclerView
    }
}
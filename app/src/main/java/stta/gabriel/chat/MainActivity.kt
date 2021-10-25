package stta.gabriel.chat

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        val ITEM_A = 1
        val ITEM_B = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listViewType = mutableListOf(
            ITEM_A,
            ITEM_B,
            ITEM_A,
            ITEM_B,
            ITEM_B,
            ITEM_A,
            ITEM_A,
            ITEM_B,
            ITEM_A
        )
        setContent { MainScreen(listViewType) }
    }
}
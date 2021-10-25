package stta.gabriel.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import stta.gabriel.chat.MainActivity.Companion.ITEM_B

@Composable
fun MainScreen(list: List<Int>) {
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(0)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        list.forEachIndexed { index, i ->
            when (i) {
                ITEM_B -> {
                    Image(
                        painter = painterResource(R.drawable.anya),
                        contentDescription = "mba anya",
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                }
                else -> Text(
                    modifier = Modifier.padding(vertical = 16.dp),
                    text = "Ini layout item a dengan position $index",
                    color = Color.White
                )
            }
        }
    }
}
package com.godsonpeya.jetalbum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.godsonpeya.jetalbum.navigation.MyAlbumNavigation
import com.godsonpeya.jetalbum.screens.DetailScreen
import com.godsonpeya.jetalbum.ui.theme.JetAlbumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetAlbumTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                Surface() {
                    Text(text = " ")
                    MyAlbumNavigation(navHostController = navController)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetAlbumTheme {
//        DetailScreen()
    }
}
package com.godsonpeya.jetalbum.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.godsonpeya.jetalbum.R
import com.godsonpeya.jetalbum.components.PictureComponent
import com.godsonpeya.jetalbum.data.fleurs
import com.godsonpeya.jetalbum.navigation.AppScreen

@Composable
fun HomeScreen(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {


            Column(horizontalAlignment = Alignment.CenterHorizontally) {   //l'entete ou se trouve la photo et le nom
                Box(
                    // le box de l'image
                    modifier = Modifier,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.moi),
                        contentDescription = "mon image",
                        modifier = Modifier
                            .size(180.dp)
                            .clip(shape = CircleShape),
                    )
                }


                Text(text = "Godson Essonga",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold)
                Text(text = "FullStack developer", color = Color(0xFF2196F3))
            }   // fin de l'entete ou se trouve la photo et le nom


            Spacer(modifier = Modifier.height(30.dp)) //l'espace entre l'entete et le block du bas


            LazyVerticalGrid(columns = GridCells.Adaptive(190.dp),
                content = { //le tableau (grid) dynamique

                    item(span = { GridItemSpan(3) }) {
                        Text(text = "Liste de mes fleurs",
                            style = MaterialTheme.typography.h5,
                            fontWeight = FontWeight.Bold)
                    }
                    itemsIndexed(fleurs) { index, person ->
                        PictureComponent(person, index = index) { id->
                            navController.navigate(AppScreen.DetailScreen.name + "/"+ id)
                        }
                    }

                })//la fin du tableau (grid) dynamique


        }
    }
}

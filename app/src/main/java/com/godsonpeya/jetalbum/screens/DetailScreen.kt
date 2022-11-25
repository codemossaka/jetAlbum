package com.godsonpeya.jetalbum.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.godsonpeya.jetalbum.R
import com.godsonpeya.jetalbum.data.persons
import com.godsonpeya.jetalbum.ui.theme.JetAlbumTheme


@Composable
fun DetailScreen(navController: NavController, id: Int) {

    val imageId by remember{
        mutableStateOf(persons[id])
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "My Album") }, navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "BackMenu")
                }
            })
        }

    ) { innet ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(innet)) {
            Column {
                Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .weight(.3f)
                    .fillMaxWidth()) {
                    Image(painter = painterResource(id = imageId),
                        contentDescription = "une fleur", modifier = Modifier.size(300.dp))
                }


                Spacer(modifier = Modifier.height(30.dp))


                Card(modifier = Modifier
                    .weight(.7f)
                    .padding(horizontal = 40.dp), elevation = 1.dp) {
                    Column(modifier = Modifier.padding(10.dp)) {

                        Text(text = "Heading",
                            style = MaterialTheme.typography.h4,
                            fontWeight = FontWeight.Bold)


                        Text(text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
                    }
                }

            }
        }
    }

}
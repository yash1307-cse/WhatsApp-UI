package com.yash1307.whatsapp_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_ui.R
import com.example.whatsapp_ui.ui.theme.WhatsAPP_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAPP_UITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Ui()
                }
            }
        }
    }
}

@Composable
fun Ui() {
    LazyColumn() {

        item {
            MaterialTheme() {
                Column {
                    TopAppBar(
                        title = {
                            Text(text = "WhatsApp")
                        },
                        backgroundColor = Color(0xFF128C7E),
                        actions = {
                            Row() {
                                Icon(Icons.Filled.Search, contentDescription = null)
                                Spacer(modifier = Modifier.width(16.dp))
                                Icon(Icons.Filled.MoreVert, contentDescription = null)
                            }
                        },
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.ironman),
                    contentDescription = "iron_man",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Tony Stark",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Iron-Man",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.spiderman),
                    contentDescription = "spider_man",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Peter Parker",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Spider-Man",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.doctor_strange),
                    contentDescription = "doctor_strange",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Doctor Strange",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Doctor Strange",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.thanos),
                    contentDescription = "thanos",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Thanos",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Thanos",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.hulk),
                    contentDescription = "hulk",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Bruce Banner",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Hulk",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.black_panther),
                    contentDescription = "black_panther",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "T'Challa ",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Black Panther",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.black_widow),
                    contentDescription = "black_widow",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Natasha",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Black Widow",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.rocket),
                    contentDescription = "rocket",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Rocket",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Rocket",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.groot),
                    contentDescription = "groot",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Groot",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Groot",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.falcon),
                    contentDescription = "falcon",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Sam",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am new Captain America",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

       /* item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.loki),
                    contentDescription = "loki",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Loki",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Loki",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }*/

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.hawkeye),
                    contentDescription = "hawkeye",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Clint Barton",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Hawkeye",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.war_machine),
                    contentDescription = "war_machine",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "James Rhodes",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am War Machine",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.thor),
                    contentDescription = "thor",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Thor",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I am Thor",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painterResource(id = R.drawable.captain_america),
                    contentDescription = "captain_america",
                    Modifier
                        .size(70.dp)
                        .padding(all = 5.dp)
                        .border(2.5.dp, Color.Green, shape = CircleShape)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(
                        text = "Steve Rogers",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "I was Captain America",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 5.dp),
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
        }
    }
}

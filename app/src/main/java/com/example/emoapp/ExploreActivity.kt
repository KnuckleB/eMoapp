package com.example.emoapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  Explore() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopappBar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )
                }
            },


            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications",
                        tint = Color.Black
                    )

                    IconButton(onClick = {

                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                    }) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "share",
                            tint = Color.Black
                        )

                    }

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )

                }
            })
//End of Topappbar
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            androidx.compose.material3.Text(
                text = "Tickets",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            //Row1
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.newyork),
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                            /*TODO*/
                        }) {
                            androidx.compose.material3.Text(text = "Call")
                        }
                        OutlinedButton(onClick = {

                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Glory...")
                            mContext.startActivity(shareIntent)


                        }) {
                            androidx.compose.material3.Text(text = "Email")
                        }
                    }


                }
                //End of column1
                Spacer(modifier = Modifier.padding(start = 10.dp))
                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.newyork),
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                            /*TODO*/
                        }) {
                            androidx.compose.material3.Text(text = "Call")
                        }
                        OutlinedButton(onClick = {

                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Glory...")
                            mContext.startActivity(shareIntent)


                        }) {
                            androidx.compose.material3.Text(text = "Email")
                        }
                    }


                }
                //End of column2
            }
            Spacer(modifier = Modifier.height(50.dp))
            //Row2
            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.newyork),
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                            /*TODO*/
                        }) {
                            androidx.compose.material3.Text(text = "Call")
                        }
                        OutlinedButton(onClick = {

                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Glory...")
                            mContext.startActivity(shareIntent)


                        }) {
                            androidx.compose.material3.Text(text = "Email")
                        }
                    }


                }
                //End of column1
                Spacer(modifier = Modifier.padding(start = 10.dp))
                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.newyork),
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                            /*TODO*/
                        }) {
                            androidx.compose.material3.Text(text = "Call")
                        }
                        OutlinedButton(onClick = {

                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Glory...")
                            mContext.startActivity(shareIntent)


                        }) {
                            androidx.compose.material3.Text(text = "Email")
                        }
                    }


                }
                //End of column2
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            DestinationActivity::class.java
                        )
                    )
                },
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Blue),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),

                ) {
                androidx.compose.material3.Text(
                    text = "DESTINATION",
                    color = Color.Black
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview() {
    Explore()
}
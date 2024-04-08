package com.example.emoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Woof()

        }
    }
}

@Composable
fun Woof() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
    ) {
        Spacer(modifier = Modifier.height(13.dp))

        // Introductory row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.newyork),
                contentDescription = "newyork",
                modifier = Modifier.height(50.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            androidx.compose.material3.Text(
                text = "Woof",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif
            )
        }
        // End of introductory row
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Koda",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "2 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Lola",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "16 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Frankie",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "2 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))


        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Nox",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "8 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))


        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Faye",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "8 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))


        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Bella",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "14 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Moana",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "2 years old")
                }
            }
            //End of row 1
        }
        Spacer(modifier = Modifier.height(15.dp))


        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 15.dp, topEnd = 15.dp)
        ) {
            //Row1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.newyork),
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(4.dp))

                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Tzeitel",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(text = "7 years old")
                }
            }
            //End of row 1

        }

    }
}

@Preview(showBackground = true)
@Composable
fun WoofPreview() {
    Woof()
}
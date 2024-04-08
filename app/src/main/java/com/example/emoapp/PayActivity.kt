package com.example.emoapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PayActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pay()
        }
    }
}

@Composable
fun Pay() {


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val mContext = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.pay),
                contentDescription = "icon",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(400.dp))
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.material3.Text(
                text = "Pay by Cart",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.material3.Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam assumenda at atque consequatur cupiditate",
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
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
                            ChairsActivity::class.java
                        )
                    )
                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Blue),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),

                ) {
                androidx.compose.material3.Text(
                    text = "Get Started",
                    color = Color.Yellow
                )
            }

        }
    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PayPreview() {
    Pay()
}
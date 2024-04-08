package com.example.emoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            layout()
        }
    }
}

@SuppressLint("ComposableNaming")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun layout(){
    Column(modifier = Modifier.fillMaxSize()){
val mContext = LocalContext.current
        //TopappBar
        TopAppBar(title = {androidx.compose.material3.Text(text = "Home", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.White
                    )
                }
            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                                tint = Color.White)

                }
            })
//End of Topappbar

        Spacer(modifier = Modifier.height(5.dp))

        androidx.compose.material3.Text(
            text = "BREED OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        //first row
        Row {
            Image(painter = painterResource(id = R.drawable.dog),
                contentDescription = "dog",
                modifier = Modifier.size(width = 300.dp,
               height =  100.dp ))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "BULL DOG",
                    fontSize = 18.sp)
                Spacer(modifier = Modifier.height(100.dp))
            }

        }
        Row {
            Image(painter = painterResource(id = R.drawable.dog),
                contentDescription = "dog",
                modifier = Modifier.size(width = 300.dp,
                    height =  100.dp ))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "BULL DOG",
                    fontSize = 18.sp)
                Spacer(modifier = Modifier.height(100.dp))
            }

        }
        Row {
            Image(painter = painterResource(id = R.drawable.dog),
                contentDescription = "dog",
                modifier = Modifier.size(width = 300.dp,
                    height =  100.dp ))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "BULL DOG",
                    fontSize = 18.sp)
                Spacer(modifier = Modifier.height(100.dp))
            }

        }

Row {
    Button(
        onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Blue)
    )
    {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrowback", tint = Color.White)
        androidx.compose.material3.Text(text = "Back")
        Spacer(modifier = Modifier.width(40.dp))
    }
    Spacer(modifier = Modifier.width(40.dp))
    Row {
        Button(
            onClick = { mContext.startActivity(Intent(mContext,IntentActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        )
        {
            androidx.compose.material3.Text(text = "Next")
            Spacer(modifier = Modifier.width(40.dp))
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Arrowfowward", tint = Color.White)
        }
    }
    Row {
        Button(
            onClick = { mContext.startActivity(Intent(mContext,FirstScreenActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        )
        {
            androidx.compose.material3.Text(text = "Next")
            Spacer(modifier = Modifier.width(40.dp))
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Arrowfowward", tint = Color.White)
        }
    }
}




    }
}
@Preview(showBackground = true)
@Composable
fun LayoutPreview() {
   layout()
}
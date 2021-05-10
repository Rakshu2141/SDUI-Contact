package com.example.contact

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.runtime.Providers
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview


class MainActivity : AppCompatActivity() {
    lateinit var itemsCells: ArrayList<String?>

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setContent{
            Surface(color = MaterialTheme.colors.background){
                Contact()
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun Contact() {
    Scaffold(
        topBar = {
            ->
            TopAppBar(
                backgroundColor = Color(red = 102, green = 60, blue = 176),
            ) {
                Column(
                    modifier = Modifier.padding(6.dp))

                {
                    Row() {
                        Image(
                            imageResource(id = R.drawable.homepage),
                            modifier = Modifier.padding(9.dp).height(30.dp).width(30.dp).clickable(onClick = {})
                        )
                        Spacer(modifier = Modifier.padding(horizontal = 30.dp))
                        Text(text = "CONTACT_LIST",
                            modifier = Modifier.padding(horizontal = 14.dp),
                            color = Color.White,
                            style = TextStyle(fontWeight = FontWeight.Bold,fontSize = 20.sp,),
                            textAlign = TextAlign.Center,
                        )
                        Spacer(modifier = Modifier.padding(horizontal = 30.dp))
                        Image(
                            imageResource(id = R.drawable.qn),
                            modifier = Modifier.padding(9.dp).height(30.dp).width(30.dp).clickable(onClick = {})
                        )
                    }
                }
            }
        },
        bodyContent =
        {
            Surface(
                color = Color(red = 227, green = 227, blue = 227),
                modifier = Modifier.fillMaxSize())
            {
                Column(modifier = Modifier.padding(6.dp)) {
                    Spacer(modifier = Modifier.padding(horizontal = 3.dp))
                    Surface(color = Color.White) {
                            ScrollableColumn(modifier = Modifier.padding(5.dp).background(color=Color.LightGray)) {
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Aakash",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+1234567890",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Aashtha",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+9942603432",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Bandhu",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+6369287250",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Bharani",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+7865464399",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Gayathri",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+1234567890",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Naveen",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+7565987457",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(70.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Raksha",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+6369287250",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }
                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(80.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Shri Hari",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+6845454734",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(80.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Anu",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+9942603432",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }
                                Divider(color = Color.DarkGray)
                                Card(
                                    modifier = Modifier.height(80.dp).width(372.dp).padding(7.dp)
                                        .clickable(onClick = {})
                                ) {
                                    Row() {
                                        Image(
                                            imageResource(id = R.drawable.profile),
                                            modifier = Modifier.height(50.dp).width(50.dp)
                                        )
                                        Column(modifier = Modifier.padding(horizontal = 3.dp)) {
                                            Text(
                                                "Radhai",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),fontSize = 15.sp
                                            )
                                            Spacer(modifier = Modifier.padding(horizontal = 14.dp))
                                            Text(
                                                "+9942467919",
                                                modifier = Modifier.padding(horizontal = 14.dp),
                                                style = TextStyle(fontWeight = FontWeight.Bold),
                                                color = Color(red = 102, green = 60, blue = 176),
                                            )
                                        }
                                    }

                                }

                            }
                    }
                }
            }
        }

    )
}
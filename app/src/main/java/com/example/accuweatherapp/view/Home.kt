package com.example.accuweatherapp.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.accuweatherapp.R
import com.example.accuweatherapp.util.AccuWeatherAppTheme
import com.example.accuweatherapp.util.Typography
import com.example.accuweatherapp.util.darkBlue

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccuWeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                  //  WeatherScreen()
                }
            }
        }
    }
}

/*@Composable
fun WeatherScreen() {
    val context = LocalContext.current
    val background = Brush.verticalGradient(listOf(Color.Blue, darkBlue))
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 0.dp)
            .background(background)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.plus),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp).clickable {
                            context.startActivity(Intent(context, SearchCity::class.java))
                            (context as Activity)
                        },
                    alignment = Alignment.Center
                )
                Text(
                    text = "Mausam",
                    color = Color.White,
                    style = Typography.titleLarge,
                    textAlign = TextAlign.End, modifier = Modifier
                        .padding(5.dp)
                )
                Image(
                    painter = painterResource(R.drawable.align),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp), alignment = Alignment.Center
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Vancouver, BC",
                    color = Color.White,
                    style = Typography.headlineSmall,
                    textAlign = TextAlign.Center, modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    text = "6' C",
                    color = Color.White,
                    style = Typography.displayLarge,
                    textAlign = TextAlign.Center, modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    text = "Light Rain",
                    color = Color.White,
                    style = Typography.headlineLarge,
                    textAlign = TextAlign.Center, modifier = Modifier
                        .padding(5.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Surface(shape = MaterialTheme.shapes.extraLarge, shadowElevation = 0.5.dp) {
                        Text(
                            text = "MIN 13''",
                            modifier = Modifier.padding(all = 8.dp),
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Surface(shape = MaterialTheme.shapes.extraLarge, shadowElevation = 0.5.dp) {
                        Text(
                            text = "MAX 13''",
                            modifier = Modifier.padding(all = 8.dp),
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Surface(shape = MaterialTheme.shapes.extraLarge, shadowElevation = 0.5.dp) {
                        Text(
                            text = "AQI 13''",
                            modifier = Modifier.padding(all = 8.dp),
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }

                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column {
                        Text(
                            text = "Wind",
                            color = Color.Gray,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                        Text(
                            text = "NE 16mph",
                            color = Color.White,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                    }
                    Column {
                        Text(
                            text = "Rain",
                            color = Color.Gray,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                        Text(
                            text = "80%",
                            color = Color.White,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                    }
                    Column {
                        Text(
                            text = "Humidity",
                            color = Color.Gray,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                        Text(
                            text = "80%",
                            color = Color.White,
                            style = Typography.bodyLarge,
                            textAlign = TextAlign.Center, modifier = Modifier
                        )
                    }


                }


            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Today",
                        color = Color.White,
                        style = Typography.bodyLarge,
                        textAlign = TextAlign.Center, modifier = Modifier
                    )
                    Text(
                        text = "5-Day Forecast >",
                        color = Color.White,
                        style = Typography.bodyLarge,
                        textAlign = TextAlign.Center, modifier = Modifier
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.sunrise),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "11 PM",
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "8'",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.sunset),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "11 PM",
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "8'",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.wind),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "11 PM",
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "8'",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.pressure),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "11 PM",
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "8'",
                                style = MaterialTheme.typography.bodyLarge,
                            )
                        }

                    }


                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start
            ) {
                Row {
                    Text(
                        text = "Travel advisory for ",
                        color = Color.White,
                        style = Typography.bodyLarge

                    )
                    Text(
                        text = "Vancouver", color = Color.White, style = Typography.bodyLarge

                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "composable provided by the material3 package which takes a composable as the last argument." +
                            " Since trailing lambdas can be moved outside of the parentheses, you can add any content to the button as a child",
                    color = Color.White, style = Typography.titleMedium

                )
            }
            Spacer(modifier = Modifier.height(10.dp))

//ghfghfhg vhghghg gkjjhbn vghgh vv,jhbjbjk ,vghvjh vghvvj

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        color = Color.Cyan,
                        shadowElevation = 0.5.dp,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.sunrise),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Umbrella",
                                style = MaterialTheme.typography.bodyLarge
                            )

                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        color = Color.Green,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.sunset),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "RainCoat",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.small,
                        shadowElevation = 0.5.dp,
                        color = Color.Red,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.wind),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Cap",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }
                    Surface(
                        shape = MaterialTheme.shapes.medium,
                        shadowElevation = 0.5.dp,
                        color = Color.Magenta,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.pressure),
                                contentDescription = "wind"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Rain Shoes",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }

                    }


                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccuWeatherAppTheme {
        Surface {
            WeatherScreen()
        }
    }
}*/



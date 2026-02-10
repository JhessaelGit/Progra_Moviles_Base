package com.ucb.app.home.presentation.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.frame
import kotlinproject.composeapp.generated.resources.frame2
import kotlinproject.composeapp.generated.resources.frame3
import kotlinproject.composeapp.generated.resources.frame4
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.Center
    ){
        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Column(
                modifier = Modifier.weight(weight = 1f)
            ) {
                Text(text = "Explore", fontWeight = FontWeight.Normal, fontSize = 45.sp, color = Color.White)
                Text(text = "Collection", fontWeight = FontWeight.Bold, fontSize = 45.sp, color = Color.White)
            }
            Image(
                //descargar la imagen y ponerlo en el drawable
                contentDescription = null,
                modifier = Modifier.size(60.dp).background(Color.Gray).fillMaxWidth(),
                painter = painterResource(Res.drawable.frame4),//apretar alt +enter para que importe solo

            )
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(250.dp)
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        {
            Image(

                painterResource(Res.drawable.frame),
                contentDescription = null ,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter


            )
            Button(
                modifier = Modifier.align(Alignment.BottomCenter ),
                onClick = {
                }
            )
            {
                Text(text = "Children")
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        ){
            Image(
                painterResource(Res.drawable.frame2),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter


            )
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = {
                }
            ){
                Text(text="Woman")
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        {
            Image(
                painterResource(Res.drawable.frame3),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter


            )
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = {}
            )
            {
                Text(text="Men")
            }
        }
    }
}
package com.example.android_lab_5_konoplev


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Header()

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ColorBoxesRow()

            Spacer(modifier = Modifier.height(48.dp))

            CombineBlock()
        }
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Пример Compose-приложения",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Row, Column, Size, ARGB",
            fontSize = 18.sp
        )
    }
}

@Composable
fun ColorBoxesRow() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFFFF0000))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFF00FF00))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0x800000FF))
        )
    }
}

@Composable
fun CombineBlock() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0E0E0))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Левая колонка", fontWeight = FontWeight.Bold)
                Text("Текст 1")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Правая колонка", fontWeight = FontWeight.Bold)
                Text("Текст 2")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


    }
}



//green hello world
//val symbols = "Hello world!".filter { it.isLetter() }
//
//setContent {
//    val symbols = "Hello world!".filter { it.isLetter() }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp).background(color = Color.Green),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally,
//
//        ) {
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            for(char in symbols) {
//                Text(
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Blue,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            for(char in symbols.reversed()) {
//                Text(
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Red,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//            }
//        }
//    }
//}
//}

//argb
//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color.White)
//.padding(16.dp),
//verticalArrangement = Arrangement.Center,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0xFFFF0000))
//    )
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0x80FF0000))
//    )
//}

//scaffold
//Scaffold(
//topBar = {
//    TopAppBar(
//        title = {Text(text = "Scafffold example")}
//    )
//},
//floatingActionButton = {
//    FloatingActionButton(onClick = {}) {
//        Text(text = "+")
//    }
//}
//) { paddingValues ->
//    Column(
//        modifier = Modifier.padding(paddingValues).fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Основное содержимое")
//    }
//
//}
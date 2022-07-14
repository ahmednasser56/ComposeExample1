package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnScreen() {

    LazyColumn(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(items = getAllData()) { index, person ->
            PersonItem(person = person, index = index)
        }
    }
}

@Composable
fun PersonItem(person: Person, index: Int) {
    Row(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = person.age.toString(), fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier  = Modifier.width(24.dp))
        Text(text = "${person.firstName} ${person.lastName}", fontSize = 20.sp)
    }
}

data class Person(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)

fun getAllData(): List<Person> {
    return listOf(
        Person(
            id = 0,
            firstName = "John",
            lastName = "Doe",
            age = 20
        ),
        Person(
            id = 1,
            firstName = "Maria",
            lastName = "Garcia",
            age = 21
        ),
        Person(
            id = 2,
            firstName = "James",
            lastName = "Johnson",
            age = 22
        ),
        Person(
            id = 3,
            firstName = "Michael",
            lastName = "Brown",
            age = 23
        ),
        Person(
            id = 4,
            firstName = "Robert",
            lastName = "Davis",
            age = 24
        ),
        Person(
            id = 5,
            firstName = "Jenifer",
            lastName = "Miller",
            age = 25
        ),
        Person(
            id = 6,
            firstName = "Sarah",
            lastName = "Lopez",
            age = 26
        ),
        Person(
            id = 7,
            firstName = "Charles",
            lastName = "Wilson",
            age = 27
        ),
        Person(
            id = 8,
            firstName = "Daniel",
            lastName = "Taylor",
            age = 28
        ),
        Person(
            id = 9,
            firstName = "Mark",
            lastName = "Lee",
            age = 29
        ),
    )
}
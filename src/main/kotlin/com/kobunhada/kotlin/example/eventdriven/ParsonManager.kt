package com.kobunhada.kotlin.example.eventdriven

class ParsonManager {
    fun updatePerson(item: Item) {
        var person: Person = Person()
        person.name = item.owner
    }
}
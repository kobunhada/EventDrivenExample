package com.kobunhada.kotlin.example.eventdriven

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener

class Person {
    var name: String = ""
        set(value) {
            field = value
            println("Person.name=%s".format(field))
        }
    var age: Int? = null



}
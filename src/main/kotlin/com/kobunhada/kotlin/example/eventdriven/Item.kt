package com.kobunhada.kotlin.example.eventdriven

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener

class Item {
    var name: String = ""
    // use backing fields
    var owner: String = ""
        set(value) {
            field = value
            ParsonManager().updatePerson(this)
        }
    var description: String? = null

}
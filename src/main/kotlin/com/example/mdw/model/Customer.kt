package com.example.mdw.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Customer() {
    constructor(firstName: String, lastName: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }

    @Id
    @GeneratedValue
    var id: Long? = null
    var firstName: String? = null
    var lastName: String? = null
}

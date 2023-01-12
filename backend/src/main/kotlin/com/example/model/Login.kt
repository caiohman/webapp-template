package com.example.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "login")
class Login {
    @Id
    var id: Int? = null;

    lateinit var username: String
    lateinit var password: String

}

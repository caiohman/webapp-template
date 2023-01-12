package com.example.repository

import com.example.model.Login
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class LoginRepository: PanacheRepository<Login> {
    fun list() = listAll()
}

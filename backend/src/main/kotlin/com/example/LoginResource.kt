package com.example

import com.example.repository.LoginRepository
import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class LoginResource {

    @Inject
    lateinit var loginRepository: LoginRepository

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun listLogin() = loginRepository.list()
}

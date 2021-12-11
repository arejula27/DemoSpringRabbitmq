package tut1

import org.springframework.context.annotation.Profile
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Profile("sender")
@RestController
class Controller (
    val sender: Tut1Sender
        ){
    @GetMapping("/hola")
    fun greet():String{
        return "hola"
    }

    @GetMapping("/send")
    fun send(){
        sender.send()
    }






}
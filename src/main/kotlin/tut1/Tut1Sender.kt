package tut1

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.amqp.core.Queue;


class Tut1Sender {

    @Autowired
    private val template: RabbitTemplate? = null

    @Autowired
    private val queue: Queue? = null

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    fun send() {
        val message = "Hello World!"
        queue?.let { template!!.convertAndSend(it.name, message) }
        println(" [x] Sent '$message'")
    }

}

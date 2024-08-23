package net.stegard.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")  // complete endpoint depends on configured application message handler prefix, e.g. /app/hello
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep((int)(Math.random()*500)); // simulated delay
        return new Greeting(" " + HtmlUtils.htmlEscape(message.name()) + "!");
    }

}

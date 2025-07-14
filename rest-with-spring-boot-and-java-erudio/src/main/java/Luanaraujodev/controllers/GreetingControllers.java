package Luanaraujodev.controllers;

import Luanaraujodev.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;  // Corrigindo a importação de AtomicLong

@RestController
public class GreetingControllers {

    private static final String template = "hello, %s!";  // Corrigido o nome da variável
    private final AtomicLong counter = new AtomicLong();  // Corrigido o erro de digitação e instância do AtomicLong

    // http://localhost:8080/greeting?name=Luanaraujodev
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")  // Corrigido o erro de digitação em "defaultValue"
            String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));  // Corrigido o método "incrementAndGet" e o uso de String.format
    }
}
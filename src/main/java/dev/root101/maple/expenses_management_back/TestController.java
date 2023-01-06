/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.maple.expenses_management_back;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yo
 */
@Slf4j
@Tag(name = "TEST Controller", description = "Para probar el servicio")
@RestController
@RequestMapping("/jackson")
public class TestController {

    @GetMapping("/test")
    public ApiObject test() {
        return new ApiObject("hi", null);
    }
}

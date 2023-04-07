package ru.sleed.secondtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sleed.secondtask.service.TestService;
import ru.sleed.secondtask.service.impl.ServiceImpl;

@RestController
@RequestMapping("testController/")
public class TestController {
    private ServiceImpl serviceImpl;

    @Autowired
    public TestController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }


    @GetMapping("getName/{name}")
    public String getString(@PathVariable String name) {
        return serviceImpl.nameCreation(name);
    }

}

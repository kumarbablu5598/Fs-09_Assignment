package com.HitCount.controller;

import com.HitCount.model.Visiter;
import com.HitCount.service.VisiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class visiterController {
    @Autowired
    VisiterService visiterService;
    @GetMapping("username/{username}")
    public Visiter getcount(@PathVariable String username)
    {
        return visiterService.getcount(username);
    }
}

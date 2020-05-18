package com.example.WoTRecommender.controller;

import com.example.WoTRecommender.model.Tank;
import com.example.WoTRecommender.model.UserAnswer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TankController {

    @Autowired
    private KieSession session;

    @PostMapping("/changeTankType")
    public Tank changeType(@RequestBody Tank tank){
        session.insert(tank);
        session.fireAllRules();
        return tank;
    }
}

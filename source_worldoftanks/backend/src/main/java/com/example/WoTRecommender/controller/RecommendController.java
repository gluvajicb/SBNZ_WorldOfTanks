package com.example.WoTRecommender.controller;

import com.example.WoTRecommender.model.DTO.UserAnswerDTO;
import com.example.WoTRecommender.model.UserAnswer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/recommend")
public class RecommendController {

    @Autowired
    private KieSession session;

    @PostMapping(path = "/playstyle")
    public UserAnswer recommendTankPlaystyle(@RequestBody UserAnswerDTO ansDTO){

        UserAnswer ans = new UserAnswer();
        ans.setFrontend_question(ansDTO.getFrontend_question());
        ans.setFrontend_answer(ansDTO.getFrontend_answer());
        session.insert(ans);
        session.fireAllRules();

        return ans;

    }

}

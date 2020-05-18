package com.example.WoTRecommender.model.DTO;

public class UserAnswerDTO {

    private String frontend_question;
    private String frontend_answer;


    public UserAnswerDTO(String frontend_question, String frontend_answer) {
        this.frontend_question = frontend_question;
        this.frontend_answer = frontend_answer;
    }

    public UserAnswerDTO() {
    }

    public String getFrontend_question() {
        return frontend_question;
    }

    public void setFrontend_question(String frontend_question) {
        this.frontend_question = frontend_question;
    }

    public String getFrontend_answer() {
        return frontend_answer;
    }

    public void setFrontend_answer(String frontend_answer) {
        this.frontend_answer = frontend_answer;
    }
}

package com.example.WoTRecommender.model;

public class UserAnswer {

    private Integer answer_id;
    private String backend_question;
    private String frontend_question;
    private String frontend_answer;
    private String recommendedTank;

    public UserAnswer(String backend_question, String frontend_question, String frontend_answer, String recommended_Tank) {
        this.answer_id = 1;
        this.backend_question = backend_question;
        this.frontend_question = frontend_question;
        this.frontend_answer = frontend_answer;
        this.recommendedTank = recommended_Tank;
    }

    public UserAnswer() {
        this.answer_id = 1;
        this.backend_question = "";
        this.recommendedTank = "";
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public String getBackend_question() {
        return backend_question;
    }

    public void setBackend_question(String backend_question) {
        this.backend_question = backend_question;
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

    public String getRecommendedTank() {
        return recommendedTank;
    }

    public void setRecommendedTank(String recommendedTank) {
        this.recommendedTank = recommendedTank;
    }
}

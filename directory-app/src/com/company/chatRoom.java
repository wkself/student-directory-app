package com.company;

public class chatRoom{

    private String currentPerson;
    private String currentMessage;
    private String currentQuestion;

    public void setCurrentMessage(String s) {
        currentMessage = s;
    }

    public void setCurrentPerson(String sa) {
        currentPerson = sa;
    }

    public void setCurrentQuestion(String sb) {
        currentQuestion = sb;
    }

    public String getCurrentMessage() {
        return currentMessage;
    }

    public String getCurrentPerson() {
        return currentPerson;
    }

    public String getCurrentQuestion() {
        return currentQuestion;
    }


    public chatRoom(){

    }


}


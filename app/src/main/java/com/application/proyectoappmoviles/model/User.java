package com.application.proyectoappmoviles.model;

import java.io.Serializable;

public class User implements Serializable {

    private String full_name;
    private String number;
    private String email;
    private String password;
    private String id;
    private String type;
    private QuestionsCollaborator questionsCollaborator;
    private QuestionsUser questionsUser;

    public User(String id, String full_name, String number, String email, String password, String type) {
        this.full_name = full_name;
        this.number = number;
        this.email = email;
        this.password = password;
        this.id = id;
        this.type = type;
    }

    public User( String id,String full_name, String number, String email, String password, String type, QuestionsCollaborator questionsCollaborator) {
        this.full_name = full_name;
        this.number = number;
        this.email = email;
        this.password = password;
        this.id = id;
        this.type = type;
        this.questionsCollaborator = questionsCollaborator;
    }

    public User( String id,String full_name, String number, String email, String password, String type, QuestionsUser questionsUser) {
        this.full_name = full_name;
        this.number = number;
        this.email = email;
        this.password = password;
        this.id = id;
        this.type = type;
        this.questionsUser = questionsUser;
    }

    public QuestionsCollaborator getQuestionsCollaborator() {
        return questionsCollaborator;
    }

    public void setQuestionsCollaborator(QuestionsCollaborator questionsCollaborator) {
        this.questionsCollaborator = questionsCollaborator;
    }

    public QuestionsUser getQuestionsUser() {
        return questionsUser;
    }

    public void setQuestionsUser(QuestionsUser questionsUser) {
        this.questionsUser = questionsUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

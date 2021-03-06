package io.ricobot.theater.client.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Actor {

    private Long id;
    private String name;

    public Actor(){}

    public Actor(Long id){
        this.id = id;
    }

    public Actor(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.bezkoder.spring.jwt.mongodb.model;

import org.bson.types.Binary;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recursos")
public class Recurso {
    
    @Id
    private String id;

    @NotBlank
    @Size(max = 50)
    private String title;

    @NotBlank
    @Size(max = 50)
    private String type;

    private String link = null;

    @NotBlank
    @Size(max = 50)
    private boolean privado = false;

    @NotBlank
    @Size(max = 50)
    private String users;

    private Binary resource;

    public Recurso(String title, String type, String link, boolean privado, String users) {
        super();
        this.title = title;
        this.type = type;
        this.link = link;
        this.privado = privado;
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean getPrivado() {
        return privado;
    }
    
    public void setPrivado(boolean privado) {
        this.privado = privado;
    }
    
    public String getUser() {
        return users;
    }
    
    public void setUser(String users) {
        this.users = users;
    }

    public Binary getRecurso() {
        return resource;
    }

    public void setRecurso(Binary resource) {
        this.resource = resource;
    }
    
    @Override
    public String toString() {
        return "Recurso [id=" + id + ", title=" + title + ", type=" + type + ", link=" + link + ", privado=" + privado + ", users=" + users + ", resource=" + resource + "]";
    }
}
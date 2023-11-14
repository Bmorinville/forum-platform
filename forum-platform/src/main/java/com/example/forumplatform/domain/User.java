package com.example.forumplatform.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private List<String> posts;

}

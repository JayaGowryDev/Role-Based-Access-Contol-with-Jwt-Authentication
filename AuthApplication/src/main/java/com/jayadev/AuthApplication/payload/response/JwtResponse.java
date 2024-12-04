package com.jayadev.AuthApplication.payload.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type="Bearer";
    private Long id;
    private String username;
    private List<String> roles;

    public JwtResponse(String token, Long id, String username, List<String> roles) {
        this.token = token;

        this.id = id;
        this.username = username;
        this.roles = roles;
    }
    public String getAccessToken(){
        return token;
    }
    public void setAccessToken(String accessToken){
        this.token=accessToken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

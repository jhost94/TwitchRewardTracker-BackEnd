package com.jhost.TwitchRewardTrackerBE.model;

public class User {

    private String id;

    private String userToken;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}

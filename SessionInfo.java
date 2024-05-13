package org.example.proj.utils;

public class SessionInfo {
    private static SessionInfo instance;
    private String username;

    private SessionInfo() { }

    public static SessionInfo getInstance() {
        if (instance == null) {
            instance = new SessionInfo();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

package com.example.connectfirebasedemo;

public class Member {
    private String EMail;
    private String Username;
    private int Hits;
    private int Games;

    public Member(String EMail) {
        this.EMail = EMail;
        this.Hits = 0;
        this.Games = 0;
    }

    public Member() {
        this.EMail = null;
        this.Username = null;
        this.Hits = 0;
        this.Games = 0;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getHits() {
        return Hits;
    }

    public void setHits(int hits) {
        Hits = hits;
    }

    public int getGames() {
        return Games;
    }

    public void setGames(int games) {
        Games = games;
    }
}

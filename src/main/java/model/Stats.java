package model;

import javax.persistence.*;

@Entity
@Table(name = "stats")
public class Stats {

    public Stats(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "wins")
    private int wins;
    @Column(name = "count")
    private int count;
    @Column(name = "avgTime")
    private int avgTime;
    @Column(name = "avgStepTime")
    private int avgStepTime;
    @Column(name = "username")
    private String username;

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(int avgTime) {
        this.avgTime = avgTime;
    }

    public int getAvgStepTime() {
        return avgStepTime;
    }

    public void setAvgStepTime(int avgStepTime) {
        this.avgStepTime = avgStepTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

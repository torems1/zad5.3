package com.company;

public class Player implements Comparable,victory {
    private int points;
    private int id;
    Player(){
        points=0;
        id=0;
    }
    public void setID(int ID){
        id=ID;
    }
    public int showID(){
        return id;
    }
    public void addPoint(int value){
        points+=value;
    }
    public int showPoints(){
        return points;
    }
    public void resetPoints(){
        points=0;
    }
    public int compareTo(Object obj){
        Player tmp=(Player) obj;
        if(this.points<tmp.points){
            return -1;
        }
        else if(this.points>tmp.points){
            return 1;
        }
        return 0;
    }
    public void celebrateVictory(){
        System.out.println("Epp victory!!");
    }
}

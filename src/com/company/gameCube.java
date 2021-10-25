package com.company;

public class gameCube {
    private int min=1;
    private int max=6;
    public int throwCube(){
        return (int)(min+Math.random()*max);
    }
}

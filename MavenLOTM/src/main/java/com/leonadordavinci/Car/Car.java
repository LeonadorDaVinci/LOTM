package com.leonadordavinci.Car;

public class Car {
    private String name = null;
    private boolean official = false;

    private int level = 4;

    private String no = null;

    private String introduction = null;

    public String getName() { return this.name; }
    public void   setName(String name){ this.name = name;}

    public boolean getOfficial() { return this.official; }
    public void setDoors (boolean official) { this.official = official; }

    public int getLevel(){return this.level;}
    public void setLevel(int level){this.level = level;}

    public String getNo(){return this.no;}
    public void setNo(){this.no = no;}

    public String getIntroduction(){return this.introduction;}
    public void setIntroduction(){this.introduction = introduction;}

}

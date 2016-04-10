package com.example.povio.istra;

public class Data {
    int background;
    String price;
    String name;
    String description;
    String rooms;
    String beds;

    Data(int background, String price, String name, String description, String rooms, String beds){
        this.background = background;
        this.price = price;
        this.name = name;
        this.description = description;
        this.rooms = rooms;
        this.beds = beds;
    }

    public int getBackground(){
        return this.background;
    }

    public void setBackground(int background){
        this.background = background;
    }

    public String getPrice(){
        return this.price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getRooms(){
        return this.rooms;
    }

    public void setRooms(String rooms){
        this.rooms = rooms;
    }

    public String getBeds(){
        return this.beds;
    }

    public void setBeds(String beds){
        this.beds = beds;
    }
}

package com.app.model;

public class Ring {
    long id;
    String type;
    String designedFor;
    String brand;
    String collection;
    int size;
    String material;
    int finenessOfMetal;
    String colorOfMetal;
    double metalWeight;
    boolean gem;
    double gemWeight;
    String colorOfGem;
    float price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignedFor() {
        return designedFor;
    }

    public void setDesignedFor(String designedFor) {
        this.designedFor = designedFor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getFinenessOfMetal() {
        return finenessOfMetal;
    }

    public void setFinenessOfMetal(int finenessOfMetal) {
        this.finenessOfMetal = finenessOfMetal;
    }

    public String getColorOfMetal() {
        return colorOfMetal;
    }

    public void setColorOfMetal(String colorOfMetal) {
        this.colorOfMetal = colorOfMetal;
    }

    public double getMetalWeight() {
        return metalWeight;
    }

    public void setMetalWeight(double metalWeight) {
        this.metalWeight = metalWeight;
    }

    public boolean isGem() {
        return gem;
    }

    public void setGem(boolean gem) {
        this.gem = gem;
    }

    public double getGemWeight() {
        return gemWeight;
    }

    public void setGemWeight(double gemWeight) {
        this.gemWeight = gemWeight;
    }

    public String getColorOfGem() {
        return colorOfGem;
    }

    public void setColorOfGem(String colorOfGem) {
        this.colorOfGem = colorOfGem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

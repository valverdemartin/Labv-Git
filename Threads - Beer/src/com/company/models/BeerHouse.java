package com.company.models;

public class BeerHouse{

    private int beerCounter;
    private int capacity;
    private boolean flag;

    public BeerHouse() {
        this.setBeerCounter(5); //initial beer setting.
        this.setCapacity(100); //Capacity setting.
        this.setFlag(true); //The Beer Hous is Open.
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getBeerCounter() {
        return beerCounter;
    }

    public void setBeerCounter(int beerCounter) {
        this.beerCounter = beerCounter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //This method allow us to add beer to the Beer House
    public synchronized void putBeer(int value){
        while(this.getBeerCounter() >= this.getCapacity()){ //As long as we have no stock space..
            try {
                wait(); //Sleep the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBeerCounter(this.getBeerCounter() + value); //Update beer counter
        System.out.println("Pongo --> " + value + "\nHay --> " + this.getBeerCounter() + "\n");
        notifyAll(); //Get up the threads
    }

    //This method allow us to get beer from the Beer House
    public synchronized void getBeer(int value, String name){
        if(this.getBeerCounter() <= 0){ //If we don't have beer..
            try {
                this.setFlag(false);    //Close the Beer House
                System.out.println("Sin Stock!");
                System.exit(0); //Se puede evitar, pero se ejecuta una vez más el productor.
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        else{
            this.setBeerCounter(this.getBeerCounter() - value); //Uppdate beer counter
            System.out.println(name + "\nTomó --> " + value + "\nHay --> " + this.getBeerCounter() + "\n");

            notifyAll(); //Get up the threads
        }

    }
}

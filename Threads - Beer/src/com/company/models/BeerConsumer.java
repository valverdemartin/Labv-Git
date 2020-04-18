package com.company.models;

public class BeerConsumer extends Thread{

    private BeerHouse beerHouse;


    public BeerConsumer(BeerHouse beerHouse) {
        super();
        setBeerHouse(beerHouse);
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }




    @Override
    public void run() { //Run the thread
        while(this.beerHouse.isFlag()){//As long as the Beer House is open
            //Calculate the max available and generate the random int
            int random = (int) (Math.random() * (this.beerHouse.getBeerCounter() - 1)) + 1;
            this.beerHouse.getBeer(random, this.getName()); //Get the beer
        }
    }
}

package com.company.models;

public class BeerProducer extends Thread{

    public int producedBeer;
    public BeerHouse beerHouse;


    public BeerProducer(BeerHouse beerHouse) {
        this.setBeerHouse(beerHouse);
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    public int getProducedBeer() {
        return producedBeer;
    }

    public void setProducedBeer(int producedBeer) {
        this.producedBeer = producedBeer;
    }

    @Override
    public void run() { //Run the thread
        while(this.beerHouse.isFlag()){ //As long as the Beer House is open
            int max = (this.beerHouse.getCapacity() - this.beerHouse.getBeerCounter()); //Calculate the max available
            int random = (int) ((Math.random() * (max - 1)) + 1); //Generate the random int
            this.beerHouse.putBeer(random); //Produce the beer

        }
    }

}


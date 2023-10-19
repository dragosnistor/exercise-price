package com.swissquote.exercise.price;


public class Solution {

    //You are allowed to change the following values
    static final int MAX_EXERCISE_TIME = 20;
    static final int PRICE_AGGREGATION_PRINT_PERIOD = 4;
    static final int PRICE_AGGREGATION_INITIAL_DELAY = 5;


    public static void main(String[] args) {
        PriceAggregator aggregator = new PriceAggregator();

        //Step 1 - Simulate 3 providers. KRAKEN, BINANCE, COINBASE, which will generate Quotes.

        //Step 2 - Think and choose a mechanism to send Quotes from Providers to Price Aggregator

        //Step 3 - Print the reception of a Quote in Price Aggregator with the following message :
        //Received new quote [Provider : BINANCE , price: 6.85616142866105937, Time: 2022-07-27T14:43:26.228920Z]

        //Step 4 - Start the generation of Quotes you designed with a delay of 1 seconds per Quote.


        //Please don't touch the following code, except the part of Step 5
        PricePrinter.printBestPriceBy(aggregator, PRICE_AGGREGATION_PRINT_PERIOD, MAX_EXERCISE_TIME);
    }

    static void stopProviders() {
        //Step 5 - stop all the providers you created here
    }
}

class PriceAggregator {
    //Step 6 - Chose a data structure to store the prices received from the different providers.
    public void printBestQuote() {
        //Step 7 - print best price in the format:
        // The best quote is [Provider : BINANCE , price: 6.85616142866105937, Time: 2022-07-27T14:43:26.228920Z]
        System.out.println("Best Quote NOT IMPLEMENTED");
    }
}




package com.swissquote.exercise.price;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// ***********************************************
// Not change this implementation
// ***********************************************
public class PricePrinter {
    static void printBestPriceBy(PriceAggregator aggregator, int printperiodTime, int maxExerciseTime) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        //Schedule print best quote every printperiodTime
        ScheduledFuture<?> futureTask = executor.scheduleAtFixedRate(aggregator::printBestQuote,
                Solution.PRICE_AGGREGATION_INITIAL_DELAY,
                printperiodTime,
                TimeUnit.SECONDS);

        //Schedule end of task using maxExercise Time
        executor.schedule(() -> {
            Solution.stopProviders();
            futureTask.cancel(true);
            executor.shutdown();
        }, maxExerciseTime, TimeUnit.SECONDS);
    }
}

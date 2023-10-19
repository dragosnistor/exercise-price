package com.swissquote.exercise.price;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

// ***********************************************
// Not change this implementation
// ***********************************************
public class PriceUtil {
    public static BigDecimal newRandomDelta() {
        BigDecimal max = new BigDecimal("1.0");
        BigDecimal randFromDouble = BigDecimal.valueOf(Math.random());
        return randFromDouble.divide(max, RoundingMode.HALF_DOWN).multiply(BigDecimal.valueOf(new Random().nextBoolean() ? -1 : 1));
    }
}

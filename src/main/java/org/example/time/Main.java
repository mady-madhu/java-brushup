package org.example.time;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime);

        //System.out.println("$"+ (10+20)/3);

        BigDecimal b1 = new BigDecimal("10.67");
        BigDecimal b2 = new BigDecimal("12.67");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.divide(b2));

    }
}

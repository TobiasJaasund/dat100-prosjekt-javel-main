package no.hvl.dat100.javel.oppgave2;

import jdk.jfr.Threshold;
import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {

            double[] day_usage = usage[i];

            System.out.print("Day " + (i + 1) + ": ");
            DailyPower.printPowerUsage(day_usage);
            System.out.println();
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++) {

            double[] day_price = prices[i];

            System.out.print("Day " + (i + 1) + ": ");
            DailyPower.printPowerPrices(day_price);
            System.out.println();

        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;

        for (double[] dag : usage) {
            for (double forbruk : dag) {
                sum = sum + forbruk;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        if (usage > threshold) {
            exceeded = true;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {

                double priceDag = usage[i][j] * prices[i][j];

                price = priceDag + price;
            }
        }
        System.out.println(price + " Kr");
        return price;
    }

        // f) power support for the month
        public static double computePowerSupport ( double[][] usage, double[][] prices) {
        double support = 0;

        for(int i = 0; i < usage.length; i++){
            support = support + DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        System.out.print(support + " kr");
        return support;
        }

        // g) Norgesprice for the month
        public static double computeNorgesPrice ( double[][] usage){

            double price = 0;
            for(int i = 0; i < usage.length; i++){
                price = price + DailyPower.computeNorgesPrice(usage[i]);
            }
            return price;
        }
    }


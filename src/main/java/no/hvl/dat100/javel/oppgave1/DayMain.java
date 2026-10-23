package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        System.out.println("a)\n");

        DailyPower.printPowerPrices(DayPowerData.powerprices_day);

        System.out.println("\n\nb)\n");

        DailyPower.printPowerUsage(DayPowerData.powerusage_day);

        System.out.println("\n\nc)\n");

        System.out.println(DailyPower.computePowerUsage(DayPowerData.powerusage_day));

        System.out.println("\nd)\n");

        System.out.println(DailyPower.computeSpotPrice(DayPowerData.powerusage_day, DayPowerData.powerprices_day));

        //På oppgave e) er metoden private og kan derfor bare brukes i egen klasse

        System.out.println("\nf)\n");

        System.out.printf("Total strømstøtte: %.2f", DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day));

        System.out.println("\n\ng)\n");

        System.out.println(DailyPower.computeNorgesPrice(DayPowerData.powerusage_day));

        System.out.println("\nh)\n");

        System.out.println(DailyPower.findPeakUsage(DayPowerData.powerusage_day));

        System.out.println("\ni)\n");

        System.out.println(DailyPower.findAvgPower(DayPowerData.powerusage_day));

    }
}

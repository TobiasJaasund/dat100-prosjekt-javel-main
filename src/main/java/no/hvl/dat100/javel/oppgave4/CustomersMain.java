package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        // Oppretter ny tabell med 5 plasser
        Customers customers = new Customers(5);

        // Oppretter tre Customer-objekter
        Customer k1 = new Customer("Didrik", "did@hvl.no",
                1001, PowerAgreementType.SPOTPRICE);

        Customer k2 = new Customer("Thomas", "thomas@hvl.no",
                1002, PowerAgreementType.NORGESPRICE);

        Customer k3 = new Customer("Tobias", "tobias@hvl.no",
                1003, PowerAgreementType.POWERSUPPORT);


        // b) Tell antall kunder før innsetting
        customers.countNonNull();


        // d) Legger kundene til i tabellen
        customers.addCustomer(k1);
        customers.addCustomer(k2);
        customers.addCustomer(k3);

        // Teller antall kunder etter innsetting
        customers.countNonNull();


        // Søk etter kunde i tabell med customer_id
        System.out.println(customers.getCustomer(1001));


        // Slette en kunde fra tabellen
        customers.removeCustomer(1002);


        // f) Hente ny tabell med gjenværende kunder
        Customer[] alleKunder = customers.getCustomers();

        System.out.println("Kunder i ny tabell:");

        for (int i = 0; i < alleKunder.length; i++) {
            System.out.println(alleKunder[i]);
        }

        System.out.println("Lengde på ny tabell: " + alleKunder.length);

    }
}

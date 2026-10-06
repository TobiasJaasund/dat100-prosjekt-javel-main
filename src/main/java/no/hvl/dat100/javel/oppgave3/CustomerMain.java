package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */

        Customer k1 = new Customer("Tobias", "tobias@gmail.com", 1,PowerAgreementType.NORGESPRICE);
        
        System.out.println(k1.getName());
    }
}

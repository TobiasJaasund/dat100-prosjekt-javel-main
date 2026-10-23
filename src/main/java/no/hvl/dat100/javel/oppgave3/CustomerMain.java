package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer = new Customer("Didrik", "did@hvl.no", 1001, PowerAgreementType.SPOTPRICE);

        System.out.println(customer.toString());

        System.out.println(customer.getName());

        System.out.println(customer.getEmail());

        System.out.println(customer.getCustomer_id());

        System.out.println(customer.getAgreement());

        System.out.println();

        customer.setName("Thomas");
        customer.setEmail("Thomas@hvl.no");
        customer.setCustomer_id(1002);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(customer.toString());
    }
}

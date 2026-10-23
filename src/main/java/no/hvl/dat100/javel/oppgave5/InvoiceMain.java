package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer kunde1 = new Customer("Charlie Rose", "Charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

        Customer kunde2 = new Customer("Diana Prince", "Diana@example.com", 1004, PowerAgreementType.NORGESPRICE);

        Customer kunde3 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);

        Invoice faktura1 = new Invoice(kunde1, "January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);

        Invoice faktura2 = new Invoice(kunde2, "January", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);

        Invoice faktura3 = new Invoice(kunde3, "January", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] fakturaer = {faktura1, faktura2, faktura3};

        Invoices.processInvoices(fakturaer);

    }
}

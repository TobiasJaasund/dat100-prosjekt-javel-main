package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;

    }

    public String getName () {

        return this.name;
    }
    public int getCustomer_id () {

        return this.customer_id;
    }
    public String getemail () {

        return this.email;
    }
    public PowerAgreementType getagreement () {

        return this.agreement;
    }

    public void setName(String name){


    }
    // TODO - toString method

}

package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long custcode;

    private String custname;

    private String custcity;

    private String workingarea;

    private String custcountry;

    private String grade;

    private double openingamt;

    private double receiveamt;

    private double paymentamt;

    private double outstandingamt;

    private String phone;


    @JoinTable(name = "agents")
    @JoinColumn(name = "agentcode")
    
    private long agentcode;

}

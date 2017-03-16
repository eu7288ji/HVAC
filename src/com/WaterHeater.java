package com;

import com.company.ServiceCall;

import java.util.Date;

public class WaterHeater extends ServiceCall{ //waterheater code

    private int age;
    static final double cityFee = 20.00;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    @Override
    public String toString() {

        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + cityFee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Mandatory Fee = " + cityFee + "\n" +
                "Fee = " + feeString;
    }
}

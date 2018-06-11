package com.mada.kotlin.kotlincourse.interop;

import com.mada.kotlin.kotlincourse.classes.Customer;
import com.mada.kotlin.kotlincourse.classes.CustomerKotlin;
import com.mada.kotlin.kotlincourse.classes.Status;

import java.io.IOError;
import java.io.IOException;

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Mada", "mada@loghin.com");

        customerKotlin.getEmail();

//        customerKotlin.getSomeProperty();
        String value = customerKotlin.someProperty;

        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();

        customerKotlin.preferential();


        UtilityClass.prefix("some", "value");
        int copyrightYear = UtilityClass.copyrightYear;

    }
}

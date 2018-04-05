package com.mada.kotlin.kotlincourse.interop;

import com.mada.kotlin.kotlincourse.classes.Customer;
import com.mada.kotlin.kotlincourse.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {

    CustomerJava getById(int id);

    List<CustomerJava> getAll();

}

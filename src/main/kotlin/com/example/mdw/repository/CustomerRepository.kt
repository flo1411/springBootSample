package com.example.mdw.repository

import com.example.mdw.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Int> {
    fun findCustomerById(customerId: Long): Customer?
}
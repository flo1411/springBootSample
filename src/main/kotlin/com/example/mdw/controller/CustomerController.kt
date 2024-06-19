package com.example.mdw.controller

import com.example.mdw.model.Customer
import com.example.mdw.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class CustomerController {
    @Autowired
    lateinit var customerRepository: CustomerRepository

    @PostMapping("/add")
    fun addCustomer(@RequestParam("firstName") firstName: String, @RequestParam("lastName") lastName: String): String {
        val customer = Customer(firstName, lastName)
        customerRepository.save(customer)
        return "Customer saved"
    }

    @GetMapping("/list")
    fun getCustomers(): Iterable<Customer> {
        return customerRepository.findAll()
    }

    @GetMapping("/find/{id}")
    fun findCustomerById(@PathVariable id: Int): Customer? {
        return customerRepository.findCustomerById(id.toLong())
    }
}
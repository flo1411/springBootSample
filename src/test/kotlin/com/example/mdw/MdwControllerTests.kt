package com.example.mdw

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.ResponseEntity



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MdwControllerTests {
    @Autowired
    private lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun getHello() {
        val response: ResponseEntity<String> = testRestTemplate.getForEntity("/", String::class.java)
        assertThat(response.body).isEqualTo("Hello World!")
    }
}
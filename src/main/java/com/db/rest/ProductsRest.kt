package com.db.rest

import com.db.data.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductsRest {
    @GetMapping("")
    fun getAllProducts(): List<Product> {
        return listOf(
                Product(
                        id = "1",
                        name = "Бананы",
                        description = "Бананы",
                        priceInCents = 199
                ),

                Product(
                        id = "2",
                        name = "Помидоры",
                        description = "Помидоры",
                        priceInCents = 99
                ),

                Product(
                        id = "3",
                        name = "Кукуруза",
                        description = "Кукуруза",
                        priceInCents = 259
                )
        )
    }
}

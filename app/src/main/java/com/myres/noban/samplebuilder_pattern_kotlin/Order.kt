package com.myres.noban.samplebuilder_pattern_kotlin

class Order(
    val name: String?,
    val quantity: String?,
    val price: String?,
    val total_price: String?) {

    data class Builder(
        var name: String? = null,
        var quantity: String? = null,
        var price: String? = null,
        var total_price: String? = null
    ) {

        fun name(name: String) = apply { this.name = name }
        fun quantity(quantity: String) = apply { this.quantity = quantity }
        fun price(price: String) = apply { this.price = price }
        fun total_price(total_price: String) = apply { this.total_price = total_price }
        fun build() = Order(name, quantity, price, total_price)
    }
}
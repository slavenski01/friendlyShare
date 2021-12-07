package com.example.sharemodule.entity

data class PartyMember(
    val id: Int,
    val name: String,
    var products: List<Product>
)
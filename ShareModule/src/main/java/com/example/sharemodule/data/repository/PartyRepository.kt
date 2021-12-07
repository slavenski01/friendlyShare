package com.example.sharemodule.data.repository

/**
 * Репозиторий, который возвращает список товаров, которые были на вечеринке
 **/
interface PartyRepository {

    /** Получить все продукты, которые были на вечеринке */
    suspend fun getProducts()

    /** Получить всех пользователей, которые были на вечеринке */
    suspend fun getPartyMembers()
}
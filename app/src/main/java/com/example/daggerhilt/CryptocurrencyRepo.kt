package com.example.daggerhilt

interface CryptocurrencyRepo {
    fun getCryptopcurrency(): List<Cryptocurrency>
}
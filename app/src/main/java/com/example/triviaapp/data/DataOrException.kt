package com.example.triviaapp.data

data class DataOrException<T, Boolean, E:Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var exception: E? = null
)

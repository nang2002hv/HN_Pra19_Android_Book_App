package com.example.book.data.repository

import java.lang.Exception

interface OnResultListener<T> {
    fun onSuccess(data: T)

    fun onError(exception: Exception)
}

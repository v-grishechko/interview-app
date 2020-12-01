package com.example.fake.api

import kotlinx.coroutines.delay
import java.lang.Thread.sleep

class FakeApi {
    suspend fun fakeRequestCoroutine(): String {
        delay(2000)
        return "Result!"
    }

    fun fakeRequest(): String {
        sleep(2000)
        return "Result!"
    }
}
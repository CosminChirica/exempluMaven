package com.sd.laborator.services
import org.springframework.stereotype.Service
import kotlin.text.SimpleDateFormat
import kotlin.util.*
@Service
class TimeService {
    fun getCurrentTime():String {
        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        return formatter.format(Date())
    }
}
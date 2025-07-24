package org.example
import org.example.driver.Driver

fun main() {
    var driver1: Driver = Driver("Oscar")
    driver1.number = 10
    println(driver1.number)
    driver1.number = 20
    println(driver1.number)
    }
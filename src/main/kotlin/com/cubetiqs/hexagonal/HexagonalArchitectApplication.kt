package com.cubetiqs.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexagonalArchitectApplication

fun main(args: Array<String>) {
	runApplication<HexagonalArchitectApplication>(*args)
}

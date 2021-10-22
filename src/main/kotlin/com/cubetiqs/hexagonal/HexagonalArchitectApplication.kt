package com.cubetiqs.hexagonal

import com.cubetiqs.hexagonal.infrastructure.adapter.cli.ArticleCli
import com.cubetiqs.hexagonal.infrastructure.adapter.persistence.ArticleImMemoryDataAdapter
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexagonalArchitectApplication : CommandLineRunner {
	private val logger = LoggerFactory.getLogger(HexagonalArchitectApplication::class.java)

	override fun run(vararg args: String?) {
		// create cli instance
		val cli = ArticleCli(ArticleImMemoryDataAdapter())

		// create new article object via cli
		val article = cli.create(1L, "Article 1", "Description 1")
		logger.info("Article created: {}", article)

		// retrieve article via cli
		val articleRetrieve = cli.retrieve(1L)
		logger.info("Article retrieved: {}", articleRetrieve)

		// query articles via cli
		val articleQuery = cli.query(1L)
		logger.info("Query found articles: {}", articleQuery)
	}
}

fun main(args: Array<String>) {
	runApplication<HexagonalArchitectApplication>(*args)
}

package com.cubetiqs.hexagonal

import com.cubetiqs.hexagonal.infrastructure.adapter.account.cli.AccountCli
import com.cubetiqs.hexagonal.infrastructure.adapter.account.persistence.AccountInMemoryDataAdapter
import com.cubetiqs.hexagonal.infrastructure.adapter.article.cli.ArticleCli
import com.cubetiqs.hexagonal.infrastructure.adapter.article.persistence.ArticleIMemoryDataAdapter
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexagonalArchitectApplication : CommandLineRunner {
	private val logger = LoggerFactory.getLogger(HexagonalArchitectApplication::class.java)

	override fun run(vararg args: String?) {
		// create account cli instance
		val accountCli = AccountCli(AccountInMemoryDataAdapter())

		// create new account object via cli
		val account = accountCli.create("Sambo Chea", "sombochea@cubetiqs.com", "123456")
		logger.info("Account created: {}", account)

		// get created account id
		val accountId = account.id!!

		// retrieve account via cli
		val accountRetrieved = accountCli.retrieve(accountId)
		logger.info("Account retrieved: {}", accountRetrieved)

		// query account via cli
		val accountQuery = accountCli.query("sambo")
		logger.info("Account query found: {}", accountQuery)

		// create article cli instance
		val articleCli = ArticleCli(ArticleIMemoryDataAdapter())

		// create new article object via cli
		val article = articleCli.create(accountId, "Article 1", "Description 1")
		logger.info("Article created: {}", article)

		// retrieve article via cli
		val articleRetrieve = articleCli.retrieve(accountId)
		logger.info("Article retrieved: {}", articleRetrieve)

		// query articles via cli
		val articleQuery = articleCli.query(accountId)
		logger.info("Query found articles: {}", articleQuery)
	}
}

fun main(args: Array<String>) {
	runApplication<HexagonalArchitectApplication>(*args)
}

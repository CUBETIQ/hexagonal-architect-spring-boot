package com.cubetiqs.hexagonal.infrastructure.adapter.article.cli

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleCreate
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleQuery

class ArticleCli constructor(
    private val articlePort: ArticlePort,
) {
    fun create(accountId: Long, title: String, body: String): Article {
        val article = ArticleCreate(accountId, title, body)
        return articlePort.create(article)
    }

    fun retrieve(id: Long): Article {
        return articlePort.retrieve(id)
    }

    fun query(accountId: Long): Collection<Article> {
        return articlePort.query(ArticleQuery.from(accountId))
    }
}
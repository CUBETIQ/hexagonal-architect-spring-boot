package com.cubetiqs.hexagonal.domain.article

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleQuery

class ArticleQueryUseCase constructor(
    private val articlePort: ArticlePort,
) {
    fun query(useCase: ArticleQuery): Collection<Article> {
        return articlePort.query(useCase)
    }
}
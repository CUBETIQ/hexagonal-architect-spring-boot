package com.cubetiqs.hexagonal.domain.article

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleCreate

class ArticleCreateUseCase constructor(
    private val articlePort: ArticlePort,
) {
    fun create(useCase: ArticleCreate): Article {
        return articlePort.create(useCase)
    }
}
package com.cubetiqs.hexagonal.domain.article

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleRetrieve

class ArticleRetrieveUseCase constructor(
    private val articlePort: ArticlePort,
) {
    fun retrieve(useCase: ArticleRetrieve): Article {
        return articlePort.retrieve(useCase.id)
    }
}
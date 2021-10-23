package com.cubetiqs.hexagonal.infrastructure.adapter.article.persistence

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleCreate
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleQuery

class ArticleJpaDataAdapter : ArticlePort {
    override fun create(article: ArticleCreate): Article {
        TODO("Not yet implemented")
    }

    override fun retrieve(id: Long): Article {
        TODO("Not yet implemented")
    }

    override fun query(query: ArticleQuery): Collection<Article> {
        return emptyList()
    }
}
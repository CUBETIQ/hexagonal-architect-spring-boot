package com.cubetiqs.hexagonal.domain.article.port

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleCreate
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleQuery

interface ArticlePort {
    fun create(article: ArticleCreate): Article
    fun retrieve(id: Long): Article
    fun query(query: ArticleQuery): Collection<Article>
}
package com.cubetiqs.hexagonal.infrastructure.adapter.article.persistence

import com.cubetiqs.hexagonal.domain.article.model.Article
import com.cubetiqs.hexagonal.domain.article.port.ArticlePort
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleCreate
import com.cubetiqs.hexagonal.domain.article.usecase.ArticleQuery
import java.util.concurrent.ConcurrentHashMap

class ArticleIMemoryDataAdapter : ArticlePort {
    companion object {
        private val articles = ConcurrentHashMap<Long, Article>()
    }

    override fun create(article: ArticleCreate): Article {
        val id = (articles.size + 1).toLong()
        val entity = Article(id, article.accountId, article.title, article.body)
        articles[id] = entity
        return entity
    }

    override fun retrieve(id: Long): Article {
        return articles[id] ?: throw IllegalArgumentException("Article not found")
    }

    override fun query(query: ArticleQuery): Collection<Article> {
        return articles.values.filter {
            it.accountId == query.accountId
        }
    }
}
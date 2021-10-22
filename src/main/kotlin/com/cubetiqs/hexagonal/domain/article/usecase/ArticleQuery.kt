package com.cubetiqs.hexagonal.domain.article.usecase

open class ArticleQuery(
    var accountId: Long,
) {
    companion object {
        fun from(accountId: Long): ArticleQuery {
            return ArticleQuery(accountId)
        }
    }

    override fun toString(): String {
        return "ArticleQuery(accountId=$accountId)"
    }
}
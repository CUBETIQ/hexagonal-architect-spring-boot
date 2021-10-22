package com.cubetiqs.hexagonal.domain.article.usecase

open class ArticleCreate(
    var accountId: Long? = null,
    var title: String? = null,
    var body: String? = null,
) {
    override fun toString(): String {
        return "ArticleCreate(accountId=$accountId, title=$title, body=$body)"
    }
}
package com.cubetiqs.hexagonal.domain.article.model

open class Article (
    var id: Long? = null,
    var accountId: Long? = null,
    var title: String? = null,
    var body: String? = null,
) {
    override fun toString(): String {
        return "Article(id=$id, accountId=$accountId, title=$title, body=$body)"
    }
}
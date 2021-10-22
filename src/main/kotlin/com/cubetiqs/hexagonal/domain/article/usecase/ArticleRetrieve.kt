package com.cubetiqs.hexagonal.domain.article.usecase

open class ArticleRetrieve(
    var id: Long,
) {
    companion object {
        fun from(id: Long): ArticleRetrieve {
            return ArticleRetrieve(id)
        }
    }

    override fun toString(): String {
        return "ArticleRetrieve(id=$id)"
    }
}
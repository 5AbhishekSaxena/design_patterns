package tech.developingdeveloper.l_bridge_pattern.resource

import tech.developingdeveloper.l_bridge_pattern.domain.Book

data class BookResource(
    override val id: Int,
    override val title: String,
    override val description: String,
    override val imageUrl: String,
    override val redirectLink: String,
) : Resource {

    constructor(book: Book) : this(
        id = book.id,
        title = book.title,
        description = book.shortDescription,
        imageUrl = book.coverImageUrl,
        redirectLink = book.bookshopUrl,
    )
}

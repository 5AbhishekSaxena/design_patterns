package tech.developingdeveloper.l_bridge_pattern

import tech.developingdeveloper.l_bridge_pattern.domain.Artist
import tech.developingdeveloper.l_bridge_pattern.domain.Book
import tech.developingdeveloper.l_bridge_pattern.resource.ArtistResource
import tech.developingdeveloper.l_bridge_pattern.resource.BookResource
import tech.developingdeveloper.l_bridge_pattern.view.LongFormView
import tech.developingdeveloper.l_bridge_pattern.view.ShortFormView

// |===============|             |===============|
// |               |    has      |               |
// |     View      | ----------> |   Resource    |
// |               |             |               |
// |===============|             |===============|
//        ^                             ^
//        |                             |
//        | is-a                        | is-a
//        |                             |
// |===============|             |===============|
// |               |             |               |
// |   ViewImpl    |             |  ResourceImpl |
// |               |             |               |
// |===============|             |===============|

fun main() {
    val book = Book(
        id = 1,
        title = "Design Patterns",
        bookshopUrl = "http://designpatterns.com",
        coverImageUrl = "http://designpatterns.com/cover.jpg",
        shortDescription = "Design patterns as code",
    )
    val bookResource = BookResource(book)

    val artist = Artist(
        id = 1,
        firstName = "John",
        lastName = "Doe",
        portfolioUrl = "http://johndoe.com",
        profileImageUrl = "http://johndoe.com/profile.jpg",
        about = "John Doe is a developer",
    )
    val artistResource = ArtistResource(artist)

    ShortFormView(bookResource).show()
    shortDivider()
    LongFormView(bookResource).show()

    longDivider()

    ShortFormView(artistResource).show()
    shortDivider()
    LongFormView(artistResource).show()
}

private fun shortDivider() {
    println("*".repeat(15))
}

private fun longDivider() {
    println("=".repeat(20))
}

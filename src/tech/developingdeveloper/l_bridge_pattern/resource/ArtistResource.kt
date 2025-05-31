package tech.developingdeveloper.l_bridge_pattern.resource

import tech.developingdeveloper.l_bridge_pattern.domain.Artist

data class ArtistResource(
    override val id: Int,
    override val title: String,
    override val description: String,
    override val imageUrl: String,
    override val redirectLink: String,
) : Resource {

    constructor(artist: Artist) : this(
        id = artist.id,
        title = "${artist.firstName} ${artist.lastName}",
        description = artist.about,
        imageUrl = artist.profileImageUrl,
        redirectLink = artist.portfolioUrl,
    )
}

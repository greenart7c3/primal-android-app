package net.primal.android.nostr.primal.model.request

import kotlinx.serialization.Serializable

@Serializable
data class SearchContentRequest(
    val query: String,
    val limit: Int = 1000,
)

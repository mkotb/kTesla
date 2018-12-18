package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Toggles media from playing and paused
 */
class TogglePlaybackRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_toggle_playback"
    override val method = HttpMethod.Post
}

/**
 * Goes to next track in playlist
 */
class NextTrackRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_next_track"
    override val method = HttpMethod.Post
}

/**
 * Goes to previous track if applicable
 */
class PreviousTrackRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_prev_track"
    override val method = HttpMethod.Post
}

/**
 * Goes to next favourite track
 */
class NextFavouriteTrackRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_next_fav"
    override val method = HttpMethod.Post
}

/**
 * Goes to previous favourite track if applicable
 */
class PreviousFavouriteTrackRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_prev_fav"
    override val method = HttpMethod.Post
}

/**
 * Increases volume of media
 */
class IncreaseVolumeRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/media_volume_up"
    override val method = HttpMethod.Post
}

/**
 * Decreases volume of media
 */
class DecreaseVolumeRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/medai_volume_down"
    override val method = HttpMethod.Post
}
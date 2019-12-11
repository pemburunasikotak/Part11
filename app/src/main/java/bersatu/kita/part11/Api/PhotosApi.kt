package bersatu.kita.part11.Api

import bersatu.kita.part11.Model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}
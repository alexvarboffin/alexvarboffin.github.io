
package com.walhalla.bongacams.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileImages {

    @SerializedName("profile_image")
    @Expose
    public String profileImage;
    @SerializedName("thumbnail_image_small")
    @Expose
    public String thumbnailImageSmall;
    @SerializedName("thumbnail_image_medium")
    @Expose
    public String thumbnailImageMedium;
    @SerializedName("thumbnail_image_big")
    @Expose
    public String thumbnailImageBig;
    @SerializedName("thumbnail_image_small_live")
    @Expose
    public String thumbnailImageSmallLive;
    @SerializedName("thumbnail_image_medium_live")
    @Expose
    public String thumbnailImageMediumLive;
    @SerializedName("thumbnail_image_big_live")
    @Expose
    public String thumbnailImageBigLive;

}

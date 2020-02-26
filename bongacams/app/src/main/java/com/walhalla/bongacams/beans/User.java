
package com.walhalla.bongacams.beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//21
public class User {

    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("profile_page_url")
    @Expose
    public String profilePageUrl;
    @SerializedName("display_name")
    @Expose
    public String displayName;
    @SerializedName("display_age")
    @Expose
    public String displayAge;
    @SerializedName("profile_images")
    @Expose
    public ProfileImages profileImages;
    @SerializedName("chat_url")
    @Expose
    public String chatUrl;
    @SerializedName("random_chat_url")
    @Expose
    public String randomChatUrl;
    @SerializedName("popular_chat_url")
    @Expose
    public String popularChatUrl;
    @SerializedName("chat_url_on_home_page")
    @Expose
    public String chatUrlOnHomePage;
    @SerializedName("direct_chat_url")
    @Expose
    public String directChatUrl;
    @SerializedName("online_time")
    @Expose
    public Integer onlineTime;
    @SerializedName("vs_url_root")
    @Expose
    public String vsUrlRoot;
    @SerializedName("chat_status")
    @Expose
    public String chatStatus;
    @SerializedName("marker")
    @Expose
    public String marker;
    @SerializedName("status")
    @Expose
    public Boolean status;
    @SerializedName("hometown")
    @Expose
    public String hometown;
    @SerializedName("turns_on")
    @Expose
    public String turnsOn;
    @SerializedName("turns_off")
    @Expose
    public String turnsOff;
    @SerializedName("signup_date")
    @Expose
    public String signupDate;
    @SerializedName("last_update_date")
    @Expose
    public String lastUpdateDate;
    @SerializedName("members_count")
    @Expose
    public Integer membersCount;
    @SerializedName("vibratoy")
    @Expose
    public Boolean vibratoy;
    @SerializedName("hd_cam")
    @Expose
    public Boolean hdCam;
    @SerializedName("primary_language_key")
    @Expose
    public String primaryLanguageKey;
    @SerializedName("secondary_language_key")
    @Expose
    public String secondaryLanguageKey;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("height")
    @Expose
    public String height;
    @SerializedName("weight")
    @Expose
    public String weight;
    @SerializedName("ethnicity")
    @Expose
    public String ethnicity;
    @SerializedName("hair_color")
    @Expose
    public String hairColor;
    @SerializedName("eye_color")
    @Expose
    public String eyeColor;
    @SerializedName("bust_penis_size")
    @Expose
    public String bustPenisSize;
    @SerializedName("pubic_hair")
    @Expose
    public String pubicHair;
    @SerializedName("primary_language")
    @Expose
    public String primaryLanguage;
    @SerializedName("secondary_language")
    @Expose
    public String secondaryLanguage;
    @SerializedName("tags")
    @Expose
    public List<String> tags = null;
    @SerializedName("embed_chat_url")
    @Expose
    public String embedChatUrl;
    @SerializedName("is_geo")
    @Expose
    public Boolean isGeo;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", profilePageUrl='" + profilePageUrl + '\'' +
                ", displayName='" + displayName + '\'' +
                ", displayAge='" + displayAge + '\'' +
                ", profileImages=" + profileImages +
                ", chatUrl='" + chatUrl + '\'' +
                ", randomChatUrl='" + randomChatUrl + '\'' +
                ", popularChatUrl='" + popularChatUrl + '\'' +
                ", chatUrlOnHomePage='" + chatUrlOnHomePage + '\'' +
                ", directChatUrl='" + directChatUrl + '\'' +
                ", onlineTime=" + onlineTime +
                ", vsUrlRoot='" + vsUrlRoot + '\'' +
                ", chatStatus='" + chatStatus + '\'' +
                ", marker='" + marker + '\'' +
                ", status=" + status +
                ", hometown='" + hometown + '\'' +
                ", turnsOn='" + turnsOn + '\'' +
                ", turnsOff='" + turnsOff + '\'' +
                ", signupDate='" + signupDate + '\'' +
                ", lastUpdateDate='" + lastUpdateDate + '\'' +
                ", membersCount=" + membersCount +
                ", vibratoy=" + vibratoy +
                ", hdCam=" + hdCam +
                ", primaryLanguageKey='" + primaryLanguageKey + '\'' +
                ", secondaryLanguageKey='" + secondaryLanguageKey + '\'' +
                ", gender='" + gender + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", bustPenisSize='" + bustPenisSize + '\'' +
                ", pubicHair='" + pubicHair + '\'' +
                ", primaryLanguage='" + primaryLanguage + '\'' +
                ", secondaryLanguage='" + secondaryLanguage + '\'' +
                ", tags=" + tags +
                ", embedChatUrl='" + embedChatUrl + '\'' +
                ", isGeo=" + isGeo +
                '}';
    }
}

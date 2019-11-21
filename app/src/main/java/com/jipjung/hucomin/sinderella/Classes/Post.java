package com.jipjung.hucomin.sinderella.Classes;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Post {
    @Exclude
    public String id;
    public String image_url;
    public String user_id;
    public String nickname;
    public String title;
    public String body;
    public String category;
    public String weight;
    public String vantilation;
    public String shoe_size;
    public String waterproof;
    public int rating;
    public String created_at;
    public Bitmap bitmap;

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String uid, String title, String body) {
        this.user_id = uid;
        this.title = title;
        this.body = body;
    }

    public String getImageURL() {
        return image_url;
    }
    public String getTitle() {
        return this.title;
    }
    public String getBody() {
        return this.body;
    }
    public String getUid() { return this.user_id;}
    public String getCategory() {return this.category;}
    public String getCreated_at() {return this.created_at;}
    public String getId(){ return this.id;}
    public String getNickname(){ return this.nickname;}
    public int getRating() {return rating; }
    public String getImage_url() { return image_url; }
    public String getUser_id() { return user_id; }
    public String getWeight() { return weight; }
    public String getVantilation() { return vantilation; }
    public String getShoe_size() { return shoe_size; }
    public String getWaterproof() { return waterproof; }
    public Bitmap getBitmap() { return bitmap; }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user_id", user_id);
        result.put("title", title);
        result.put("body", body);
        result.put("image_url", image_url);
        result.put("nickname",nickname);
        result.put("category",category);
        result.put("created_at",created_at);
        result.put("id",id);
        result.put("rating",rating);
        result.put("weight",weight);
        result.put("user_id",user_id);
        result.put("vantilation",vantilation);
        result.put("shoe_size",shoe_size);
        result.put("waterproof",waterproof);
        return result;
    }

    public <T extends Post> T withId(@NonNull final String id) {
        this.id = id;
        return (T) this;
    }
}

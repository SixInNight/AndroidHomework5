package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // todo 添加api
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword
    @POST("user/register")
    Call<UserResponse> regist(@Field("name") String username, @Field("password")String password, @Field("repassword")String repassword);
}

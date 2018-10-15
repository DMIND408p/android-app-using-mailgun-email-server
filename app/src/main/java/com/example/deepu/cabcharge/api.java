package com.example.deepu.cabcharge;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface api {
    @FormUrlEncoded
    @POST("messages")
    Call<ResponseBody> sendEmail(
            @Field("from") String from,
            @Field("to") String to,
            @Field("cc") String cc,
            @Field("bcc") String bcc,
            @Field("subject") String subject,
            @Field("text") String text
    );


}

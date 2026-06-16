package org.example;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
//
//interface  TodoAPI{
//    @GET("todos/{id}")
//    Call<Todo> getTodo (
//            @Path("id") int id
//    );
//
//};

public class Main {
    static void main() {


//       OkHttpClient client= new OkHttpClient();
//
//        String url_string ="https://jsonplaceholder.typicode.com/todos/1";
//
//        Request request= new Request.Builder().url(url_string).build();
//        try(Response response= client.newCall(request).execute() ){
//            if(!response.isSuccessful()){
//                System.out.println("something went wrong ");
//            }
//
//            System.out.println(response.body().string());
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
;


        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl(
                                "https://jsonplaceholder.typicode.com/")
                        .addConverterFactory(
                                GsonConverterFactory.create())
                        .build();

        TodoService todoApi= retrofit.create(TodoService.class);
        Call<Todo> call= todoApi.getTodoByID(5);
        try {
            Response<Todo> response = call.execute();
            System.out.println(response.body());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

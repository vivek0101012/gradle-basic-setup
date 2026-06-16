package org.example;


import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    static void main() {

System.out.println("hellow world");

       OkHttpClient client= new OkHttpClient();

        String url_string ="https://jsonplaceholder.typicode.com/todos/1";

        Request request= new Request.Builder().url(url_string).build();
        try(Response response= client.newCall(request).execute() ){
            if(!response.isSuccessful()){
                System.out.println("something went wrong ");
            }

            System.out.println(response.body().string());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
;
    }
}

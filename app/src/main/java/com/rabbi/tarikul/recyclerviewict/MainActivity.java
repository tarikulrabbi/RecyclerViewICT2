package com.rabbi.tarikul.recyclerviewict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private NewsAdapter adapter;
    List<NewsDetails> newsList;
    ArrayList<String> newsUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsList = new ArrayList<>();
        newsUrl = new ArrayList<>();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

  /*      newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");
        newsUrl.add("www.facebook.com");*/

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webViewDetails.class);
                //String s = newsUrl.get(newsUrl.size());
                intent.putExtra("a", newsUrl.size());
                startActivity(intent);
            }
        });

        newsList.add(
                new NewsDetails(
                        "Prothom Alo",
                        "www.facebook.com",
                        "First Light",
                        R.drawable.prothomalo));

        newsList.add(
                new NewsDetails(
                        "Amader Shomoy",
                        "www.facebook.com",
                        "নতুন ধারার দৈনিক",
                        R.drawable.amadershomoi));

        newsList.add(
                new NewsDetails(

                        "Daily Ittefaq",
                        "www.facebook.com",
                        "Editor: Anwar Hossain Manju",
                        R.drawable.ittefaq));

        newsList.add(
                new NewsDetails(
                        "Samakal",
                        "www.facebook.com",
                        "অসংকোচ প্রকাশের দুরন্ত সাহস ",
                        R.drawable.samakal));

        newsList.add(
                new NewsDetails(
                        "Nayadiganta",
                        "www.facebook.com",
                        "সত্যের সঙ্গে প্রতিদিন ",
                        R.drawable.nayadiganta));

        newsList.add(
                new NewsDetails(
                        "Kaler Kantho",
                        "www.facebook.com",
                        "আংশিক নয় পুরো সত্য ",
                        R.drawable.kalerkantho));

        newsList.add(
                new NewsDetails(
                        "Jai Jai Din",
                        "www.facebook.com",
                        "১৬ কোটি মানুষের জন্য প্রতিদিন ",
                        R.drawable.jaijaidin));

        newsList.add(
                new NewsDetails(
                        "BD Protidin",
                        "www.facebook.com",
                        "আমরা জনগণের পক্ষে ",
                        R.drawable.bangladeshprotidin));
        newsList.add(
                new NewsDetails(
                        "Daily Inqilab",
                        "www.facebook.com",
                        "শুধু দেশ ও জনগনের পক্ষে ",
                        R.drawable.inqilab));
        newsList.add(
                new NewsDetails(
                        "Jugantor",
                        "www.facebook.com",
                        "সত্যের সন্ধানে নির্ভীক ",
                        R.drawable.jugantor));

        adapter = new NewsAdapter(this, newsList);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}

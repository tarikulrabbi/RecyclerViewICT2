package com.rabbi.tarikul.recyclerviewict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    NewsAdapter adapter;
    List<NewsDetails> newsList;
    String[] newsURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsList = new ArrayList<>();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        newsList.add(
                new NewsDetails(
                        "Prothom Alo",
                        "First Light",
                        R.drawable.prothomalo));

       newsList.add(
                new NewsDetails(
                       "Amader Shomoy",
                      "নতুন ধারার দৈনিক",
                       R.drawable.amadershomoi));

       newsList.add(
              new NewsDetails(

                     "Daily Ittefaq",
                      "Editor: Anwar Hossain Manju",
                      R.drawable.ittefaq));

        newsList.add(
                new NewsDetails(
                        "Samakal",
                        "অসংকোচ প্রকাশের দুরন্ত সাহস ",
                        R.drawable.samakal));

        newsList.add(
                new NewsDetails(
                        "Nayadiganta",
                        "সত্যের সঙ্গে প্রতিদিন ",
                        R.drawable.nayadiganta));

        newsList.add(
                new NewsDetails(
                        "Kaler Kantho",
                        "আংশিক নয় পুরো সত্য ",
                        R.drawable.kalerkantho));

        newsList.add(
                new NewsDetails(
                        "Jai Jai Din",
                        "১৬ কোটি মানুষের জন্য প্রতিদিন ",
                        R.drawable.jaijaidin));

        newsList.add(
                new NewsDetails(
                        "BD Protidin",
                        "আমরা জনগণের পক্ষে ",
                        R.drawable.bangladeshprotidin));
        newsList.add(
                new NewsDetails(
                        "Daily Inqilab",
                        "শুধু দেশ ও জনগনের পক্ষে ",
                        R.drawable.inqilab));
        newsList.add(
                new NewsDetails(
                        "Jugantor",
                        "সত্যের সন্ধানে নির্ভীক ",
                        R.drawable.jugantor));

        adapter = new NewsAdapter(this, newsList,newsURL);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}

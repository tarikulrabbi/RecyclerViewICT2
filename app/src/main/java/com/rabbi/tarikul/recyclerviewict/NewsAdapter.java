package com.rabbi.tarikul.recyclerviewict;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private Context mcontext;
    private List<NewsDetails> newsDetails;

    public NewsAdapter(Context mcontext, List<NewsDetails> newsDetails) {
        this.mcontext = mcontext;
        this.newsDetails = newsDetails;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsViewHolder newsViewHolder, int i) {

        final NewsDetails news = newsDetails.get(i);

        newsViewHolder.textTitle.setText(news.getTextviewTitle());
        newsViewHolder.textDetails.setText(news.getTextViewDetails());

        newsViewHolder.imageView.setImageDrawable(mcontext.getResources().getDrawable(news.getImage()));

        newsViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(mcontext, " " + news.getTextviewTitle(), Toast.LENGTH_LONG).show();

               //Intent intent = new Intent(Intent.ACTION_VIEW);
               //intent.setData(Uri.parse(newsUrl[newsViewHolder.getAdapterPosition()]));
              // mcontext.startActivity(intent);
                Intent intent = new Intent(mcontext, NewsDeatailsActivity.class);
                intent.putExtra("web_url", news.getWebUrl());
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsDetails.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textTitle, textDetails;
        LinearLayout linearLayout;


        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewId);
            textTitle = itemView.findViewById(R.id.newsNames);
            textDetails = itemView.findViewById(R.id.clickDetailsId);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}

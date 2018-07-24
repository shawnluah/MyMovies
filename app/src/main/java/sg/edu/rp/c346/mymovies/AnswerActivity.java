package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnswerActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<movieitem> alMovieList;
    TextView tvTitle;


    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Intent intentReceived = getIntent();
        String movieSelected = intentReceived.getStringExtra("movie");
        tvTitle.setText(movieSelected + "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");


        lvMovie = findViewById(R.id.ListViewMovie);

        tvTitle = findViewById(R.id.textViewTitle);



        alMovieList = new ArrayList<>();

        movieitem item1 = new movieitem("The Avengers", "2012", "Action | Sci-Fi", true);
        movieitem item2 = new movieitem("Planes", "2013", "Animation | Comedy", false);

        alMovieList.add(item1);
        alMovieList.add(item2);


        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);

    }
}

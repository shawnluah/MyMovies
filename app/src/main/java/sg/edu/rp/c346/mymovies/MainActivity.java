package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<movieitem> alMovieList;
    TextView tvTitle;


    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        tvTitle = findViewById(R.id.textViewTitle);

        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(),AnswerActivity.class );
                intent.putExtra("movie", "movie1")
                startActivity(intent);
            }
        });

        alMovieList = new ArrayList<>();

        movieitem item1 = new movieitem("The Avengers", "2012", "Action | Sci-Fi", true);
        movieitem item2 = new movieitem("Planes", "2013", "Animation | Comedy", false);

        alMovieList.add(item1);
        alMovieList.add(item2);


        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);
    }


}

package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<movieitem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<movieitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenreDate);

        ImageView ivMovie = rowView.findViewById(R.id.imageViewMovie);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        movieitem currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvGenre.setText(currentItem.getYear() +" - " + currentItem.getGenre());

        if (currentItem.isPg13()) {

            ivMovie.setImageResource(R.drawable.rating_pg13);
        }
        else {
            ivMovie.setImageResource(R.drawable.rating_pg);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}

package app.bestquotes.af;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GeneralViewActivity extends AppCompatActivity {



    String names[]={"Messi is the best player","Ronaldo is the best Player"};


    String name;
    String quote;
    int photoId;
    int position;


    ImageView ivPhot;

    TextView tvName , tvQuotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_view);


        ivPhot = findViewById(R.id.ivphotoGeneral);
        tvName = findViewById(R.id.tvnameGeneral);
        tvQuotes = findViewById(R.id.tvQuoteGeneral);


        if (getIntent().getStringExtra("name")!=null){


            photoId=getIntent().getIntExtra("photo",0);

            name=getIntent().getStringExtra("name");

            quote=getIntent().getStringExtra("quote");

            position=getIntent().getIntExtra("position",0);


        }


        ivPhot.setImageResource(photoId);
        tvName.setText(name);
        tvQuotes.setText(names[position]);








    }
}

package app.bestquotes.af;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.quotesItemViewHolder> {

    String names[];

    String quotes[];

    int photos[];
    Context context;

    public QuotesAdapter(String[] names, String[] quotes, int[] photos, Context context) {
        this.names = names;
        this.quotes = quotes;
        this.photos = photos;
        this.context=context;
    }

    @NonNull
    @Override
    public quotesItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.quotes_item,parent,false);


        return new quotesItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull quotesItemViewHolder holder, final int position) {

        holder.tvQuote.setText(quotes[position]);
        holder.tvName.setText(names[position]);
        holder.ivPhoto.setImageResource(photos[position]);

        holder.ivPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position){

                    case 1:
                        Intent intent=new Intent(context,SignUpActivity.class);
                        context.startActivity(intent);

                        break;
                    case 2:
                        Intent intent2=new Intent(context,Main2Activity.class);
                        context.startActivity(intent2);
                        break;

                    case 3:
                        Toast.makeText(context, "This is Third Item", Toast.LENGTH_SHORT).show();

                        break;

                }



            }
        });


    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class quotesItemViewHolder extends RecyclerView.ViewHolder{

        ImageView ivPhoto;
        TextView tvName;
        TextView tvQuote;


        public quotesItemViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPhoto=itemView.findViewById(R.id.ivPhoto);
            tvName=itemView.findViewById(R.id.tvName);
            tvQuote=itemView.findViewById(R.id.tvQuote);

        }
    }
}

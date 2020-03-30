package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import alamin.c.islamicapp.R;

public class SuraListRecyclerAdapter extends RecyclerView.Adapter<SuraListRecyclerAdapter.MyViewHolder> {
    private BlessingsAdapters.OnItemClickListner listner;
    private Context context;
    private  String[] values;
    private  int[] serials;


    public SuraListRecyclerAdapter(Context context, String[] values, int[] serials) {
        this.context = context;
        this.values = values;
        this.serials = serials;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view= LayoutInflater.from(context).inflate(R.layout.blessing_fragments_parent_sample_layout,parent,false);



        return new SuraListRecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.valuesTextview.setText(values[position]);
        holder.serialTextview.setText(serials[position]);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder  extends  RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView valuesTextview;
        private  TextView serialTextview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            valuesTextview=itemView.findViewById(R.id.blessingParentValueTextviewid);
            serialTextview=itemView.findViewById(R.id.blessingParentSerialTextviewid);




            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listner!=null){
                int position=getAdapterPosition();
                if(position!=RecyclerView.NO_POSITION){
                    listner.OnItemClick(position);
                }
            }
        }

    }

    public interface  OnItemClickListner{
        void OnItemClick(int position);
    }

    public void setOnItemClickListener(BlessingsAdapters.OnItemClickListner listener){
        this.listner=listener;

    }
}

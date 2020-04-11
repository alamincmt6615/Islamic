package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import alamin.c.islamicapp.R;

public class ParaWiseSuraListAdapater extends RecyclerView.Adapter<ParaWiseSuraListAdapater.MyViewHolder> {


    private OnItemClickListner listner;
    private Context context;
    private  String[] values;

    public ParaWiseSuraListAdapater(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.blessing_fragments_parent_sample_layout,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.valuesTextview.setText(values[position]);
        holder.serialTextview.setText(""+(position+1));


    }

    @Override
    public int getItemCount() {
        return values.length;
    }
    public void filterList(ArrayList<String> filterdNames) {
        for (int i=0; i<filterdNames.size(); i++){
            this.values = filterdNames.toArray(new String[i]);
            notifyDataSetChanged();
        }

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

    public void setOnItemClickListener(OnItemClickListner listener){
        this.listner=listener;

    }
}

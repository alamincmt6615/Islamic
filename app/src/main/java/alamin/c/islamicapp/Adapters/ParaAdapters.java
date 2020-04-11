package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alamin.c.islamicapp.DataHandeler.ParaListHandeler;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.R;

public class ParaAdapters extends RecyclerView.Adapter<ParaAdapters.MyViewHolder> {


    private OnItemClickListner listner;
    private Context context;
private List<ParaListHandeler> suraHandelarList;

    public ParaAdapters(Context context, List<ParaListHandeler> suraHandelarList) {
        this.context = context;
        this.suraHandelarList = suraHandelarList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.parasample_layoute,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ParaListHandeler paraListHandeler=suraHandelarList.get(position);

        holder.serialTextview.setText(paraListHandeler.getParaserial());
        holder.translateTextview.setText(paraListHandeler.getParaname());
        holder.arabicTextveiwid.setText(paraListHandeler.getParaArabic());



    }

    @Override
    public int getItemCount() {
        return suraHandelarList.size();
    }


    public class MyViewHolder  extends  RecyclerView.ViewHolder implements View.OnClickListener {

        private  TextView serialTextview;
        private  TextView translateTextview;
        private  TextView  arabicTextveiwid;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);



            serialTextview=itemView.findViewById(R.id.para_SerialTextviewid);
            translateTextview=itemView.findViewById(R.id.para_sura_NameTextviewid);
            arabicTextveiwid=itemView.findViewById(R.id.arabic_ParaNameTextviewid);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listner!=null){
                int position=getAdapterPosition();
                if(position!= RecyclerView.NO_POSITION){
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

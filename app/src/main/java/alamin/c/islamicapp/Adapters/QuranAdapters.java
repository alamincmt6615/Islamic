package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.R;

public class QuranAdapters extends RecyclerView.Adapter<QuranAdapters.MyViewHolder> {


    private OnItemClickListner listner;
    private Context context;
private List<SuraNameHandeler> suraHandelarList;

    public QuranAdapters(Context context, List<SuraNameHandeler> suraHandelarList) {
        this.context = context;
        this.suraHandelarList = suraHandelarList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.sura_name_sample_layoute,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SuraNameHandeler suraHandelar=suraHandelarList.get(position);

        holder.valuesTextview.setText(suraHandelar.getName());
        holder.serialTextview.setText(suraHandelar.getSerial());
        holder.translateTextview.setText(suraHandelar.getTranslate());
        holder.arabicTextveiwid.setText(suraHandelar.getArabic());



    }

    @Override
    public int getItemCount() {
        return suraHandelarList.size();
    }


    public class MyViewHolder  extends  RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView valuesTextview;
        private  TextView serialTextview;
        private  TextView translateTextview;
        private  TextView  arabicTextveiwid;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);



            valuesTextview=itemView.findViewById(R.id.sura_NameTextviewid);
            serialTextview=itemView.findViewById(R.id.sura_SerialTextviewid);
            translateTextview=itemView.findViewById(R.id.suraNameMeanignTextviewid);
            arabicTextveiwid=itemView.findViewById(R.id.arabic_SuraNameTextviewid);



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

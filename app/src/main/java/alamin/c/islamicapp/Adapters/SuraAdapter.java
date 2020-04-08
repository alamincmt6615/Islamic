package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alamin.c.islamicapp.DataHandeler.SuraValues;
import alamin.c.islamicapp.R;

public class SuraAdapter extends RecyclerView.Adapter<SuraAdapter.MyViewHolder> {


    private OnItemClickListner listner;
    private Context context;
private List<SuraValues> suraValues;

    public SuraAdapter(Context context, List<SuraValues> suraValues) {
        this.context = context;
        this.suraValues = suraValues;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.sura_shower_sample_layoute,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SuraValues suraValues1=suraValues.get(position);

        holder.arabicTextview.setText(suraValues1.getArabic());
        holder.banglaTextview.setText("অর্থঃ   "+suraValues1.getBangla()+"\n");
        holder.banglaTranslateTextview.setText("উচ্চারণঃ   "+suraValues1.getBanglaTranslate()+"\n");



    }

    @Override
    public int getItemCount() {
        return suraValues.size();
    }


    public class MyViewHolder  extends  RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView arabicTextview;
        private  TextView banglaTextview;
        private  TextView banglaTranslateTextview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            arabicTextview=itemView.findViewById(R.id.arabicTextviewid);
            banglaTextview=itemView.findViewById(R.id.banglaTextviewid);
            banglaTranslateTextview=itemView.findViewById(R.id.banglaTranslateTextviewid);




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

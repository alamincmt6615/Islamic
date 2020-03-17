package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alamin.c.islamicapp.DataHandeler.LastReadData;
import alamin.c.islamicapp.R;

public class LastReadAdapter extends RecyclerView.Adapter<LastReadAdapter.MyViewHolder> {


    private OnItemClickListner listner;
    private Context context;
    private List<LastReadData> lastReadData;

    public LastReadAdapter(Context context, List<LastReadData> lastReadData) {
        this.context = context;
        this.lastReadData = lastReadData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.blessing_fragments_parent_sample_layout,parent,false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        LastReadData lastRead=lastReadData.get(position);

        holder.valuesTextview.setText(lastRead.getName());
        holder.serialTextview.setText(lastRead.getSerial());


    }

    @Override
    public int getItemCount() {
        return lastReadData.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder  implements View.OnClickListener, View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private TextView valuesTextview;
        private  TextView serialTextview;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            valuesTextview=itemView.findViewById(R.id.blessingParentValueTextviewid);
            serialTextview=itemView.findViewById(R.id.blessingParentSerialTextviewid);


            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
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

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Chose an action");
            MenuItem deleteitem=menu.add(Menu.NONE,1,1,"Delete");

            deleteitem.setOnMenuItemClickListener(this);
        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            if(listner!=null){
                int position=getAdapterPosition();
                if(position!=RecyclerView.NO_POSITION){
                    switch (item.getItemId()){
                        case 1:
                            listner.onDelete(position);
                            return  true;
                    }
                }
            }

            return false;
        }
    }

    public interface  OnItemClickListner{
        void OnItemClick(int position);
        void onDelete(int position);
    }

    public void setOnItemClickListener(OnItemClickListner listener){
        this.listner=listener;

    }
}

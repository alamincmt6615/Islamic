package alamin.c.islamicapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

import alamin.c.islamicapp.DataHandeler.BlessingChildData;
import alamin.c.islamicapp.DataHandeler.BlessingParentData;
import alamin.c.islamicapp.R;

public class ExpandebleAdapter extends ExpandableRecyclerViewAdapter<ExpandebleAdapter.ParentViewholder,ExpandebleAdapter.ChiledAdapter> {


    public ExpandebleAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public ParentViewholder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.blessing_fragments_parent_sample_layout,parent,false);



        return new ParentViewholder(view);
    }

    @Override
    public ChiledAdapter onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.blessing_fragments_chiled_sample_layout,parent,false);



        return new ChiledAdapter(view);
    }

    @Override
    public void onBindChildViewHolder(ChiledAdapter holder, int flatPosition, ExpandableGroup group, int childIndex) {

        final  BlessingChildData blessingChildData= (BlessingChildData) group.getItems().get(childIndex);
        holder.bind(blessingChildData);

    }

    @Override
    public void onBindGroupViewHolder(ParentViewholder holder, int flatPosition, ExpandableGroup group) {
        final BlessingParentData parentData= (BlessingParentData) group;
        holder.bind(parentData);
    }


    public class ParentViewholder  extends GroupViewHolder {
        private TextView serialTextview;
        private TextView valueTextview;

        public ParentViewholder(View itemView) {
            super(itemView);
            serialTextview=itemView.findViewById(R.id.blessingParentSerialTextviewid);
            valueTextview=itemView.findViewById(R.id.blessingParentValueTextviewid);
        }


        public void  bind(BlessingParentData company){
                serialTextview.setBackgroundResource(R.drawable.list_backgroun2d);
                valueTextview.setText(company.getTitle());
                serialTextview.setText(company.getSerial());

        }


    }



    public class ChiledAdapter  extends ChildViewHolder {

        private TextView serialTextview;
        private TextView valueTextview;

        public ChiledAdapter(View itemView) {
            super(itemView);

            serialTextview=itemView.findViewById(R.id.blessingChildeSerialTextviewid);
            valueTextview=itemView.findViewById(R.id.blessingChiledValueTextviewid);


        }


        public void  bind(BlessingChildData product){
            valueTextview.setText(product.name);
            serialTextview.setText(product.serial);
        }





    }
}

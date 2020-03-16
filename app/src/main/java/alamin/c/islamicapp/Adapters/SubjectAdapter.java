package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import alamin.c.islamicapp.R;

public class SubjectAdapter extends BaseAdapter {
    int[] images;
    String[] values;
    Context context;
    LayoutInflater layoutInflater;

    public SubjectAdapter(int[] images, String[] values, Context context) {
        this.images = images;
        this.values = values;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.subject_fragment_sample_layout,parent,false);
        }

        ImageView imageView;
        TextView textView;
        imageView=convertView.findViewById(R.id.subject_sample_ImageViewid);
        textView=convertView.findViewById(R.id.subject_sample_Textviewid);
        imageView.setImageResource(images[position]);
        textView.setText(values[position]);



        return convertView;
    }
}

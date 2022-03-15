package huyueh.edu.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class ImageAdapterActivity extends BaseAdapter {
    private Context context;

    private String[] images;

    public ImageAdapterActivity(@NonNull Context context, @NonNull String[] objects) {
        images = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.image, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.myImage);
        Picasso.with(context).load(images[position]).resize(350, 350).centerCrop().into(imageView);
        return convertView;
    }
}

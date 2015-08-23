package listview01.nitesi.com.listview01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by nitesi on 23-08-2015.
 */
public class CustomAdapter extends ArrayAdapter<Object>{
    public CustomAdapter(Context context, int resource, Object[] objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            //noinspection ResourceTyp
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.inner_item, parent, false);
        }

        String cur = (String)getItem(position);

        TextView contentText = (TextView)convertView.findViewById(R.id.contentText);
        contentText.setText(cur);

        return convertView;
    }
}

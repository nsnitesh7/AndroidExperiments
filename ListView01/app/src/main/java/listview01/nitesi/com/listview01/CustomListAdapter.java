package listview01.nitesi.com.listview01;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.database.DataSetObserver;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nitesi on 22-08-2015.
 */
public class CustomListAdapter extends ArrayAdapter<Object> {

    public CustomListAdapter(Context context, int resource, Object[] objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            //noinspection ResourceTyp
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        String cur = (String)getItem(position);

        TextView positionText = (TextView)convertView.findViewById(R.id.listItemID);
        positionText.setText(Integer.toString(position));
        TextView contentText =(TextView)convertView.findViewById(R.id.listItemContent);
        contentText.setText(cur);

        ListView lv = (ListView)convertView.findViewById(R.id.hiddenListView);
        String[] it = new String[]{"1","2","3"};
        CustomAdapter listAdapt = new CustomAdapter(getContext(),0,it);
        lv.setAdapter(listAdapt);

        return convertView;
    }
}

package listview01.nitesi.com.listview01;

import android.database.DataSetObserver;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listID);
        View empty=getLayoutInflater().inflate(R.layout.empty_list, null, false);
        ((ViewGroup)listView.getParent()).addView(empty);
        listView.setEmptyView(empty);

        String[] items = new String[]{ "Android Introduction","Android Setup/Installation","Android Hello World","Android Layouts/Viewgroups","Android Activity & Lifecycle","Intents in Android"};

        CustomListAdapter listAdapter = new CustomListAdapter(MainActivity.this,R.id.list_item,items);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView lv = (ListView)view.findViewById(R.id.hiddenListView);
                if(lv.getVisibility()==View.INVISIBLE)
                {
                    lv.setVisibility(View.VISIBLE);
                }
                else
                {
                    lv.setVisibility(View.INVISIBLE);
                }
            }
        });

        listView.setAdapter(listAdapter);
    }
}

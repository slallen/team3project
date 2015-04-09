package com.example1.slallen.myapplication;

import android.app.ListActivity;
import android.app.SearchManager;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by sweet_000 on 4/8/2015.
 */
public class SearchableActivity extends ListActivity {
    //receiving the data
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }
    }

    public void doMySearch(String query) {
        String result = new Blank.SearchItems(query);
        List<String> userNames = new ArrayList<String>();

        String _parsedResult[] = result.split("\\n");
        for( int i = 0; i<_parsedResult.length; i++){
            String _splitData[] = _parsedResult[i].split("\\|");
            String itemName = _splitData[0];
            userNames.add(itemName);
        }

        ArrayAdapter<String> arr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userNames);
        this.setListAdapter(arr);
    }

    //searching the data


    //
}

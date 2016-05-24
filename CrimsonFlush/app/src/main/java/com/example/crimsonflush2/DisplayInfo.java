package com.example.crimsonflush2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayInfo extends Activity {

    public static final String EXTRA_TOILET_TITLE = "toilet_title";

    TextView textTitle;
    TextView textSnippet;
    TextView textNeedsId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        // Display to show title, snippet, and ID requirements
        textTitle = (TextView) findViewById(R.id.textTitle);
        textSnippet = (TextView) findViewById(R.id.textSnippet);
        textNeedsId = (TextView) findViewById(R.id.textNeedsId);

        String title = getIntent().getStringExtra(EXTRA_TOILET_TITLE);
        Toilet toilet = Toilet.TOILETS.get(title);

        textTitle.setText(toilet.title);
        textSnippet.setText(toilet.snippet);
        textNeedsId.setText("Needs ID? " + (toilet.needId ? "Yes" : "No"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.osahub.rachit.navigationdrawerapplication;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CourseActivity extends GuestNavDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        TextView cse=(TextView)findViewById(R.id.cse);
        TextView eee=(TextView)findViewById(R.id.eee);
        TextView it=(TextView)findViewById(R.id.it);
        TextView ece=(TextView)findViewById(R.id.ece);

        //getLayoutInflater().inflate(R.layout.activity_guest_nav_drawer, frameLayout);

        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);

        cse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent cseIntent = new Intent(getApplicationContext(), CSEActivity.class);
                startActivity(cseIntent);
                return false;
            }
        });
        it.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent itIntent = new Intent(getApplicationContext(), ITActivity.class);
                startActivity(itIntent);
                return false;
            }
        });
        eee.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent eeeIntent = new Intent(getApplicationContext(), EEEActivity.class);
                startActivity(eeeIntent);
                return false;
            }
        });
        ece.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent eceIntent = new Intent(getApplicationContext(), ECEActivity.class);
                startActivity(eceIntent);
                return false;
            }
        });
    }

    public static class PlaceholderFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_guest_nav_drawer, container, false);
            return rootView;
        }
    }


}

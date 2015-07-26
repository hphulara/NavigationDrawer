package com.osahub.rachit.navigationdrawerapplication;

import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class HomeActivity extends GuestNavDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Adding our layout to parent class frame layout.
         */
        getLayoutInflater().inflate(R.layout.activity_guest_nav_drawer, frameLayout);

        /**
         * Setting title and itemChecked
         */
        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);

        ((ImageView)findViewById(R.id.image_view)).setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_drawer));
    }
}

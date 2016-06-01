package com.example.hope.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.zyh.bigduang.Activity_Info;
import com.example.zyh.bigduang.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Home extends Activity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        List<Movietheatre> list = new ArrayList<Movietheatre>(); // 获取数据

        Movietheatre test = new Movietheatre();
        test.setTheatreDistance(2.33);
        test.setTheatreId(0);
        test.setTheatreMark(4.4);
        test.setTheatrePrice(32.0);
        test.setTheatreName("金逸影城");

        Movietheatre test1 = new Movietheatre();
        test1.setTheatreDistance(2.33);
        test1.setTheatreId(1);
        test1.setTheatreMark(4.4);
        test1.setTheatrePrice(32.0);
        test1.setTheatreName("飞扬影城");

        Movietheatre test2 = new Movietheatre();
        test2.setTheatreDistance(2.33);
        test2.setTheatreId(2);
        test2.setTheatreMark(4.4);
        test2.setTheatrePrice(32.0);
        test2.setTheatreName("映联万和");

        list.add(test);
        list.add(test1);
        list.add(test2);


        TheatreAdapter adapter = new TheatreAdapter(this, list);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        ViewGroup group = (ViewGroup) findViewById(R.id.addlayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(R.drawable.bird);
        group.addView(imageView);

        ImageView imageView1 = new ImageView(this);
        imageView1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView1.setImageResource(R.drawable.bird);
        group.addView(imageView1);

        ImageView imageView2 = new ImageView(this);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView2.setImageResource(R.drawable.bird);
        group.addView(imageView2);

        Button buser = (Button)findViewById(R.id.user_info);
        Button bmovie = (Button)findViewById(R.id.movie_info);
        Button bcinema = (Button)findViewById(R.id.cinema_info);
        buser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Home.this, Activity_Info.class);
                startActivity(intent);
            }
        });

        bmovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Home.this, Activity_Movieinfo.class);
                startActivity(intent);
            }
        });

        bcinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Home.this, Activity_Cinemainfo.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;
    FrameLayout frameLayout;
    TextView textView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView=findViewById(R.id.navigationView);
        frameLayout=findViewById(R.id.frameLayout);
        textView=findViewById(R.id.textView);


        textView.setText("home");
        frameLayout.setBackgroundColor(258963);
        navigationView.setOnNavigationItemSelectedListener(naviCustomListView);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener naviCustomListView= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.notificationId:
                    textView.setText("Notification");
                    break;
                case R.id.messageId:
                    textView.setText("Messages");
                    break;
                case R.id.addId:
                    textView.setText("Add");
                    break;

                case R.id.homeId:
                    textView.setText("Home");
                    break;
                case R.id.moreId:
                    textView.setText("more");
                    break;


            }
            return true;
        }
    };
}

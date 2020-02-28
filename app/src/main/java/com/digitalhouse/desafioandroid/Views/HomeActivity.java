package com.digitalhouse.desafioandroid.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.digitalhouse.desafioandroid.R;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );


    }
}

package com.podp.aleks.sapphire.fueltanks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.podp.aleks.sapphire.InfoActivity;
import com.podp.aleks.sapphire.R;

public class FuelActivity extends AppCompatActivity implements View.OnClickListener{

    Button fuelTank1;
    Button fuelTank2;
    Button fuelTank3;
    Button fuelTank4;
    Button fuelTank5;
    Button fuelTank6;
    Button fuelTank7;
    Button fuelTank8;
    Button fueloverflowTank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel);

        InitViews();
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.fuelTank1:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank1");
                startActivity(intent);
                break;
            case R.id.fuelTank2:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank2");
                startActivity(intent);
                break;
            case R.id.fuelTank3:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank3");
                startActivity(intent);
                break;
            case R.id.fuelTank4:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank4");
                startActivity(intent);
                break;
            case R.id.fuelTank5:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank5");
                startActivity(intent);
                break;
            case R.id.fuelTank6:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank6");
                startActivity(intent);
                break;
            case R.id.fuelTank7:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank7");
                startActivity(intent);
                break;
            case R.id.fuelTank8:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fuelTank8");
                startActivity(intent);
                break;
            case R.id.overflowTank:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","fueloverflowTank");
                startActivity(intent);
                break;
        }
    }

    private void InitViews(){
        fuelTank1 = (Button) findViewById(R.id.fuelTank1);
        fuelTank2 = (Button) findViewById(R.id.fuelTank2);
        fuelTank3 = (Button) findViewById(R.id.fuelTank3);
        fuelTank4 = (Button) findViewById(R.id.fuelTank4);
        fuelTank5 = (Button) findViewById(R.id.fuelTank5);
        fuelTank6 = (Button) findViewById(R.id.fuelTank6);
        fuelTank7 = (Button) findViewById(R.id.fuelTank7);
        fuelTank8 = (Button) findViewById(R.id.fuelTank8);
        fueloverflowTank = (Button) findViewById(R.id.overflowTank);

        fuelTank1.setOnClickListener(this);
        fuelTank2.setOnClickListener(this);
        fuelTank3.setOnClickListener(this);
        fuelTank4.setOnClickListener(this);
        fuelTank5.setOnClickListener(this);
        fuelTank6.setOnClickListener(this);
        fuelTank7.setOnClickListener(this);
        fuelTank8.setOnClickListener(this);
        fueloverflowTank.setOnClickListener(this);
    }
}

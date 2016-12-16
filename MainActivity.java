package com.podp.aleks.sapphire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.podp.aleks.sapphire.bilgetanks.BilgeActivity;
import com.podp.aleks.sapphire.fueltanks.FuelActivity;
import com.podp.aleks.sapphire.oiltanks.OilActivity;
import com.podp.aleks.sapphire.domestictanks.DomesticActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button fuelTanks;
    Button oilTanks;
    Button domesticTanks;
    Button bilgeTanks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fuelTanks = (Button) findViewById(R.id.fuelTanks);
        oilTanks = (Button) findViewById(R.id.oilTanks);
        domesticTanks = (Button) findViewById(R.id.domesticTanks);
        bilgeTanks = (Button) findViewById(R.id.bilgeTanks);

        fuelTanks.setOnClickListener(this);
        oilTanks.setOnClickListener(this);
        domesticTanks.setOnClickListener(this);
        bilgeTanks.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.fuelTanks:
                intent = new Intent(this, FuelActivity.class);
                startActivity(intent);
                break;
            case R.id.oilTanks:
                intent = new Intent(this, OilActivity.class);
                startActivity(intent);
                break;
            case R.id.domesticTanks:
                intent = new Intent(this, DomesticActivity.class);
                startActivity(intent);
                break;
            case R.id.bilgeTanks:
                intent = new Intent(this, BilgeActivity.class);
                startActivity(intent);
                break;
        }

    }
}

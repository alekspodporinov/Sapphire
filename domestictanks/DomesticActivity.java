package com.podp.aleks.sapphire.domestictanks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.podp.aleks.sapphire.InfoActivity;
import com.podp.aleks.sapphire.R;

public class DomesticActivity extends AppCompatActivity implements View.OnClickListener{

    Button waterTank1;
    Button waterTank2;
    Button boilerTank;
    Button afterpeak;
    Button forepeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        InitViews();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, InfoActivity.class);

        switch (view.getId()){
            case R.id.waterTank1:
                intent.putExtra("tank","waterTank1");
                startActivity(intent);
                break;
            case R.id.waterTank2:
                intent.putExtra("tank","waterTank2");
                startActivity(intent);
                break;
            case R.id.boilerTank:
                intent.putExtra("tank","boilerTank");
                startActivity(intent);
                break;
            case R.id.afterpeak:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","afterpeak");
                startActivity(intent);
                break;
            case R.id.forepeak:
                intent.putExtra("tank","forepeak");
                startActivity(intent);
                break;
        }
    }

    private void InitViews(){
        waterTank1 = (Button) findViewById(R.id.waterTank1);
        waterTank2 = (Button) findViewById(R.id.waterTank2);
        boilerTank = (Button) findViewById(R.id.boilerTank);
        afterpeak  = (Button) findViewById(R.id.afterpeak);
        forepeak   = (Button) findViewById(R.id.forepeak);

        waterTank1.setOnClickListener(this);
        waterTank2.setOnClickListener(this);
        boilerTank.setOnClickListener(this);
        afterpeak.setOnClickListener(this);
        forepeak.setOnClickListener(this);
    }


}

package com.podp.aleks.sapphire.bilgetanks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.podp.aleks.sapphire.InfoActivity;
import com.podp.aleks.sapphire.R;
import com.podp.aleks.sapphire.modelTanks.BaseTank;
import com.podp.aleks.sapphire.modelTanks.BilgeTank1;

public class BilgeActivity extends AppCompatActivity implements View.OnClickListener{

    Button bilgeTank1;
    Button bilgeTank2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilge);

        bilgeTank1 = (Button) findViewById(R.id.bilgeTank1);
        bilgeTank2 = (Button) findViewById(R.id.bilgeTank2);

        bilgeTank1.setOnClickListener(this);
        bilgeTank2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.bilgeTank1:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","bilgeTank1");
                startActivity(intent);
                break;
            case R.id.bilgeTank2:
                intent = new Intent(this, InfoActivity.class);
                intent.putExtra("tank","bilgeTank2");
                startActivity(intent);
                break;
        }

    }
}

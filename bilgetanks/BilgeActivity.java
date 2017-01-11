package com.podp.aleks.sapphire.bilgetanks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.TextView;

import com.podp.aleks.sapphire.R;
import com.podp.aleks.sapphire.modelTanks.BaseTank;
import com.podp.aleks.sapphire.modelTanks.BilgeTank1;

public class BilgeActivity extends AppCompatActivity {

    BaseTank b = new BilgeTank1();
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilge);
        tv = (TextView) findViewById(R.id.txt);
        Double a = b.GetStock(0.43);
        tv.setText(String.format("%.3f", a));
    }
}

package com.podp.aleks.sapphire;

import android.content.Intent;
import android.content.SharedPreferences;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.podp.aleks.sapphire.modelTanks.BaseTank;
import com.podp.aleks.sapphire.modelTanks.TanksFactory;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {


    Button calculateBtn;
    TextView totalTv;
    TextView tankNameTv;
    EditText levelEt;

    BaseTank tank;
    TanksFactory factory = new TanksFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        tank = factory.getTank(intent.getStringExtra("tank"));

        InitViews();
    }

    @Override
    public void onClick(View view) {
        if (tank == null) {
            Toast toast = Toast.makeText(
                    this,
                    "Что то пошло не так =(",
                    Toast.LENGTH_LONG);
            toast.show();
        }
        switch (view.getId()) {
            case R.id.calculate:
                Double level = Double.parseDouble(levelEt.getText().toString());
                if (level > tank.GetMaxlevel() || level == 0) {
                    Toast toast = Toast.makeText(
                            this,
                            "Уровень введен не верно, уровень не может быть больше -  " + tank.GetMaxlevel() + "м и меньше 0.1м",
                            Toast.LENGTH_LONG);
                    toast.show();
                    return;
                }
                Double stock = tank.GetStock(level);
                totalTv.setText("В танке " + String.format("%.3f", stock) + " m3");
                totalTv.setTextSize(40);
        }
    }

    private void InitViews() {
        calculateBtn = (Button) findViewById(R.id.calculate);
        totalTv = (TextView) findViewById(R.id.total);
        tankNameTv = (TextView) findViewById(R.id.tankName);
        levelEt = (EditText) findViewById(R.id.level);

        calculateBtn.setOnClickListener(this);
        tankNameTv.setText(tank.GetName());
    }
}

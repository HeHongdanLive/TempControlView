package com.yang.tempcontrolview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hehongdan.view.TempControlView;

/**
 * 主页
 * Created by yangle on 2016/11/19.
 * <p>
 * Website：http://www.yangle.tech
 * GitHub：https://github.com/alidili
 * CSDN：http://blog.csdn.net/kong_gu_you_lan
 * JianShu：http://www.jianshu.com/u/34ece31cd6eb
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TempControlView tempControl = findViewById(R.id.temp_control);
        // 设置三格代表温度1度
        tempControl.setAngleRate(3);
        tempControl.setTemp(16, 37, 16);

        tempControl.setOnTempChangeListener(new TempControlView.OnTempChangeListener() {
            @Override
            public void change(int temp) {
                Toast.makeText(MainActivity.this, temp + "°", Toast.LENGTH_SHORT).show();
            }
        });

        tempControl.setOnClickListener(new TempControlView.OnClickListener() {
            @Override
            public void onClick(int temp) {
                Toast.makeText(MainActivity.this, temp + "°", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.superprofan.helloconstraint;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int mCount = 0;
    private TextView mShowCount;
    private Button btnZero;
    boolean checkZero = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        btnZero = findViewById(R.id.button_zero);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount!=null) {
            mShowCount.setText(Integer.toString(mCount));

            if (mCount%2 == 0) {
                view.setBackgroundColor(Color.RED);
            } else
                view.setBackgroundColor(Color.GREEN);
        }
    }

    public void zero(View view) {


        mCount = 0;
        if (checkZero) {
            btnZero.setBackgroundColor(Color.MAGENTA);
            checkZero = false;
        }else if(checkZero== false) {
            btnZero.setBackgroundColor(Color.BLUE);
            checkZero = true;
        }
    }
}

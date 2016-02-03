package net.kornan.animview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import net.kornan.animview.beans.DataNumber;
import net.kornan.animview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //    TextView number;
    ActivityMainBinding binding;
    DataNumber datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        datas = new DataNumber("" + 88, "" + 0);
        binding.setData(datas);

    }

    public void onClickView(View v) {
        switch (v.getId()) {
            case R.id.number:
                datas.setStartNum("90");
                Log.i("number", datas.getStartNum());

                break;
        }
    }
}

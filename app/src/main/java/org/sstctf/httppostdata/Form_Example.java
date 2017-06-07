package org.sstctf.httppostdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import org.sstctf.httppostdata.R;

public class Form_Example extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_example);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_male:
                if (checked) {}
                else {}
                break;
            case R.id.checkbox_female:
                if (checked) {}
                else {}
                break;
        }
    }
}
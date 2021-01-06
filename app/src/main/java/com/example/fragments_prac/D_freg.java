package com.example.fragments_prac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class D_freg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_freg);
    }

    public void add_fregment(View view) {
      //  Fragment fragment = new Fragment2nd();
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //try
        {
            Bundle bundle = new Bundle();
          //  bundle.putString("Data", ((EditText)findViewById(R.id.editText_name).));

            fragmentTransaction.add(R.id.frameLayout1,new FragmentMain());
            fragmentTransaction.commit();
        }//catch (Exception e){
        //}
    }


    public void replace_fregment(View view) {
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout1,
                new Fragment2nd());
        fragmentTransaction.commit();
    }

    public void remove_fregment(View view) {
        Fragment fragment =
                getSupportFragmentManager().findFragmentById(R.id.frameLayout1);
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction()
                    .remove(fragment)
                    .commit();
        }else {
            super.onBackPressed();
        }
    }
}

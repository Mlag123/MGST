package com.example.mgst_mlagsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    public void onecorp(View view) {

  switch (view.getId()) {


      case  R.id.button:
          Intent intent = new Intent (this, activityTwo.class);
          startActivity(intent);
          break;
      default:
          break;
  }






    }

    private void startActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void twocorp(View view) {

        Intent intent = new Intent(this, twocorpus.class);
        startActivity(intent);



    }


    public void callrasp(View view) {

        Intent intent = new Intent(this,raspis.class);
        startActivity(intent);



    }


}
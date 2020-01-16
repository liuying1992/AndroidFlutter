package com.liuying.nat.flu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private Button mButton;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mButton = findViewById(R.id.button_jump);
    mButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent =
            MainFlutterActivity.withNewEngine().initialRoute("homePage").build(MainActivity.this);
        startActivity(intent);
      }
    });
  }
}

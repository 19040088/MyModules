package sg.edu.rp.c346.id19040088.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class iPad extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_pad);

        tvDisplay = findViewById(R.id.textView);
        Intent intent = getIntent();
        String value = intent.getStringExtra("value");
        tvDisplay.setText(value);
    }
}

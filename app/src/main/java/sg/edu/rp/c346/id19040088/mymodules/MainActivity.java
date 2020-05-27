package sg.edu.rp.c346.id19040088.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView Android;
    TextView iPad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Android = findViewById(R.id.textViewAP);
        iPad = findViewById(R.id.textViewIP);

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Android.class);
                intent.putExtra("value", "Module Code: C346 \n" +
                        "Module Name: Android Programming \n" +
                        "Academic Year: 2020 \n" +
                        "Semester: 1 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W66M");
                startActivity(intent);
            }
        });

        iPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Android.class);
                intent.putExtra("value", "Module Code: C349 \n" +
                        "Module Name: iPad Programming  \n" +
                        "Academic Year: 2020 \n" +
                        "Semester: 1 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W66R");
                startActivity(intent);
            }
        });
    }
}

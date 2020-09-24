package kr.hs.emirim.kang.myandlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourbutton2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button mbutton1;
    private Button mbutton2;
    private Button mbutton3;
    private Button mbutton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourbutton2);

        mbutton1 = findViewById(R.id.button);
        mbutton2 = findViewById(R.id.button3);
        mbutton3 = findViewById(R.id.button4);
        mbutton4 = findViewById(R.id.button5);


    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.e-mirim.hs.kr/"));
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01032080871"));
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
                break;
            case R.id.button5:
                finish();
                break;
        }
    }
}
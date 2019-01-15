package abircse.slidingdrawer.slidingdrawerdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button slideButton, b1, b2, b3;
    private TextView textView;
    private SlidingDrawer slidingDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideButton = findViewById(R.id.slideButton);
        slidingDrawer = findViewById(R.id.SlidingDrawer);
        b1 = findViewById(R.id.Button01);
        b2 = findViewById(R.id.Button02);
        b3 = findViewById(R.id.Button03);
        textView = findViewById(R.id.text);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        textView.setOnClickListener(this);

        slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {

                slideButton.setText("Close");
            }
        });

        slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {

                slideButton.setText("Open");
            }
        });


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.text) {
            Toast.makeText(MainActivity.this, textView.getText() + " Clicked",
                    Toast.LENGTH_SHORT).show();
        } else {
            Button b = (Button) v;
            Toast.makeText(MainActivity.this, b.getText() + " Clicked",
                    Toast.LENGTH_SHORT).show();
        }
    }
}

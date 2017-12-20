package ap.com.screenswitchtheanimation;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends BaseActivity {

    RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    private void init() {
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showActivity(TwoActivity.class);
            }
        });
    }
}

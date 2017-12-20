package ap.com.screenswitchtheanimation;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * 类描述：
 * 创建人：swallow.li
 * 创建时间：
 * Email: swallow.li@kemai.cn
 * 修改备注：
 */
public class TwoActivity extends BaseActivity {
    RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_two;
    }

    private void init() {
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
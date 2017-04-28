package shaolizhi.mvp_android_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class View extends AppCompatActivity implements ViewInterface {
    TextView textView;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        textView = (TextView) findViewById(R.id.text_view);

        presenter = new Presenter(this);
        presenter.makeHelloWorldInTextView();
    }

    @Override
    public void loadBeanToTextView(Bean bean) {
        textView.setText(bean.getString());
    }
}

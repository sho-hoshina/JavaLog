package jp.techacademy.shou.hoshina.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎", 18, "読書");
        human.say();
        human.think();

        Log.d("javatest", "ログへの出力テスト");
    }

}

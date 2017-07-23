package jp.techacademy.shou.hoshina.javalog;

/**
 * Created by kuro on 2017/07/23.
 */
import android.util.Log;

public class Human extends Animal implements Thinkable{
    private String hobby;

    public Human(String name, int age, String hobby)
    {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say()
    {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think()
    {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}

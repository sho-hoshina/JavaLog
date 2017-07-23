package jp.techacademy.shou.hoshina.javalog;

/**
 * Created by kuro on 2017/07/23.
 */

import android.util.Log;

public class BigDog extends Dog{
    //クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age)
    {
        super(name, age);
    }

    //クラス関数
    public static void introduce()
    {
        Log.d("javatest", "これは大型犬クラスです。");
    }

}

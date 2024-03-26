package ru.mirea.egerasimovich.multiactivity_new;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate_1()");
    }

    public void onClickNewActivity(View view) {
        EditText textinput = findViewById(R.id.editTextText);
        String textToSend = textinput.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", textToSend);
        startActivity(intent);
    }
    @Override
    protected void onStart() { // выполняет подготовку к выводу «activity» на экран
        super.onStart();

        Log.i(TAG, "onStart_1()");
    }

    @Override
    protected void onResume() { // "возобновленный", остается в данном состоянии пока не потеряет фокус(переключение на другое «activity» или выключение экрана устройства)
        super.onResume();

        Log.i(TAG, "onResume_1()");
    }

    @Override
    protected void onPause() { // снижение ресурсов при переходе на другую activity
        super.onPause();

        Log.i(TAG, "onPause_1()");
    }

    @Override
    protected void onStop() { // activity остается в памяти устройства и сохраняется состояние всех элементов интерфейса
        super.onStop();

        Log.i(TAG, "onStop_1()");
    }

    @Override
    protected void onDestroy() { // уничтожениe «activity»
        super.onDestroy();

        Log.i(TAG, "onDestroy_1()");
    }


    @Override
    protected void onRestart() { // когда окно возвращается в приоритетный режим после вызова «onStop»
        super.onRestart();

        Log.i(TAG, "onRestart_1()");
    }

}
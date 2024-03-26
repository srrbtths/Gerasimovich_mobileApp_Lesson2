package ru.mirea.egerasimovich.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText eText;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText = (EditText) findViewById(R.id.eText);
        eText.setText("onCreate()");

        Log.i(TAG, "onCreate()");

    }

    @Override
    protected void onStart() { // выполняет подготовку к выводу «activity» на экран
        super.onStart();

        eText.setText("onStart()");
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { // восстановлениe сохраненного состояния
        super.onRestoreInstanceState(savedInstanceState);

        eText.setText("onRestoreInstanceState()");
        Log.i(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) { // проведениe окончательной инициализации
        super.onPostCreate(savedInstanceState);

        eText.setText("onRestoreInstanceState()");
        Log.i(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onResume() { // "возобновленный", остается в данном состоянии пока не потеряет фокус(переключение на другое «activity» или выключение экрана устройства)
        super.onResume();

        eText.setText("onResume()");
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPostResume() { // проведениe окончательной инициализации после выполнения кода метода «onResume»
        super.onPostResume();

        eText.setText("onPostResume()");
        Log.i(TAG, "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() { // подключение к оконному менеджеру;
        super.onAttachedToWindow();

        eText.setText("onAttachedToWindow()");
        Log.i(TAG, "onAttachedToWindow()");
    }

    @Override
    protected void onPause() { // снижение ресурсов при переходе на другую activity
        super.onPause();

        eText.setText("onPause()");
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) { // после метода «onPause», но до вызова «onStop». сохранение состояния
        super.onSaveInstanceState(outState);

        eText.setText("onSaveInstanceState()");
        Log.i(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onStop() { // activity остается в памяти устройства и сохраняется состояние всех элементов интерфейса
        super.onStop();

        eText.setText("onStop()");
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() { // уничтожениe «activity»
        super.onDestroy();

        eText.setText("onDestroy()");
        Log.i(TAG, "onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() { // когда главное окно активности отключается от оконного менеджера
        super.onDetachedFromWindow();

        eText.setText("onDetachedFromWindow()");
        Log.i(TAG, "onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() { // когда окно возвращается в приоритетный режим после вызова «onStop»
        super.onRestart();

        eText.setText("onRestart()");
        Log.i(TAG, "onRestart()");
    }
}
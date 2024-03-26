package ru.mirea.egerasimovich.multiactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.egerasimovich.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;

    //String valueFromFirstActivity = getIntent().getStringExtra("key");

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });

        Log.i(TAG, "onCreate_2()");

        textView = findViewById(R.id.textView4);

        String valueFromFirstActivity = getIntent().getStringExtra("key");

        Log.i(TAG, valueFromFirstActivity);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onStart() { // выполняет подготовку к выводу «activity» на экран
        super.onStart();

        Log.i(TAG, "onStart_2()");
    }

    @Override
    protected void onResume() { // "возобновленный", остается в данном состоянии пока не потеряет фокус(переключение на другое «activity» или выключение экрана устройства)
        super.onResume();

        Log.i(TAG, "onResume_2()");
    }

    @Override
    protected void onPause() { // снижение ресурсов при переходе на другую activity
        super.onPause();

        Log.i(TAG, "onPause_2()");
    }

    @Override
    protected void onStop() { // activity остается в памяти устройства и сохраняется состояние всех элементов интерфейса
        super.onStop();

        Log.i(TAG, "onStop_2()");
    }

    @Override
    protected void onDestroy() { // уничтожениe «activity»
        super.onDestroy();

        Log.i(TAG, "onDestroy_2()");
    }

    @Override
    protected void onRestart() { // когда окно возвращается в приоритетный режим после вызова «onStop»
        super.onRestart();

        Log.i(TAG, "onRestart_2()");
    }
}
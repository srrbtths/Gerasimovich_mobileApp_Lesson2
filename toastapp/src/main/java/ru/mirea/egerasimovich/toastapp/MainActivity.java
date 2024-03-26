package ru.mirea.egerasimovich.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickCount(View view){
        EditText textinput = findViewById(R.id.editTextText);
        String text = textinput.getText().toString();

        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' ') count ++;
        }

        Toast toast = Toast.makeText(getApplicationContext(),
                "«СТУДЕНТ №8 ГРУППА БСБО-05-22 Количество символов - " + count,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
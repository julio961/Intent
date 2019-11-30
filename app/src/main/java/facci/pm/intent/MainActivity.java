package facci.pm.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para boton siguiente
    public void siguiente(View View){
        Intent siguiente = new Intent(this, Activity2.class);
        startActivity(siguiente);
    }
}

package org.m2i.tp4_menuandpickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.option_settings)
        {
            showSettings();
            return true;
        }else if (item.getItemId() == R.id.option_favorites){
            showFavorite();
            return true ;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void showFavorite() {
        Toast.makeText(this,"this is the favorite menu",Toast.LENGTH_LONG).show();
    }

    private void showSettings() {
        Toast.makeText(this,"this is the Settings menu",Toast.LENGTH_LONG).show();
    }
}
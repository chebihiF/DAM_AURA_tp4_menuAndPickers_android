package org.m2i.tp4_menuandpickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView hello_txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        hello_txt = findViewById(R.id.hello);
        registerForContextMenu(hello_txt);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.context_edit)
        {
            // processing ...
            Toast.makeText(this,"this is the edit menu", Toast.LENGTH_LONG).show();
            return true;
        }else if (item.getItemId() == R.id.context_share){
            // processing ...
            Toast.makeText(this,"this is the share menu", Toast.LENGTH_LONG).show();
            return true ;
        }else {
            return super.onOptionsItemSelected(item);
        }
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
package edu.neu.madcourse.luislopez;


import edu.neu.madcourse.luislopez.sudoku.Sudoku;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Luis Enrique Lopez");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void OnCreateErrorButtonClicked(View v) {
    	throw new RuntimeException("This intentional Error");
    }
    
    public void start_sudoku(View v){
    	
    Intent intent = new Intent(this,Sudoku.class);
    startActivity(intent);
    }
    
    public void onAboutMeButton(View v){
        Intent intent = new Intent(this,AboutMeActivity.class);
        startActivity(intent);	
    }
    
    public void exit(View v){
    	finish();
    }
}

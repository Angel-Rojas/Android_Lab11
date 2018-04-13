package com.example.student.angelsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        class myView extends View {
            private Paint paint;
            public myView(Context context) {
                super(context);
                init();
            }
            private void init() {
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                invalidate(); //causes a canvas draw
            }
            protected void onDraw(Canvas canvas) {
                paint.setColor(Color.rgb(255,255,0));
                paint.setStyle(Paint.Style.FILL);
                float x = getMeasuredWidth();
                float y = getMeasuredHeight() - 100;
                canvas.drawRect(0, 0, x, y, paint);
                paint.setColor(Color.BLACK);
                paint.setTextSize(100);
                canvas.drawText("3350 Lab-11", 0, 70, paint);
            }
        }


    public void sendMessage(View view) {
        //"hiii";
        myView v;
        v = new myView(this);
        setContentView(v);
    }

  /*  public class Thx implements Runnable {

        @Override
        public void run(){
            try {
                URL url = new URL("http://cs.csubak.edu/~you/3350/some-file.txt");
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                StringBuilder total = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    total.append(line + " ");
                }
                strxx = total.toString();
                in.close();
            } catch (MalformedURLException e) {
            } catch (IOException e) {
            }
            return;
        }
    }; */





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

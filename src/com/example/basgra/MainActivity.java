package com.example.basgra;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
	
	DemoView demo;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        demo = new DemoView(this);
		setContentView(demo);
    }

	private class DemoView extends View {
		public DemoView(Context mcontext) {
			super(mcontext);
		}
    
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
 
			Paint paint = new Paint();
			// custom drawing code here
			
			paint.setStyle(Paint.Style.FILL_AND_STROKE);
 
				//black background
			paint.setColor(Color.BLACK);
			canvas.drawPaint(paint);
 
				//moon
			paint.setAntiAlias(false);
			paint.setColor(Color.WHITE);
			canvas.drawCircle(30, 30, 50, paint);
 
			//moon
			paint.setAntiAlias(false);
			paint.setColor(Color.WHITE);
			canvas.drawCircle(30, 30, 50, paint);
			
			/*	// draw green circle with anti aliasing turned on
			paint.setAntiAlias(true);
			paint.setColor(Color.GRAY);
			canvas.drawCircle(60, 20, 15, paint); */
 
			// draw red rectangle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.BLUE);
			canvas.drawRect(0, 400, 500,320, paint);
 
			/*// draw the rotated text
			canvas.rotate(-40);
 
			paint.setStyle(Paint.Style.FILL);
			canvas.drawText("Graphics Rotation", 45, 185, paint);
 
			// undo the rotate
			canvas.restore();*/
		}
		
		
	}
    

}

package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
// added appCompatActivity("missing from original
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
//added missing libraries
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button myButton;
        myButton = (Button) findViewById( R.id.askButton ); //askbutton variable

     final ImageView eightBall = (ImageView) findViewById( R.id.image_eightBall );// imageview variable

        final int[] ballArray = new int[]{//ball array variable
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };



        myButton.setOnClickListener( new View.OnClickListener() {// tell button to listen for clicks

            @Override
            public void onClick(View view) {// the following gets executed when button pressed
                Log.d( "Magic Ball","Ask Button Pressed!" );//for debug log
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt( 5 );// make new number
                eightBall.setImageResource( ballArray[number] );// this pulls a resource from array




            }
        } );
    }
}
package com.small_factory.xoxo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
       public void playerTap(View view) { // Thandolwethu
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());

        // Reset the game if someone wins or if all spots taken
        if (!gameActive) {
            gameReset(view);
        }

        // if the tapped block
        if (gameState[tappedImage] == 2) {
            // increase the counter 
            // after every tap 
            counter++;

            // check if its the last box 
            if (counter == 9) {
                // reset the game 
                gameActive = false;
            }

            // mark this position 
            gameState[tappedImage] = activePlayer;

            //Make X and O images slide in smoothly
            img.setTranslationY(-1000f);

            //change player
            if (activePlayer == 0) {
                // set the image of x 
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
                TextView status = findViewById(R.id.status);

                // change the status 
                status.setText("O's Turn - Tap to play");
            } else {
                // bring in O image
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                TextView status = findViewById(R.id.status);

                // change status
                status.setText("X's Turn - Tap to play");
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }
        int flag = 0;
        // Check if any player has won 
        for (int[] winPosition : winPositions) {
            if (gameState[winPosition[0]] == gameState[winPosition[1]] &&
                    gameState[winPosition[1]] == gameState[winPosition[2]] &&
                    gameState[winPosition[0]] != 2) {
                flag = 1;

                // Check who won
                String winnerStr;

                //restart the game
                gameActive = false;
                if (gameState[winPosition[0]] == 0) {
                    winnerStr = "X has won";
                } else {
                    winnerStr = "O has won";
                }
                // Announce the winner using the bar
                TextView status = findViewById(R.id.status);
                status.setText(winnerStr);
            }
        }
        // set the status if the match draw 
        if (counter == 9 && flag == 0) {
            TextView status = findViewById(R.id.status);
            status.setText("Match Draw");
        }
    }
}

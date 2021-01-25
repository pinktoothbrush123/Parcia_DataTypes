package mcm.edu.ph.parcia_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);


        String firstName = "Jin Andrei";
        String middleInitial = "Y";
        String lastname = "Parcia";
        int myAge = 17;
        float myDreamTVLGrade = 99.9f;
        double myMoney = 45321;





        //String.valueOf(myMoney);
        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleInitial)+" "
        +lastname+ "\nand my age is "
        +myAge+ ".\nI want my grade in TVL3 to be "
        +String.valueOf(myDreamTVLGrade)
        +myMoney+ ".\nI want my money to be "+String.valueOf(myMoney));

        boolean amImMarried = false;
    }
}
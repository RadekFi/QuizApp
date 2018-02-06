package com.example.radek.canaryislandsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
//import android.widget.RadioGroup;


public
class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public
    void submitOrder(View view) {

        //Question 1
        RadioButton Radio11 = findViewById(R.id.radio_11);
        boolean rb11 = Radio11.isChecked();

        //Checks correct answer
        if (rb11) {
            correctAnswers++;
        }

        //Question 2
        RadioButton Radio23 = findViewById(R.id.radio_23);
        boolean rb23 = Radio23.isChecked();

        //Checks correct answer
        if (rb23) {
            correctAnswers++;
        }

        //Question 3
        CheckBox CheckBoxQ31 = findViewById(R.id.checkBox1);
        boolean ch31 = CheckBoxQ31.isChecked();

        CheckBox CheckBoxQ32 = findViewById(R.id.checkBox2);
        boolean ch32 = CheckBoxQ32.isChecked();

        CheckBox CheckBoxQ33 = findViewById(R.id.checkBox3);
        boolean ch33 = CheckBoxQ33.isChecked();

        //Checks correct answer
        if (ch31 && ch33 && !ch32) {
            correctAnswers++;
        }

        //Question 4
        EditText qField = findViewById(R.id.onPic);
        Editable answer = qField.getText();

        //Checks if a field is not empty
        if (answer.length() > 0) {
            int q4 = Integer.parseInt(answer.toString());

            //Checks correct answer
            if (q4 == 1) {
                correctAnswers++;
            }
        }

        //Question 5
        CheckBox CheckBoxQ51 = findViewById(R.id.checkBox51);
        boolean ch51 = CheckBoxQ51.isChecked();

        CheckBox CheckBoxQ52 = findViewById(R.id.checkBox52);
        boolean ch52 = CheckBoxQ52.isChecked();

        CheckBox CheckBoxQ53 = findViewById(R.id.checkBox53);
        boolean ch53 = CheckBoxQ53.isChecked();

        CheckBox CheckBoxQ54 = findViewById(R.id.checkBox54);
        boolean ch54 = CheckBoxQ54.isChecked();

        //Checks correct answer
        if (ch51 && ch52 && !ch53 && ch54) {
            correctAnswers++;
        }

        //Shows the result
        Toast.makeText(this, "Correct answers: " + correctAnswers + " of 5", Toast.LENGTH_SHORT).show();

        //Score reset
        correctAnswers = 0;
    }


}

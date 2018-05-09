package com.example.christophermilazzo.monapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private RadioGroup radioGroup;
    private RadioButton rbJaime;
    private RadioButton rbJaimePas;
    private EditText etAfficher;
    private ImageView ivImage;
    private Button btAnnuler;
    private Button btValider;
    private Button btSuivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }


    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2018-05-09 11:10:40 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rbJaime = (RadioButton) findViewById(R.id.rbJaime);
        rbJaimePas = (RadioButton) findViewById(R.id.rbJaimePas);
        etAfficher = (EditText) findViewById(R.id.etAfficher);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        btAnnuler = (Button) findViewById(R.id.btAnnuler);
        btValider = (Button) findViewById(R.id.btValider);
        btSuivant = (Button) findViewById(R.id.btSuivant);

        rbJaime.setOnClickListener(this);
        rbJaimePas.setOnClickListener(this);
        btAnnuler.setOnClickListener(this);
        btValider.setOnClickListener(this);
        btSuivant.setOnClickListener(this);

    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2018-05-09 11:10:40 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {

        if (v == btAnnuler) {
            // Handle clicks for btAnnuler
            radioGroup.clearCheck();
            etAfficher.setText("");
            ivImage.setImageResource(R.mipmap.ic_annuler);
        }
        else if (v == btValider) {
            // Handle clicks for btValider
            ivImage.setImageResource(R.mipmap.ic_valider);
            if (rbJaime.isChecked()) {
                etAfficher.setText("J'aime");
            }
            else if (rbJaimePas.isChecked()) {
                etAfficher.setText("Je n'aime pas");
            }
            else {
                etAfficher.setText("Aucun radio bouton selectionné");
            }
        }
        else if (v == btSuivant) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}



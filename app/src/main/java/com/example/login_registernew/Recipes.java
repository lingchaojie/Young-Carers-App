package com.example.login_registernew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        //imagebutton for home button
        final ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        //onclick listener for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, UserArea.class);
                startActivity(intent);
                finish();
            }
        });

        //imagebutton for information button
        final ImageButton informationButton = (ImageButton) findViewById(R.id.information);

        //on click listener to link button to information page
        informationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, RecipesInformation.class);
                startActivity(intent);
            }
        });

        //cooking tips button
        final Button cookingTips = (Button) findViewById(R.id.cookingTips);

        //onclick listener to open cooking tips pop up
        cookingTips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, cookingTips.class);
                startActivity(intent);
            }
        });

        //imagebuttons for all recipes
        final ImageButton soupButton = (ImageButton) findViewById(R.id.soup);
        final ImageButton stirfryButton = (ImageButton) findViewById(R.id.stirfry);
        final ImageButton vegetablesButton = (ImageButton) findViewById(R.id.vegetables);
        final ImageButton chickenButton = (ImageButton) findViewById(R.id.chicken);
        final ImageButton pastaButton = (ImageButton) findViewById(R.id.pasta);
        final ImageButton pizzaButton = (ImageButton) findViewById(R.id.pizza);
        final ImageButton stewButton = (ImageButton) findViewById(R.id.stew);
        final ImageButton curryButton = (ImageButton) findViewById(R.id.curry);
        final ImageButton potatoButton = (ImageButton) findViewById(R.id.potatoes);
        final ImageButton breadButton = (ImageButton) findViewById(R.id.bread);
        final ImageButton pieButton = (ImageButton) findViewById(R.id.pie);
        final ImageButton chipsButton = (ImageButton) findViewById(R.id.chips);

        //on click listeners to link buttons to recipe pop ups
        soupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, soupRecipe.class);
                startActivity(intent);
            }
        });

        stirfryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, stirfryRecipe.class);
                startActivity(intent);
            }
        });

        vegetablesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, vegetablesRecipe.class);
                startActivity(intent);
            }
        });

        chickenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, chickenRecipe.class);
                startActivity(intent);
            }
        });

        pastaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, pastaRecipe.class);
                startActivity(intent);
            }
        });

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, pizzaRecipe.class);
                startActivity(intent);
            }
        });

        stewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, stewRecipe.class);
                startActivity(intent);
            }
        });

        curryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, curryRecipe.class);
                startActivity(intent);
            }
        });

        potatoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, potatoRecipe.class);
                startActivity(intent);
            }
        });

        breadButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, breadRecipe.class);
                startActivity(intent);
            }
        });

        pieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, pieRecipe.class);
                startActivity(intent);
            }
        });

        chipsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recipes.this, chipsRecipe.class);
                startActivity(intent);
            }
        });


    }

}


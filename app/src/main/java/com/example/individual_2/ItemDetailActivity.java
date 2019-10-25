package com.example.individual_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {
    private ImageView itemImage;
    private TextView itemNameTextView;
    private TextView itemPriceTextView;
    private TextView itemDescriptionTextView;
    private Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        Intent intent = getIntent();

        int itemID = intent.getIntExtra("ItemID", 0);

        MenuItem item = FakeDatabase.getItemById(itemID);

        itemImage = findViewById(R.id.detailImage);
        itemNameTextView = findViewById(R.id.detailItemName);
        itemPriceTextView = findViewById(R.id.detailPrice);
        itemDescriptionTextView = findViewById(R.id.detailDesc);
        addButton = findViewById(R.id.detailAdd);

        itemNameTextView.setText(item.getItemName());
        String priceText = Double.toString(item.getItemPrice());
        itemPriceTextView.setText("$"+priceText);
        itemDescriptionTextView.setText(item.getItemDescripton());
        itemImage.setImageResource(item.getItemImageId());

        final HorizontalNumberPicker numberOrdered = findViewById(R.id.np_channel_nr);
        final int numOrdered = numberOrdered.getValue();
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Intent intent2 = new Intent(context, MyOrderActivity.class);
                intent2.putExtra("NumberOrdered", numOrdered);
                context.startActivity(intent2);
            }
        });


    }
}

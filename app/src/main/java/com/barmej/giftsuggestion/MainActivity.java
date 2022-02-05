package com.barmej.giftsuggestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView giftImageView;
    TextView giftText;
    private int mCurrentIndex = 0;
    private Random mRandom;
    private Gifts [] mGifts=new Gifts[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giftImageView = findViewById(R.id.image_gift);
        giftText=findViewById(R.id.gift_name);
        mRandom=new Random();

        Gifts gift1 = new Gifts();
        gift1.setName(R.string.roze);
        gift1.setPicture(R.drawable.gift_1);
        mGifts[0] = gift1;

        Gifts gift2 = new Gifts();
        gift2.setName(R.string.flower);
        gift2.setPicture(R.drawable.gift_2);
        mGifts[1] = gift2;

        Gifts gift3 = new Gifts();
        gift3.setName(R.string.cake);
        gift3.setPicture(R.drawable.gift_3);
        mGifts[2] = gift3;

        Gifts gift4 = new Gifts();
        gift4.setName(R.string.laptop);
        gift4.setPicture(R.drawable.gift_4);
        mGifts[3] = gift4;

        Gifts gift5 = new Gifts();
        gift5.setName(R.string.mobile);
        gift5.setPicture(R.drawable.gift_5);
        mGifts[4] = gift5;

        Gifts gift6 = new Gifts();
        gift6.setName(R.string.book);
        gift6.setPicture(R.drawable.gift_6);
        mGifts[5] = gift6;

        Gifts gift7 = new Gifts();
        gift7.setName(R.string.piece_cake);
        gift7.setPicture(R.drawable.gift_7);
        mGifts[6] = gift7;

        Gifts gift8 = new Gifts();
        gift8.setName(R.string.shirt);
        gift8.setPicture(R.drawable.gift_8);
        mGifts[7] = gift8;

        Gifts gift9 = new Gifts();
        gift9.setName(R.string.shoe);
        gift9.setPicture(R.drawable.gift_9);
        mGifts[8] = gift9;

        Gifts gift10 = new Gifts();
        gift10.setName(R.string.diamond);
        gift10.setPicture(R.drawable.gift_10);
        mGifts[9] = gift10;


    }

    public void display(View view) {
        if (mCurrentIndex < mGifts.length-1) {
            mCurrentIndex=mRandom.nextInt(mGifts.length-1);
            showGitf(); }
        else {
            // Toast.makeText(this,"لقد وصلت إلى نهاية الهدايا",Toast.LENGTH_SHORT).show();
            mCurrentIndex = -1;
        }

    }

    public void showGitf(){
        Gifts suggestion=mGifts[mCurrentIndex];
        Drawable giftDrawble= ContextCompat.getDrawable(this, suggestion.getPicture());
        giftImageView.setImageDrawable(giftDrawble);
        giftText.setText(suggestion.getName());
    }


    }



     // Toast.makeText(this,"تم النقر على الزر",Toast.LENGTH_SHORT).show(); حتى تطلع رسالة عالشاشة
    // Drawable giftDrawble= ContextCompat.getDrawable(this, mGifts[mCurrentIndex][0]); // حتى يعرض اكثر من صورة
   // Drawable giftDrawble= ContextCompat.getDrawable(this, R.drawable.gift_1);//حتى يعرض الصورة الثانية
  // Drawable giftDrawble1= ContextCompat.getDrawable(this, R.drawable.gift);
 // giftImageView.setImageDrawable(giftDrawble);
// giftText.setText(mGifts[mCurrentIndex][1]);


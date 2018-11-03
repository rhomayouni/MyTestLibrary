package com.sematech.rhomayouni.mylibrary;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;



public class MyEditText extends AppCompatEditText {
    public MyEditText(Context context) {
        super(context);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public String text(){
        return (this.getText() != null ? this.getText().toString() :"" );
    }

}

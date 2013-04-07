package com.example.mymoney;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText _txtValor;
	TextView _txtData;
	ImageButton _btnShop;
	
	boolean _state;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        _txtValor =(EditText)findViewById(R.id.txt_Valor);
        _txtData =(TextView)findViewById(R.id.txt_Data);
        //_btnShop = (ImageButton)findViewById(R.id.btn_Shop);
        _txtData.setText(new SimpleDateFormat("dd/MM/yyyy").format( new Date()));
        _state = false;
        _txtValor.addTextChangedListener(new TextWatcher() {
			
        	private String current = "";
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(!s.toString().equals(current)){
					_txtValor.removeTextChangedListener(this);

				       String cleanString = s.toString().replaceAll("[R$,.]", "");

				       double parsed = Double.parseDouble(cleanString);
				       String formated = NumberFormat.getCurrencyInstance().format((parsed/100));

				       current = formated;
				       _txtValor.setText(formated);
				       _txtValor.setSelection(formated.length());

				       _txtValor.addTextChangedListener(this);
				    }
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
    
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void changeState(View view) {
        
    	
    }
    
}

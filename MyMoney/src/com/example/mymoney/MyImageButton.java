package com.example.mymoney;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MyImageButton extends ImageButton {

	public boolean _isSelected;
	private int _image_on;
	private int _image_off;

	public MyImageButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub		
		Init();
	}

	public MyImageButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		Init(attrs);
	}

	public MyImageButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub        
		Init(attrs);
	}

	public void UpdateImage()
	{
		if(_isSelected)
			setImageResource(_image_on);
		else
			setImageResource(_image_off);
		_isSelected = !_isSelected;
	}

	private void Init()
	{
		Init(null);
	}
	
	private void Init(AttributeSet attrs)
	{
		TypedArray a = getContext().obtainStyledAttributes(
				attrs,
				R.styleable.MyImageButton);		
		try{
			_image_on = a.getResourceId(R.styleable.MyImageButton_image_on, 0);
			_image_off = a.getResourceId(R.styleable.MyImageButton_image_off, 0);
		}catch (Exception e) {
			System.out.println(e.toString());			
		}
		_isSelected = false;
		UpdateImage();
 		setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyImageButton btn = (MyImageButton) v;
				if(btn != null)
				{
					btn.UpdateImage();
				}
				return;    	

			}
		}); 

		a.recycle();
	}
	
	public int getSelectedImageResource() {
		return _image_on;
	}

	public void setSelectedImageResource(int _selectedID) {
		this._image_on = _selectedID;
	}


}

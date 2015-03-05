package com.example.testquiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
public class TestQuizActivity extends Activity {
	private Button btnSubmitQuiz;
	int score,ans1,ans2, ans3;
	@Override
	    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_quiz);
		RadioGroup champ=(RadioGroup)findViewById(R.id.answer1);
		champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId) {
					case R.id.answer1A:
					                                  ans1 =1;
					break;
					case R.id.answer1B:
					                                  ans1 =2;
					//score++; 
					break;
					case R.id.answer1C:
					                                  ans1 =3;
					break;
				}
			}
		});
		RadioGroup gBall=(RadioGroup)findViewById(R.id.answer2);
		gBall.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId) {
					case R.id.answer2A:
					                                  ans2 = 1;
					break;
					case R.id.answer2B:
					                                  ans2 = 2;
					break;
					case R.id.answer2C:
					                                  ans2 = 3;
					break;
				}
			}
		});
		RadioGroup gBoot = (RadioGroup)findViewById(R.id.answer3);
		gBoot.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId) {
					case R.id.answer3A:
					                                  ans3 = 1;
					break;
					case R.id.answer3B:
					                                  ans3 = 2;
					break;
					case R.id.answer3C:
					                                  ans3 =3;
					break;
				}
			}
		});
		btnSubmitQuiz = (Button) findViewById(R.id.submit);
		btnSubmitQuiz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				score =0;
				// TODO Auto-generated method stub
				if(ans1 == 2)
				                                  score++;
				if(ans2 == 3)
				                                  score++;
				if(ans3 == 1)
				                                  score++;
				Toast.makeText(TestQuizActivity.this, "Your score is:"+score+" out of 3", 5).show();
			}
		});
	}
	
}
package com.demo.geoquiz;

public class TrueFalse {
	private int mQuestion; //int because var will hold the resource ID(always int)
	private boolean mTrueQuestion; //to indicate true or false
	
	public TrueFalse(int question, boolean trueQuestion){ //Constructor
		mQuestion = question;
		mTrueQuestion = trueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}
}

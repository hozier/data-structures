package com.inquire;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/17/14.
 */
public class AnyCorrectChoiceQuestion extends ChoiceQuestion {
    public AnyCorrectChoiceQuestion(int c){
        super(c);
        masterlock = new ArrayList<String>();

    }

    public ArrayList<String> masterlock;


    @Override
    public void setAnswer(String answer) {
        if(getAnswer().equals("")){super.setAnswer(answer);}
        else super.setAnswer(String.format("%s %s",getAnswer(), answer));
    }
}

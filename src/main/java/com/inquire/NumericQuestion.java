package com.inquire;

/**
 * Created by MDCCLXXVI on 7/17/14.
 */
public class NumericQuestion extends Question {
    public NumericQuestion(){
        super();
        numeric_choice = 0;

    }

    public double numeric_choice;

//    private void matchAns(boolean isAns){ //sets answer key.
//        if(isAns){
//            setAnswer(String.valueOf(numeric_choice));
//        }
//
//    }
    private boolean accepted_response(double response){ //accepted answers.
        return (response >= Double.valueOf(getAnswer()) || response <=(0.01+Double.valueOf(getAnswer())));//{
    }


    @Override
    public boolean checkAns(String chosen){ //accepted answers.
        return accepted_response(Double.valueOf(chosen));
    }

    @Override
    public void setAnswer(String answer) {
        super.setAnswer(answer);
    }
}

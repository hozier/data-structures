package com.inquire;

/**
 * Created by MDCCLXXVI on 7/17/14.
 */
public class FillInQuestion extends Question{

    public FillInQuestion(){
        super();

    }

    @Override
    public void setTxt(String t){
        super.setTxt(String.format("%s __",t));
    }

    @Override
    public void setAnswer(String answer) {
        super.setAnswer(answer.toUpperCase());
    }

    @Override
    public boolean checkAns(String chosen) {
        return super.checkAns(chosen.toUpperCase());
    }

    @Override
    public String getAnswer(){
       return (String.format("%s%s__",getTxt(),super.getAnswer()));
    }
}

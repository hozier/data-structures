package com.inquire;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/15/14.
 */
public class Question {

    private String txt;
    private String answer;
    ArrayList<String> choiceArr;
    Question(){
        txt = "";
        answer = "";
        choiceArr = new ArrayList();
    }

    public void setTxt(String txt){
        this.txt = txt;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getTxt() {
        return txt;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean checkAns(String chosen){
        boolean ok = false;
        if(chosen.equals(answer)){
            ok = true;
        }
        return ok;
    }

    public void addText(String select){
        choiceArr.add(select);
    }

    public void saySomething(){
        System.out.println(txt);
    }

    @Override
    public String toString(){
        return String.format("%s[text=%s][answer=%s]",getClass().getName(), getTxt(), getAnswer());
    }



}

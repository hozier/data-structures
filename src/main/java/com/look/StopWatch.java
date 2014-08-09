package com.look;

/**
 * Created by MDCCLXXVI on 7/28/14.
 */
public class StopWatch {
    StopWatch(){
        reset();
    }

    private long startTime, elapsedTime;
    private boolean isRunning;

    public void reset(){
        elapsedTime = 0;
        isRunning = false;
    }

    public void start(){
        if(isRunning){
            return;
        }

        isRunning = true;

        startTime = System.currentTimeMillis();
    }

    public void stop(){
        if(!isRunning){return;}
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime +=  endTime - startTime;
    }

    public long getElapsedTime() {
        if(isRunning){
            long endTime = System.currentTimeMillis();
            elapsedTime +=  endTime - startTime;
        }

        return elapsedTime;
    }
}

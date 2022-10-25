package com.rahul;
class Clock{
    String time;

    void setTime(String t){
        time = t;
    }

    String getTime(){
        return time;
    }

}

class ClockTestDrive {
    static int r = 21053314;
    int n = 21053317;   //u can't use it unless u create its object
    public static void main(String[] args){
        ClockTestDrive object = new ClockTestDrive();
        System.out.println(object.n + " " + object.r);
        System.out.println(r);
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}

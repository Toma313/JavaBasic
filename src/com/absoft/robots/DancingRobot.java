package com.absoft.robots;

public abstract class DancingRobot {

        public String getDefaultDanceType(){
            return getDanceType1();
        }


        public abstract String getDanceType1();

        public abstract String getDanceType2();

    }


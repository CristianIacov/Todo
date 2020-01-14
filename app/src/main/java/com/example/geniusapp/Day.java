package com.example.geniusapp;
import java.util.*;

import com.example.geniusapp.Activities.*;
import com.example.geniusapp.Activities.Activity;

public class Day {
    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    private ArrayList<Activity> activities;

    public Day(ArrayList<Activity> activities){

        this.activities=activities;

    }
public void AddActivity(Activity a1){

        this.activities.add(a1);
}
}

/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.activitys.base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityStack {
    private static final ActivityStack INSTANCE = new ActivityStack();

    private List<Activity> activities = new ArrayList<>();

    public static ActivityStack getInstance() {
        return INSTANCE;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void finishActivity(Activity activity) {
        if (activity != null) {
            activities.remove(activity);
            activity.finish();
        }
    }
}

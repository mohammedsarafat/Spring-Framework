package com.nit.project03;

import java.util.Map;

public class RechargePlan {

    private Map<String, Integer> plans;

    public RechargePlan() {
    }

    public RechargePlan(Map<String, Integer> plans) {
        this.plans = plans;
    }

    public Map<String, Integer> getPlans() {
        return plans;
    }

    public void setPlans(Map<String, Integer> plans) {
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "RechargePlan [plans=" + plans + "]";
    }
}
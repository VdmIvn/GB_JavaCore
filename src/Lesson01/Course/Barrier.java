package Lesson01.Course;

import Lesson01.Team.TeamMember;

public abstract class Barrier {

    private final int barrierLvl;

    public Barrier(int barrierLvl) {
        this.barrierLvl = barrierLvl;
    }

    public int getBarrierLvl() {
        return barrierLvl;
    }

    public void startChallenge(TeamMember member) {
    }
}

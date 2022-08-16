package Lesson01.Course;

import Lesson01.Team.TeamMember;

public class Riding extends Barrier    {

    public Riding(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.ride(super.getBarrierLvl());
    }
}

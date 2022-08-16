package Lesson01.Course;

import Lesson01.Team.TeamMember;

public class Swimming extends Barrier {

    public Swimming(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.swim(super.getBarrierLvl());
    }
}

package Lesson01.Course;

import Lesson01.Team.TeamMember;

public class Running extends Barrier {

    public Running(int barrierLvl) {
        super(barrierLvl);
    }

    public void startChallenge(TeamMember member) {
        member.run(super.getBarrierLvl());
    }

}

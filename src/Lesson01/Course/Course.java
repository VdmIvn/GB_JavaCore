package Lesson01.Course;

import Lesson01.PassStatus;
import Lesson01.Team.Team;
import Lesson01.Team.TeamMember;


public class Course {
    private Barrier[] barriers;

    public Course(Barrier... barriers) {
        this.barriers = barriers;
    }
    
    public void doIt(Team team) {
        for (TeamMember member : team.getMembers()) {
            for (Barrier barrier : barriers) {
                barrier.startChallenge(member);
                if (member.getPassStatus() == PassStatus.NotPassed) {
                    break;
                }
            }
        }
    }
}

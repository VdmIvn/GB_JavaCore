package Lesson01;

import Lesson01.Course.Course;
import Lesson01.Course.Riding;
import Lesson01.Course.Running;
import Lesson01.Course.Swimming;
import Lesson01.Team.Team;
import Lesson01.Team.TeamMember;

public class Main {
    public static void main(String[] args) {
        Team newTeam= new Team("Team 1",
                new TeamMember("1st", 4),
                new TeamMember("2nd", 5),
                new TeamMember("3rd", 6),
                new TeamMember("4th" ,7));

        Course course = new Course(new Running(5), new Riding(6), new Swimming(7));
        course.doIt(newTeam);
    }
}

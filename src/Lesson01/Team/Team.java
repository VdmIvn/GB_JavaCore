package Lesson01.Team;

import Lesson01.PassStatus;

public class Team {

    private TeamMember[] members;
    private String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showResults() {

        System.out.println("Полосу препятствий преодолевала команда: " + name);
        for (TeamMember member : members) {
            if (member.getPassStatus() == PassStatus.NotPassed) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
    }

    private void showResultMemberNoPassed(TeamMember member) {
        System.out.println(member.getName() + " Не прошел полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        System.out.println(member.getName() + " Успешно прошел полосу препятствий");
    }
}

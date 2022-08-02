package Lesson01;

import java.lang.reflect.Member;

public class Team {

    private String teamName;
    private Members[] members;

    public Team(String teamName, Members... members) {
        this.teamName = teamName;
        this.members = members;
    }

    public Members[] getMembers() {
        return members;
    }
}

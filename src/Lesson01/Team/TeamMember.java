package Lesson01.Team;

import Lesson01.PassStatus;

public class TeamMember {

    private PassStatus passStatus = PassStatus.NotPassed;
    private final String name;
    private final int strength;

    public TeamMember(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public PassStatus getPassStatus() {
        return passStatus;
    }

    public String getName() {
        return name;
    }

    public void run(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            changeStatus(PassStatus.Passed, " passed the distance");
    }
        else {
            changeStatus(PassStatus.NotPassed, " didn't pass the distance");
    }
}

    public void swim(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            changeStatus(PassStatus.Passed, " passed swimming pool distance");
        }
        else {
            changeStatus(PassStatus.NotPassed, " didn't pass swimming pool distance");
        }
    }
    public void ride(int barrierDifficulty) {
        if (checkStrength(barrierDifficulty)) {
            changeStatus(PassStatus.Passed, " passed track distance");
        }
        else {
            changeStatus(PassStatus.NotPassed, " didn't pass track distance");
        }
    }

    private boolean checkStrength(int barrierDifficulty) {
        return strength > barrierDifficulty || strength == barrierDifficulty;
        }

    private void changeStatus(PassStatus newStatus, String message) {
        passStatus = newStatus;
        System.out.println(name + message);
    }
    }


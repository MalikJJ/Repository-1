package _5_4_abstract_classes;

import java.util.Arrays;

public class Teacher extends User {
    private String nickName;
    private String status; // Professor, Lecturer, Tutor, Assistant
    protected String subjects[] = new String[10];
    protected int sizeOfSubjects = 0;

    public Teacher() {
    }
    public Teacher(String login, String password, String nickName, String status) {
        super(login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public Teacher(String[] subjects, int sizeOfSubjects) {
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject(String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }
    public String filledSubjects() {
        String filledSubjects = "";
        for (int i = 0; i < sizeOfSubjects; i++) {
            filledSubjects = filledSubjects +
                    "\t" + (i + 1) + ") " +
                    subjects[i];
        }
        return filledSubjects;
    }
    @Override
    public String toString() {
        if (filledSubjects().equals("")) {
            return "Teacher, " + super.toString() +
                    ", nickName " + nickName +
                    ", status " + status +
                    "\n\t Subjects not added yet";
        }
        else return "Teacher, " + super.toString() +
                ", nickName " + nickName +
                ", status " + status +
                "\n\t subjects: \n\t" + filledSubjects();
    }
    @Override
    public String getUserData() {
        return toString();
    }
}

//------------------------------------------------------------------


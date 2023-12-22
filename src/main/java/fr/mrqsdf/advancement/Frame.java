package fr.mrqsdf.advancement;

public enum Frame {

    TASK("task"),
    GOAL("goal"),
    CHALLENGE("challenge");

    Frame(String frame) {
        this.frame = frame;
    }

    final String frame;

    public String getFrame() {
        return frame;
    }

}

package me.dhcha.designpatterns.singleton;

public class ReviewSettings {

    private ReviewSettings() {
    }

    private static class ReviewSettingsHolder {
        private static final ReviewSettings INSTNACE = new ReviewSettings();
    }

    public static ReviewSettings getInstance() {
        return ReviewSettingsHolder.INSTNACE;
    }

}

package model;

public enum FitExType {

    CARDIO(1, "Cardio"), POWER(2, "Power"), GAME(3, "Game"), STAMINA(4, "Stamina"), GENERAL (5, "General"), YOGA(6, "Yoga"), GYMNASTIC(7, "GYMNASTIC"), STRETCHING(8, "Stretching"), OTHER(9, "Other"),;

    FitExType(int id, String item) {
        this.id = id;
        this.item = item;
    }

    private int id;
    private String item;

}

package BaseJava.Lesson7.Sandbox.ResumeTest;

import java.time.LocalDate;

public class Experience {
    String place;
    LocalDate dateFrom;
    LocalDate dateTo;
    String duties;

    public Experience(String place, LocalDate dateFrom, LocalDate dateTo, String duties) {
        this.place = place;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.duties = duties;
    }

    public String getPlace() {
        return place;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public String getDuties() {
        return duties;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }
}

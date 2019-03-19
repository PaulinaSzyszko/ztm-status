package com.infoshareAcademy;

import org.openqa.selenium.By;

public class ZtmSelectors {

    //https://ztm.gda.pl/rozklady/linia-12.html
    //<a href="rozklad-012_20190218-4-2.html">Tetmajera</a>
    //

    private final By linia12Selector = By.name("linia_12");

    private final By tetmajeraStation = By.cssSelector("[href=\"rozklad-012_20190218-4-2.html\"]");

    private final By timetable= By.className("departures-set");

    public By getLinia12Selector() {
        return linia12Selector;
    }

    public By getTetmajeraStation() {
        return tetmajeraStation;
    }

    public By getTimetable() {
        return timetable;
    }
}

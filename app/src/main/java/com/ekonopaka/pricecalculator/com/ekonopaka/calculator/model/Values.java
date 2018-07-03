package com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model;

import java.util.List;

import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Component.Component;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.Antenna;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.Battery;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.ExtensionModule;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.Indication;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.Keyboard;
import static com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model.Device.MainDevice;
import static java.util.Arrays.asList;

public class Values {

    private Values() {
    }

    public static final List<Device> mainDevices = asList(
            MainDevice("Кронос моноблок", 105D),
            MainDevice("Кронос ОП-4", 240D),
            MainDevice("Кронос ОП-8 30Вт", 240D),
            MainDevice("Кронос ОП-8 50Вт", 250D),
            MainDevice("Кронос ОП-8 новый", 222D),
            MainDevice("Лунь-11", 160D));

    public static final List<Device> primaryKeyboards = asList(
            Keyboard("КЖ2", 46D),
            Keyboard("УПУ-А", 10D),
            Keyboard("РПУ44-ТМ", 30D),
            Keyboard("Линд-11", 29D),
            Keyboard("Линд-11 LCD", 80D));

    public static final List<Device> secondaryKeyboards = asList(
            Keyboard("Нет", 0D),
            Keyboard("КЖ2", 46D),
            Keyboard("УПУ-А", 10D),
            Keyboard("РПУ44-ТМ", 30D),
            Keyboard("Линд-11", 29D),
            Keyboard("Линд-11 LCD", 80D));

    public static final List<Device> batteries = asList(
            Battery("7Ah", 20D),
            Battery("17Ah", 65D));

    public static final List<Device> antennas = asList(
            Antenna("Штыревая", 0.01D),
            Antenna("Внешняя", 10D));

    public static final List<Device> extensionModules = asList(
            ExtensionModule("Нет", 0D),
            ExtensionModule("Внутренний", 19D));

    public static final List<Device> indicationModules = asList(
            Indication("Сирена", 24D),
            Indication("Светодиод", 1D));

    public static final Component sensorSwanQuad = Component("Датчик SWAN QUAD", 12D);
    public static final Component sensorSPR600 = Component("Датчик SPR-600", 15D);
    public static final Component sensorSWANPGB = Component("Датчик SWAN PGB", 25D);
    public static final Component sensorСОМКWhite = Component("Датчик СОМК белый", 5D);
    public static final Component sensorСОМКBrown = Component("Датчик СОМК коричневый", 6D);
    public static final Component sensorSmoke = Component("Датчик дыма", 10D);

    public static final Component cableFourWires = Component("Кабель 4 жилы", 0.2D);
    public static final Component cableTenWires = Component("Кабель 10 жил", 0.32D);
    public static final Component twistedPairOutside = Component("Витая пара наружная", 0.8D);
    public static final Component powerCord = Component("Сетевой кабель", 0.45D);

    public static final Component boxWhite = Component("Короб белый", 1.4D);
    public static final Component boxYellow = Component("Короб желтый", 1.4D);
    public static final Component boxBrown = Component("Короб коричневый", 1.4D);

    public static final Component clip = Component("Короб коричневый", 5D);
    public static final Component montageSet = Component("Монтажный комплект", 3D);
}

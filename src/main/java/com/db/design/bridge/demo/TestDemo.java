package com.db.design.bridge.demo;

public class TestDemo {
    public static void main(String[] args) {
        TelephoneBrand brand = new BrandA();
        CalculatorSoft calculatorSoft = new CalculatorSoft();
        GameSoft gameSoft = new GameSoft();
        CameraSoft cameraSoft = new CameraSoft();
        brand.setSoft(calculatorSoft);
        brand.setSoft(gameSoft);

        brand.run();

        TelephoneBrand brandB = new BrandB();
        brandB.setSoft(calculatorSoft);
        brandB.setSoft(gameSoft);
        brandB.setSoft(cameraSoft);

        brandB.run();
    }
}

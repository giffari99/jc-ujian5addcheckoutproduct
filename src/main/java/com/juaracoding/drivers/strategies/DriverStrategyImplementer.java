package com.juaracoding.drivers.strategies;

import com.juaracoding.utils.Constants;

public class DriverStrategyImplementer {

    public static DriverStrategy choseeStrategy(String strategy){
            switch (strategy){
                case Constants.CHROME:
                    return new Chrome();
                case Constants.FIREFOX:
                    return new FireFox();
                default:
                    return null;
            }

    }
}

package properties;

import driver.BrowserType;

public class TestRunProperties {

    public static boolean isRemoteRun() {
        return Boolean.parseBoolean(ConfigurationProperties.getProperties().getProperty("is.remote.run"));
    }

    public static BrowserType getBrowser() {
        return BrowserType.valueOf(ConfigurationProperties.getProperties().getProperty("browser"));
    }

    public static String getGridURL() {
        return ConfigurationProperties.getProperties().getProperty("grid.url");
    }
}

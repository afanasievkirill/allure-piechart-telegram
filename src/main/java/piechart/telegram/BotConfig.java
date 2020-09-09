package piechart.telegram;

import org.aeonbits.owner.Config;

public interface BotConfig extends Config {

    @Key("telegram.sonarServer")
    String sonarServer();

    @Key("telegram.capitenName")
    String capitenName();
}

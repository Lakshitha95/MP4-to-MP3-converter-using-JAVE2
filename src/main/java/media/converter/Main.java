package media.converter;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.OFF);

        mediaLab converterLab = new mediaLab();

        converter mp3Converter = converterLab.getConverter("MP3");

        mp3Converter.start();
    }
}






package media.converter;

import media.converter.encoder.mp3encoder;



public class mediaLab {
    public converter getConverter(String converterType){
        if(converterType == null){
            return null;
        }
        if(converterType.equalsIgnoreCase("MP3")){
            return new mp3encoder();
        }

        return null;
    }
}
package media.converter.encoder;


import media.converter.converter;
import ws.schild.jave.*;

import java.io.File;

public class mp3encoder extends converter {

    private int x = (int) (Math.random()*100);
    private String path="media/ToConvert/mp4TOmp3/test.mp4";
    private String destinationPath="media/Converted/mp4TOmp3-Converted/output"+x+".mp3";

    public mp3encoder(){}

    public mp3encoder(String path, String destinationPath){
        this.path = path;
        this.destinationPath = destinationPath;
    }

    @Override
    public void encode() {
        File video= new File(path);
        File target = new File(destinationPath);

        AudioAttributes audio = new AudioAttributes();

        audio.setCodec("libmp3lame");
        audio.setBitRate(28000);
        audio.setChannels(2);
        audio.setSamplingRate(44100);

        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);

        Encoder encoder = new Encoder();
        try {
            encoder.encode(new MultimediaObject(video), target, attrs);
        } catch (
                EncoderException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        encode();
    }

}

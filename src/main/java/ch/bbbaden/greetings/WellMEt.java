package ch.bbbaden.greetings;

import javax.swing.*;
import java.net.URL;

/**
 * Created by Baker on 19.11.2015.
 */
public class WellMet {

    public JLabel showGif(){

        URL url = WellMet.class.getResource("/pics/animated.gif");
        ImageIcon imageIcon = new ImageIcon(url);
        JLabel label = new JLabel(imageIcon);

        return label;
    }
}

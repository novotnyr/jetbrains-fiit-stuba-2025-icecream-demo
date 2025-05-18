package com.jetbrains.icecream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
    private final ImageIcon sadIcon = new ImageIcon(getClass().getResource("/sad-icecream.png"));
    private final ImageIcon happyIcon = new ImageIcon(getClass().getResource("/happy-icecream.png"));

    private final JLabel label = new JLabel(sadIcon);

    private final OpenMeteoService openMeteoService = new OpenMeteoService();

    public Gui() {
        super("Čas na zmrzlinu?");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(label);

        setVisible(true);

        refresh();
    }

    public void refresh() {
        var weather = openMeteoService.getCurrent();
        if (weather.current.temperature_2m > 15 && weather.current.wind_speed_10m < 10) {
            label.setIcon(happyIcon);
        }
    }
}

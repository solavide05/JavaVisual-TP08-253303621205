
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private final JPanel mainPanel;
    private final ArrayList<Character> characterList;
    private final double averageLevel;

    public MainWindow(ArrayList<Character> characterList,
                      double averageLevel) {

        super("Character Manager v0.3");

        if (characterList == null) {
            throw new IllegalArgumentException(
                "Daftar karakter tidak boleh null"
            );
        }

        this.characterList = new ArrayList<>(characterList);
        this.averageLevel = averageLevel;

        mainPanel = new JPanel();

        initComponents();

        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        mainPanel.setLayout(
            new BoxLayout(mainPanel, BoxLayout.Y_AXIS)
        );

        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        mainPanel.setBackground(Color.WHITE);

        // Judul aplikasi
        JLabel titleLabel = new JLabel(
            "=== Daftar Karakter (" + characterList.size() + ") ==="
        );

        titleLabel.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        mainPanel.add(titleLabel);

        // Menampilkan karakter menggunakan perulangan
        for (Character c : characterList) {

            String info = c.getName()
                    + " | " + c.getType()
                    + " | Lv." + c.getLevel()
                    + " | HP: " + c.getHitPoints()
                    + " | ATK: " + c.getAttackPower();

            JLabel characterLabel = new JLabel(info);

            characterLabel.setFont(
                new Font("Arial", Font.PLAIN, 13)
            );

            mainPanel.add(characterLabel);
        }

        // Statistik rata-rata level
        JLabel averageLabel = new JLabel(
            String.format(
                "Rata-rata Level: %.2f",
                averageLevel
            )
        );

        averageLabel.setFont(
            new Font("Arial", Font.BOLD, 15)
        );

        averageLabel.setForeground(
            new Color(0, 100, 0)
        );

        mainPanel.add(averageLabel);

        // Memasukkan panel ke jendela
        add(mainPanel);
    }
}

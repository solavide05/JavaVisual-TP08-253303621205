
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

    private final JPanel mainPanel;
    private final ArrayList<Character> characterList;
    private final double averageLevel;

    public MainWindow(ArrayList<Character> characterList,
                      double averageLevel) {

        super("Character Manager v0.4");

        if (characterList == null) {
            throw new IllegalArgumentException(
                "Daftar karakter tidak boleh null"
            );
        }

        this.characterList = new ArrayList<>(characterList);
        this.averageLevel = averageLevel;

        mainPanel = new JPanel();

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(550, 400));
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        mainPanel.setLayout(
            new BoxLayout(mainPanel, BoxLayout.Y_AXIS)
        );

        mainPanel.setBorder(AppTheme.CARD_BORDER);
        mainPanel.setBackground(AppTheme.BG_MAIN);
        mainPanel.setOpaque(true);

        // JUDUL
        JLabel titleLabel = new JLabel(
            "DAFTAR KARAKTER (" + characterList.size() + ")"
        );

        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.TEXT_WHITE);
        titleLabel.setAlignmentX(LEFT_ALIGNMENT);

        mainPanel.add(titleLabel);

        // MENAMPILKAN KARTU KARAKTER
        for (Character c : characterList) {

            JPanel card = new JPanel();

            card.setLayout(
                new BoxLayout(card, BoxLayout.Y_AXIS)
            );

            card.setBackground(
                AppTheme.colorFor(c.getType())
            );

            card.setBorder(AppTheme.CARD_BORDER);
            card.setOpaque(true);

            // Properti tambahan 1: tooltip
            card.setToolTipText(
                "Karakter " + c.getName()
                + " dengan role " + c.getType()
            );

            String info = c.getName()
                    + " | " + c.getType()
                    + " | Lv." + c.getLevel()
                    + " | HP: " + c.getHitPoints()
                    + " | ATK: " + c.getAttackPower();

            JLabel characterLabel = new JLabel(info);

            // Properti tambahan 2: perataan tulisan
            characterLabel.setHorizontalAlignment(
                SwingConstants.LEFT
            );

            // Level minimal 5 menggunakan warna emas
            if (c.getLevel() >= AppTheme.HIGH_LEVEL_THRESHOLD) {

                characterLabel.setForeground(AppTheme.GOLD);

                characterLabel.setFont(
                    AppTheme.FONT_TITLE.deriveFont(14f)
                );

            } else {

                characterLabel.setForeground(AppTheme.TEXT_WHITE);
                characterLabel.setFont(AppTheme.FONT_BODY);
            }

            card.add(characterLabel);

            mainPanel.add(card);
        }

        // RATA-RATA LEVEL
        JLabel averageLabel = new JLabel(
            String.format(
                "Rata-rata Level: %.2f",
                averageLevel
            )
        );

        averageLabel.setFont(AppTheme.FONT_TITLE.deriveFont(16f));
        averageLabel.setForeground(AppTheme.GOLD);
        averageLabel.setAlignmentX(LEFT_ALIGNMENT);

        mainPanel.add(averageLabel);

        add(mainPanel);
    }
}

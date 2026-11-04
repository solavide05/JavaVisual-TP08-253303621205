package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.CharacterType;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    // WARNA APLIKASI
    public static final Color BG_MAIN = Color.decode("#13131f");
    public static final Color BG_CARD = Color.decode("#1e1e30");
    public static final Color TEXT_MAIN = Color.decode("#dfe6e9");
    public static final Color TEXT_WHITE = Color.WHITE;
    public static final Color GOLD = Color.decode("#f1c40f");

    // FONT APLIKASI
    public static final Font FONT_TITLE =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font FONT_BODY =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 13);

    // BORDER APLIKASI
    public static final Border CARD_BORDER =
            BorderFactory.createEmptyBorder(10, 12, 10, 12);

    // BATAS LEVEL TINGGI
    public static final int HIGH_LEVEL_THRESHOLD = 5;

    // Constructor private
    private AppTheme() {
    }

    // WARNA BERDASARKAN ROLE KARAKTER
    public static Color colorFor(CharacterType type) {

        return switch (type) {
            case WARRIOR -> Color.decode("#d63031");
            case MAGE -> Color.decode("#0984e3");
            case ARCHER -> Color.decode("#00b894");
            case HEALER -> Color.decode("#6c5ce7");
        };
    }
}
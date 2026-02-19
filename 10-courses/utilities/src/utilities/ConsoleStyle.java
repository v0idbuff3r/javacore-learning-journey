package utilities;

public final class ConsoleStyle {
   // ---- ANSI codes (colores) ----
   //Reset
    public static final String RESET = "\u001B[0m";

    // Foreground - normal (8)
    public static final String BLACK   = "\u001B[30m";
    public static final String RED     = "\u001B[31m";
    public static final String GREEN   = "\u001B[32m";
    public static final String YELLOW  = "\u001B[33m";
    public static final String BLUE    = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN    = "\u001B[36m";
    public static final String WHITE   = "\u001B[37m";

    // Foreground - bright (8)
    public static final String BRIGHT_BLACK   = "\u001B[90m"; // gray
    public static final String BRIGHT_RED     = "\u001B[91m";
    public static final String BRIGHT_GREEN   = "\u001B[92m";
    public static final String BRIGHT_YELLOW  = "\u001B[93m";
    public static final String BRIGHT_BLUE    = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN    = "\u001B[96m";
    public static final String BRIGHT_WHITE   = "\u001B[97m";

    // Background - normal (opcional)
    public static final String BG_BLACK   = "\u001B[40m";
    public static final String BG_RED     = "\u001B[41m";
    public static final String BG_GREEN   = "\u001B[42m";
    public static final String BG_YELLOW  = "\u001B[43m";
    public static final String BG_BLUE    = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN    = "\u001B[46m";
    public static final String BG_WHITE   = "\u001B[47m";

    // Background - bright (opcional)
    public static final String BG_BRIGHT_BLACK   = "\u001B[100m";
    public static final String BG_BRIGHT_RED     = "\u001B[101m";
    public static final String BG_BRIGHT_GREEN   = "\u001B[102m";
    public static final String BG_BRIGHT_YELLOW  = "\u001B[103m";
    public static final String BG_BRIGHT_BLUE    = "\u001B[104m";
    public static final String BG_BRIGHT_MAGENTA = "\u001B[105m";
    public static final String BG_BRIGHT_CYAN    = "\u001B[106m";
    public static final String BG_BRIGHT_WHITE   = "\u001B[107m";

    // ----- Nerd Icons (si la font soporta) -----
    public static final String ICON_ERROR = "\uEA87";
    public static final String ICON_WARN = "\uEA6C";
    public static final String ICON_INFO = "\uDB81\uDE4E";
    public static final String ICON_OK = "\uEBB1";

    // --- Unicode fallback (muy común) ---
    private static final String FALLBACK_ERROR = "✖";
    private static final String FALLBACK_WARN  = "⚠";
    private static final String FALLBACK_INFO  = "ℹ";
    private static final String FALLBACK_OK    = "✔";

    // --- Feature flag (default ON). Precedence: System property > env var ---
    private static final boolean ICONS_ENABLED = resolveIconsEnabled();

    // Evita que esta clase pueda ser instanciada
   private  ConsoleStyle() {}

    private static boolean resolveIconsEnabled() {
        String prop = System.getProperty("console.icons");
        if (prop != null) return !isFalsey(prop);

        String env = System.getenv("CONSOLE_ICONS");
        if (env != null) return !isFalsey(env);

        return true; // default ON
    }

    private static boolean isFalsey(String value) {
        String v = value.trim().toLowerCase();
        return v.equals("0") || v.equals("false") || v.equals("no") || v.equals("off");
    }

    private static String icon(String nerd, String fallback) {
        return ICONS_ENABLED ? nerd : fallback;
    }

    // Armar "[LABEL] message" con color
   private static String tagged(String color, String label, String message) {
       return color + label + message + RESET;
   }

   public static String colorise(String color, String message) {
       return color + message + RESET;
   }

   public static String error(String message) {
       String prefix = icon(ICON_ERROR, FALLBACK_ERROR) + "[ERROR] ";
       return tagged(BRIGHT_RED, prefix, message);
   }

   public static String warn(String message) {
       String prefix = icon(ICON_WARN, FALLBACK_WARN) + "[WARN] ";
       return tagged(BRIGHT_YELLOW, prefix, message);
   }

   public static String info(String message) {
       String prefix = icon(ICON_INFO, FALLBACK_INFO) + "[INFO] ";
       return tagged(BRIGHT_BLUE, prefix, message);
   }

   public static String ok(String message) {
       String prefix = icon(ICON_OK, FALLBACK_OK) + "[OK]";
       return tagged(BRIGHT_GREEN, prefix, message);
   }

   public static String getBrightGreen(String message) {
       return tagged(BRIGHT_GREEN, "", message);
   }

   public static String getMagenta(String message) {
       return tagged(MAGENTA, "", message);
   }

   public static String getBrightMagenta(String message) {
       return tagged(BRIGHT_MAGENTA, "", message);
   }

    public static String getBrightBlue(String message) {
        return tagged(BRIGHT_BLUE, "", message);
    }

    public static String getBrightCyan(String message) {
        return tagged(BRIGHT_CYAN, "", message);
    }

    public static String getYellow(String message) {
        return tagged(YELLOW, "", message);
    }

    public static String getBrightYellow(String message) {
        return tagged(BRIGHT_YELLOW, "", message);
    }

    // Paleta (16 FG + 16 BG)
    public static void printPalette() {
        String[] fgNames = {
                "BLACK(30)", "RED(31)", "GREEN(32)", "YELLOW(33)",
                "BLUE(34)", "MAGENTA(35)", "CYAN(36)", "WHITE(37)",
                "BRIGHT_BLACK(90)", "BRIGHT_RED(91)", "BRIGHT_GREEN(92)", "BRIGHT_YELLOW(93)",
                "BRIGHT_BLUE(94)", "BRIGHT_MAGENTA(95)", "BRIGHT_CYAN(96)", "BRIGHT_WHITE(97)"
        };

        String[] fgCodes = {
                BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE,
                BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW,
                BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, BRIGHT_WHITE
        };

        String[] bgNames = {
                "BG_BLACK(40)", "BG_RED(41)", "BG_GREEN(42)", "BG_YELLOW(43)",
                "BG_BLUE(44)", "BG_MAGENTA(45)", "BG_CYAN(46)", "BG_WHITE(47)",
                "BG_BRIGHT_BLACK(100)", "BG_BRIGHT_RED(101)", "BG_BRIGHT_GREEN(102)", "BG_BRIGHT_YELLOW(103)",
                "BG_BRIGHT_BLUE(104)", "BG_BRIGHT_MAGENTA(105)", "BG_BRIGHT_CYAN(106)", "BG_BRIGHT_WHITE(107)"
        };

        String[] bgCodes = {
                BG_BLACK, BG_RED, BG_GREEN, BG_YELLOW, BG_BLUE, BG_MAGENTA, BG_CYAN, BG_WHITE,
                BG_BRIGHT_BLACK, BG_BRIGHT_RED, BG_BRIGHT_GREEN, BG_BRIGHT_YELLOW,
                BG_BRIGHT_BLUE, BG_BRIGHT_MAGENTA, BG_BRIGHT_CYAN, BG_BRIGHT_WHITE
        };

        System.out.println("\n=== ANSI 16 Foreground Colors ===");
        for (int i = 0; i < fgCodes.length; i++) {
            System.out.printf("%-24s %s%s%s%n", fgNames[i], fgCodes[i], "The quick brown fox 123", RESET);
        }

        System.out.println("\n=== ANSI 16 Background Colors ===");
        for (int i = 0; i < bgCodes.length; i++) {
            String textColor = contrastTextForBgIndex(i);
            System.out.printf("%-24s %s%s%s%s%n", bgNames[i], bgCodes[i], textColor, " The quick brown fox 123 ", RESET);
        }

        System.out.println();
    }

    // Elegir color de texto con contraste para cada BG
    private static String contrastTextForBgIndex(int i) {
        // Fondos oscuros -> texto claro
        switch (i) {
            case 0:  // BG_BLACK
            case 1:  // BG_RED
            case 2:  // BG_GREEN
            case 4:  // BG_BLUE
            case 5:  // BG_MAGENTA
            case 8:  // BG_BRIGHT_BLACK
            case 9:  // BG_BRIGHT_RED
            case 10: // BG_BRIGHT_GREEN
            case 12: // BG_BRIGHT_BLUE
            case 13: // BG_BRIGHT_MAGENTA
                return BRIGHT_WHITE;
            default:
                // Fondos claros -> texto oscuro
                return BLACK;
        }
    }
}

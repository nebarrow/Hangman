public enum Scaffold {
    STICK {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |\n" +
                    "        |\n" +
                    "        |\n" +
                    "        |\n";
        }
    },
    HEAD {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |\n" +
                    "        |\n" +
                    "        |\n";
        }
    },
    BODY {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |   |\n" +
                    "        |\n" +
                    "        |\n";
        }
    },
    FIRST_HAND {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |  /|\n" +
                    "        |\n" +
                    "        |\n";
        }
    },
    SECOND_HAND {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |  /|\\\n" +
                    "        |\n" +
                    "        |\n";
        }
    },
    FIRST_LEG {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |  /|\\\n" +
                    "        |  /\n" +
                    "        |\n";
        }
    },
    FULL_BODY {
        @Override
        public String toString() {
            return "        | - |\n" +
                    "        |   |\n" +
                    "        |   О\n" +
                    "        |  /|\\\n" +
                    "        |  / \\\n" +
                    "        |\n";
        }
    }
}


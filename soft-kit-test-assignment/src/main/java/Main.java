import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = List.of("aaaa", "bbb", "ccc", "ddd", "eee");
        createTable(strings, 3);
    }

    public static void createTable(List<String> strings, int columnCount) {
        if (columnCount < 1) {
            throw new IllegalArgumentException("Column count should be higher than 0");
        }
        int lengthOfColumn = findMaxLengthOfColumn(strings);

        printTable(strings, columnCount, lengthOfColumn);
    }

    private static void printTable(List<String> strings, int columnCount, int lengthOfColumn) {
        for (int i = 0; i < strings.size(); i++) {
            if (i % columnCount == 0) {
                System.out.println();
            }
            System.out.printf("%-" + lengthOfColumn + "s", strings.get(i));
        }
    }

    private static int findMaxLengthOfColumn(List<String> strings) {
        int lengthOfColumn = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            int currentStringLength = strings.get(i).length();
            if (currentStringLength > lengthOfColumn) {
                lengthOfColumn = currentStringLength;
            }
        }
        return lengthOfColumn + 5;
    }
}

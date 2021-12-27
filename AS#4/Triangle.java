public class Triangle extends Shape {

    public Triangle() {
        color = "\033[0;31m";
        lines.add("  $  ");
        lines.add(" *** ");
        lines.add(" $ $ ");
        lines.add("* * *");
        lines.add("$$$$$");

    }

    @Override
    public void draw() {
        for (String line: lines) {
            System.out.println(line);
        }
    }

    @Override
    public void drawStage(int index) {
        if (index > lines.size()) {
            System.out.print("     ");
        } else {
            System.out.print(color+lines.get(index)+RESET);
        }

    }
}

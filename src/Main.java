public class Main {
    public static void main(String[] args) {


        FieldFormer fieldGenerator = new FieldFormer(7, 7);
        int[][] field = fieldGenerator.generate();

        Game game = new Game(field, fieldGenerator.getWidth(), fieldGenerator.getLength());
        game.start();

        FieldViewer fieldPrinter = new FieldViewer(fieldGenerator.getLength());
        fieldPrinter.displayingField(field);

    }
}
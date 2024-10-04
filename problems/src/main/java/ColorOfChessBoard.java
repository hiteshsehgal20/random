public class ColorOfChessBoard {
    public boolean getColorOfSquare(String coordinate) {
        return (coordinate.charAt(0) - 'a') % 2 == (coordinate.charAt(1) - '0') % 2;
    }

    public static void main(String[] args) {
        ColorOfChessBoard colorOfChessBoard = new ColorOfChessBoard();
        System.out.println(colorOfChessBoard.getColorOfSquare("h8"));
    }
}

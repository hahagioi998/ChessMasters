import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ApplicationWindow extends JPanel {

  private static final long serialVersionUID = 1L;
  private final int tileSide = 50;

  @Override
  public void paint(Graphics g) {
    MouseHandler mouseHandler = new MouseHandler();
    // g.setColor(Color.CYAN);
    // g.fillRect(10, 10, 100, 100);
    addMouseListener(mouseHandler);
    for (int row = 0; row < 10; row++) {
      for (int col = 0; col < 10; col++) {

        render(g, row, col);
      }
    }
    try {
      renderAllFigures(g);
    } catch (IOException e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void renderAllFigures(Graphics g) throws IOException {
    int placeToPutFigure = 0;
    for (int col = 0; col < 10; col++) {
      renderFigure(
          "white-and-black-in-chess-pawn-rook-bishop-chess-thumbnail.jpg", g, placeToPutFigure, 50);
      renderFigure("blackFigure.png", g, placeToPutFigure, 400);

      placeToPutFigure += 50;
    }
    renderFigure("blackRook.jpg", g, 450, 450);
    renderFigure("blackRook.jpg", g, 0, 450);
    renderFigure("whiteRook.jpg", g, 0, 0);
    renderFigure("whiteRook.jpg", g, 450, 0);
    renderFigure("whiteKnight.png", g, 400, 0);
    renderFigure("whiteKnight.png", g, 50, 0);
    renderFigure("blackKnight.jpg", g, 400, 450);
    renderFigure("blackKnight.jpg", g, 50, 450);
    renderFigure("whiteBishop.jpg", g, 350, 0);
    renderFigure("whiteBishop.jpg", g, 100, 0);
    renderFigure("blackBishop.jpg", g, 100, 450);
    renderFigure("blackBishop.jpg", g, 350, 450);
    renderFigure("stormTroopers.jpg", g, 300, 0);
    renderFigure("stormTroopers.jpg", g, 150, 0);
    renderFigure("blackChew.jpg", g, 300, 450);
    renderFigure("blackChew.jpg", g, 150, 450);
    renderFigure("blackQueen.png", g, 250, 450);
    renderFigure("whiteQueen.jpg", g, 200, 0);
    renderFigure("whiteKing.jpg", g, 250, 0);
    renderFigure("blackKing.jpg", g, 200, 450);
  }

  private void renderFigure(String filePath, Graphics g, Integer row, Integer col)
      throws IOException {
    BufferedImage img = ImageIO.read(new File(filePath));
    Image scaledImage = img.getScaledInstance(50, 50, 3);
    repaint();
    g.drawImage(scaledImage, row, col, null);
  }

  private void render(Graphics g, int row, int col) {

    boolean isRowEven = (row % 2 == 0);
    boolean isColEven = (col % 2 == 0);

    boolean isTileWhite = (isRowEven && isColEven) || (!isRowEven && !isColEven);

    Color tileColor = (isTileWhite) ? Color.WHITE : Color.BLACK;

    int tileX = col * tileSide;
    int tileY = row * tileSide;

    g.setColor(tileColor);
    g.fillRect(tileX, tileY, tileSide, tileSide);
  }
}

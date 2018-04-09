package service;

import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ASCIIBannerServiceTest {

    @Test
    public void drawBanner() {
        int width = 80;
        int height = 27;
        //BufferedImage image = ImageIO.read(new File("../banner-logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 16));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("J♥WL", 8, 18);
        //save image
        //ImageIO.write(image, "png", new File("/users/iarayel/ascii-banner.png"));
        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(sb);
        }
    }
}
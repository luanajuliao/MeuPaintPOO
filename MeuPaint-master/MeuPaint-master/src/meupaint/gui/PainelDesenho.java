/*
 * Copyright (C) 2023 Prof. Dr. David Buzatto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package meupaint.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;

/**
 * Painel de desenho de formas geométricas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelDesenho extends JPanel {

    private FormaGeometrica formaTemporaria;
    private List<FormaGeometrica> formas;
    
    public PainelDesenho() {
        formas = new ArrayList<>();
    }
    
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );
        
        g2d.setColor( Color.WHITE );
        g2d.fillRect( 0, 0, getWidth(), getHeight() );
        
        g2d.setColor( Color.BLACK );
        
        for ( FormaGeometrica forma : formas ) {
            forma.desenhar( g2d );
        }
        
        if ( formaTemporaria != null ) {
            formaTemporaria.desenhar( g2d );
        }

    
        g2d.drawRect( 0, 0, getWidth()-1, getHeight()-1 );
        g2d.dispose();
        
    }

    public void adicionarForma( FormaGeometrica forma ) {
        formas.add( forma );
    }

    public void setFormaTemporaria( FormaGeometrica formaTemporaria ) {
        this.formaTemporaria = formaTemporaria;
    }
    
}

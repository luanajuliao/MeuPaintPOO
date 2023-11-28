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

import java.awt.Graphics2D;

/**
 * Uma Linha.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Linha extends FormaGeometrica {
    
    @Override
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        if ( corContorno != null ) {
            g2d.setColor( corContorno );
            g2d.drawLine( xIni, yIni, xFim, yFim );
        }
        
        g2d.dispose();
    }
    
}

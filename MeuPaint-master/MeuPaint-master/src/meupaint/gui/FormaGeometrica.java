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
import java.awt.Graphics2D;

/**
 * Uma Forma Geométrica genérica.
 * 
 * @author Prof. Dr. David Buzatto
 */
public abstract class FormaGeometrica {
    
    protected int xIni;
    protected int yIni;
    protected int xFim;
    protected int yFim;
    protected Color corContorno;
    protected Color corPreenchimento;
    
    public FormaGeometrica() {
        corContorno = Color.BLACK;
        corPreenchimento = Color.WHITE;
    }

    public abstract void desenhar( Graphics2D g2d );
    
    public int getxIni() {
        return xIni;
    }

    public void setxIni( int xIni ) {
        this.xIni = xIni;
    }

    public int getyIni() {
        return yIni;
    }

    public void setyIni( int yIni ) {
        this.yIni = yIni;
    }

    public int getxFim() {
        return xFim;
    }

    public void setxFim( int xFim ) {
        this.xFim = xFim;
    }

    public int getyFim() {
        return yFim;
    }

    public void setyFim( int yFim ) {
        this.yFim = yFim;
    }

    public Color getCorContorno() {
        return corContorno;
    }

    public void setCorContorno( Color corContorno ) {
        this.corContorno = corContorno;
    }

    public Color getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento( Color corPreenchimento ) {
        this.corPreenchimento = corPreenchimento;
    }
    
}

/*
 * Bicycle.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package triangle;

/**
 * Modelizes a triangle.
 * 
 * A bicycle has a model, rear and front sprockets that may be changed if the bicycle is moving and can be accelerated
 * or braked. The minimum rear and front sprockets have number 1. The second rear and front sprockets have number 2 and
 * so on.
 */
public class triangle {
    
    /** costa 1 del triangle */
    private double costat1;
    /** costa 2 del triangle */
    private double costat2;
    /** costa 3 del triangle */
    private double costat3;
    
    /** CONTSTRUCTOR del triangle per defecte */
    
    public triangle() {
        this.costat1 = 3;
        this.costat2 = 4;
        this.costat3 = 5;
    }
    
    /** CONTSTRUCTOR amb tots els paràmetres corresponents als atributs del trinagle  */
    
    public triangle(double costat1, double costat2, double costat3) {
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.costat3 = costat3;        
    }
    
     /** METODE PERIMETRE */
    
    public double perimetre() {
        double perimetre = 0.0;
        perimetre = this.costat1 + this.costat2 + this.costat3;
            return perimetre;
    }
    
    /** METODE AREA */
    /*
     *@param s, semiperimetre 
     *
     */
    
    public double area() {
        
        double s, area;
        
        s = ( this.costat1 + this.costat2 + this.costat3 ) / 2 ;
        area = Math.sqrt(s * (s - this.costat1) * (s - this.costat2) * (s- this.costat3));
            return area;  
    }  
}
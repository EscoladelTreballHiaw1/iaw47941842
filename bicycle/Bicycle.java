/**
 *
 *
 */
public class Bicycle {
    
    /**model de la bicicleta. */
    private String model;
    /**plat determinat. */
    private int plat;
    /**pinyo determinat. */
    private int pinyo;
    /**número de plats. */
    private final int nPlats;
    /**número de pinyos. */
    private final int nPinyons;
    /**velocitat en km/h. */
    private int v;
    /**velocitat maxima. */
    private final static int VMAX = 100;
    /**increment de la velocitat. */ 
    private final static int DV = 5;
    
    //CONSTRUCTORS
    
    public Bicycle() {
        this.model = "Mountain bike";
        this.plat = 3;
        this.pinyo = 1;
        this.nPlats = 3;
        this.nPinyons = 7;
        this.v = 0;
    }
    
    public Bicycle(int nPlats, int nPinyons, int v) {
        this.model = "Mountain bike";
        this.plat = plat;
        this.pinyo = pinyo;
        this.nPlats = nPlats;
        this.nPinyons = nPinyons;
        this.v = v;
    }
    
    public Bicycle(String model, int plat, int pinyo, int nPlats, int nPinyons, int v) {
        this.model = model;
        this.plat = plat;
        this.pinyo = pinyo;
        this.nPlats = nPlats;
        this.nPinyons = nPinyons;
        this.v = v;
    }
    
    // SETTER AND GETTERS
    
    //model
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    //plat
    
    public int getPlat() {
        return plat;
    }
    
    public void setPlat(int plat) {
        this.plat = plat;
    }
    
    //pinto
    
    public int getPinyo() {
        return pinyo;
    }
    
    public void setPinyo(int pinyo) {
        this.pinyo = pinyo;
    }
    
    //nplats
    
    public int getnPlats() {
        return nPlats;
    }
    
    //npinyons
    
    public int nPinyons() {
        return nPinyons;
    }
    
    //velocitat
    
    
    public double getV() {
        return v;
    }
    
    public void setV(int v) {
        this.v = v;
    }
    
    //METODES ACCELARAR
    
    //accelerar
    public void accelara() {
        
        if (v < 100) {
            int velocitat = this.v;
            velocitat = velocitat + this.DV;
            this.v = velocitat;
        }
    }
    
    //frenar
    public void fenar() {
        
        if (v < 0) {
            int velocitat = this.v;
            velocitat = velocitat - this.DV;
            this.v = velocitat;
        }
    }
    
    //canviPinyo
    public boolean canviPlat(int n) {
        boolean canvi = true;
        
        if (this.v > 0) {
            if (this.plat < this.nPlats && n > 0 && this.v > 0) {
                this.plat++;
            } else if (this.plat > 1 && n < 0 && this.v > 0) {
                this.plat--;
            } else {
                canvi = false;
            }
                   
        } 
         return canvi;  
    }
    
    public boolean canviPinyo(int num) {
        boolean canvi = true;
        
        if (this.v > 0) {
            if (this.pinyo < this.nPinyons && num > 0 && this.v > 0) {
                this.pinyo++;
            } else if (this.pinyo > 1 && num < 0 && this.v > 0) {
                this.pinyo--;
            } else {
                canvi = false;
            }
                      
        }  
        return canvi;
    }  
}
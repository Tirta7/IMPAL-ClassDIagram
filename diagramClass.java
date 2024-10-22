// Interface Transportasi
interface Transportasi {
    String bahanBakar();
    int kecepatan();
}

// Class Setir
class Setir {
    private String tipe;
    
    public Setir(String tipe) {
        this.tipe = tipe;
    }
    
    // Getters and setters
    public String getTipe() {
        return tipe;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}

// Class Roda
class Roda {
    private String jenis;
    
    public Roda(String jenis) {
        this.jenis = jenis;
    }
    
    // Getters and setters
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

// Class Mesin
class Mesin {
    private String tipe;
    
    public Mesin(String tipe) {
        this.tipe = tipe;
    }
    
    // Getters and setters
    public String getTipe() {
        return tipe;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}

// Class Mio
class Mio extends AutoCarRpl {
    public Mio() {
        super("Bensin", 120);
    }
}

// Class Fuel
class Fuel extends AutoCarRpl {
    public Fuel() {
        super("Solar", 100);
    }
}

// Main Class AutoCarRpl
abstract class AutoCarRpl implements Transportasi {
    private String bahanBakar;
    private int kecepatan;
    private Setir setir;
    private List<Roda> roda;
    private Mesin mesin;
    
    public AutoCarRpl(String bahanBakar, int kecepatan) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.setir = new Setir("Standard");
        this.roda = new ArrayList<>();
        // Add 4 wheels as per diagram (4 multiplicity)
        for (int i = 0; i < 4; i++) {
            this.roda.add(new Roda("Standard"));
        }
        this.mesin = new Mesin("Standard");
    }
    
    @Override
    public String bahanBakar() {
        return this.bahanBakar;
    }
    
    @Override
    public int kecepatan() {
        return this.kecepatan;
    }
    
    // Methods from class diagram
    public void start() {
        System.out.println("Starting the car...");
    }
    
    public void drive() {
        System.out.println("Driving the car...");
    }
    
    // Getters and setters
    public Setir getSetir() {
        return setir;
    }
    
    public List<Roda> getRoda() {
        return roda;
    }
    
    public Mesin getMesin() {
        return mesin;
    }
}

package ds.bloomfilterimpl;

public class Main {
    
    public static void main(String[] args) {
        
        // 0.3 = 30% false positive probability wanted, 10 elements expected
        BloomFilter bf = new BloomFilter(0.3, 10); 
       
        bf.add("Octavia");
        bf.add("Anghel");
        bf.add("Jonnhy");
        bf.add("Marua");
        bf.add("Maria");
        bf.add("Mary");
        bf.add("Qunto");
        bf.add("Alexander");
        bf.add("Alin");
        bf.add("Myrriad");
        
      
        System.out.println("False positive probability between 0 and 1: " 
                + bf.getFalsePositiveProbability());
        System.out.println("False positive probability in percent: " 
                + bf.getFalsePositiveProbabilityAsPercent());
        System.out.println("Number of hash functions: " 
                + bf.getNumberOfHashFunctions());
        
    }        
}
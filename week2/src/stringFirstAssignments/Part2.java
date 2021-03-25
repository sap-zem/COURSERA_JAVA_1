package stringFirstAssignments;

public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        int startIndex, stopIndex;
        startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        } else {
            stopIndex = dna.indexOf(stopCodon, startIndex + 3);
            if (stopIndex == -1) {
                return "";
            } else {
                if ((stopIndex - startIndex) % 3 == 0) {
                    return dna.substring(startIndex, stopIndex + 3);
                }
            }
        }
        return "";
    }
    public void testFindSimpleGene() {
        String startCodon = "ATG";
        String stopCodon = "TAA";
        // DNA with no ATG
        String dna = "ATCTAACATC";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
        // DNA with no TAA
        dna = "ATTATCATGTTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
        // DNA with no “ATG” and “TAA”
        dna = "ATTAGTGTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
        // DNA with ATG, TAA and the substring between them is not a multiple of 3
        dna = "GAAATGGATAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
        // DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene)
        dna = "TAAGATATGGTGAAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna, startCodon, stopCodon));
    }
}

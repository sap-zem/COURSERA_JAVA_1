package stringFirstAssignments;

public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex, stopIndex;
        startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        } else {
            stopIndex = dna.indexOf("TAA", startIndex + 3);
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
        // DNA with no ATG
        String dna = "ATCTAACATC";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
        // DNA with no TAA
        dna = "ATTATCATGTTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
        // DNA with no “ATG” and “TAA”
        dna = "ATTAGTGTA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
        // DNA with ATG, TAA and the substring between them is not a multiple of 3
        dna = "GAAATGGATAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
        // DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene)
        dna = "TAAGATATGGTGAAGTAA";
        System.out.println("DNA strand is " + dna);
        System.out.println("Gene is " + findSimpleGene(dna));
    }
}

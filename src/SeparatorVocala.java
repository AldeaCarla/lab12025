public class SeparatorVocala {
    public static void main(String[] args) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String vocale = "aeiou";
        java.util.List<String> listaRezultate = new java.util.ArrayList<>();
        int indexInceput = 0;
        while (indexInceput < alfabet.length()) {
            int indexVocala = -1;
            for (int i = indexInceput; i < alfabet.length(); i++) {
                if (vocale.indexOf(alfabet.charAt(i)) != -1) {
                    indexVocala = i;
                    break;
                }
            }
            if (indexVocala == -1) {
                break;
            }
            int indexUrmatoareiVocale = -1;
            for (int i = indexVocala + 1; i < alfabet.length(); i++) {
                if (vocale.indexOf(alfabet.charAt(i)) != -1) {
                    indexUrmatoareiVocale = i;
                    break;
                }
            }
            String subSir;
            if (indexUrmatoareiVocale != -1) {
                subSir = alfabet.substring(indexVocala, indexUrmatoareiVocale);
                indexInceput = indexUrmatoareiVocale; // Actualizăm indexInceput
            } else {
                subSir = alfabet.substring(indexVocala);
                indexInceput = alfabet.length(); // Evităm bucla infinită
            }
            listaRezultate.add(subSir);
        }
        String[] arrayRezultate = listaRezultate.toArray(new String[0]);
        for (int i = 0; i < arrayRezultate.length; i++) {
            System.out.println("array[" + i + "] = \"" + arrayRezultate[i] + "\"");
        }
    }
}

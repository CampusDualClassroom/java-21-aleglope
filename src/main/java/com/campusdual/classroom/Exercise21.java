package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * La clase {@code Exercise21} proporciona métodos para crear, poblar y manipular
 * colecciones de tipo {@code Set} utilizando {@code HashSet} y {@code TreeSet}.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar conjuntos de tipo {@code HashSet} y {@code TreeSet} con elementos de tipo {@code String}.</li>
 *     <li>Añadir un nuevo elemento a cada conjunto.</li>
 *     <li>Recorrer y mostrar los elementos de cada conjunto.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise21 {

    /**
     * Crea y retorna un conjunto de tipo {@code HashSet} poblado con los elementos especificados.
     * <p>
     * Los elementos añadidos son:
     * <ul>
     *     <li>"ELEMENT KPRBC"</li>
     *     <li>"ELEMENT YPBTM"</li>
     *     <li>"ELEMENT AADXU"</li>
     *     <li>"ELEMENT RXCGJ"</li>
     *     <li>"ELEMENT WYMVD"</li>
     *     <li>"ELEMENT WFGEJ"</li>
     *     <li>"ELEMENT TYGBS"</li>
     *     <li>"ELEMENT MAPTK"</li>
     *     <li>"ELEMENT GJXVE"</li>
     *     <li>"ELEMENT BAFGL"</li>
     * </ul>
     * </p>
     *
     * @return Un conjunto {@code HashSet} poblado con los elementos especificados.
     */
    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("ELEMENT KPRBC");
        hashSet.add("ELEMENT YPBTM");
        hashSet.add("ELEMENT AADXU");
        hashSet.add("ELEMENT RXCGJ");
        hashSet.add("ELEMENT WYMVD");
        hashSet.add("ELEMENT WFGEJ");
        hashSet.add("ELEMENT TYGBS");
        hashSet.add("ELEMENT MAPTK");
        hashSet.add("ELEMENT GJXVE");
        hashSet.add("ELEMENT BAFGL");
        return hashSet;
    }

    /**
     * Crea y retorna un conjunto de tipo {@code TreeSet} poblado con los mismos elementos que el {@code HashSet}.
     * <p>
     * Los elementos añadidos son:
     * <ul>
     *     <li>"ELEMENT KPRBC"</li>
     *     <li>"ELEMENT YPBTM"</li>
     *     <li>"ELEMENT AADXU"</li>
     *     <li>"ELEMENT RXCGJ"</li>
     *     <li>"ELEMENT WYMVD"</li>
     *     <li>"ELEMENT WFGEJ"</li>
     *     <li>"ELEMENT TYGBS"</li>
     *     <li>"ELEMENT MAPTK"</li>
     *     <li>"ELEMENT GJXVE"</li>
     *     <li>"ELEMENT BAFGL"</li>
     * </ul>
     * </p>
     *
     * @return Un conjunto {@code TreeSet} poblado con los mismos elementos que el {@code HashSet}.
     */
    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ELEMENT KPRBC");
        treeSet.add("ELEMENT YPBTM");
        treeSet.add("ELEMENT AADXU");
        treeSet.add("ELEMENT RXCGJ");
        treeSet.add("ELEMENT WYMVD");
        treeSet.add("ELEMENT WFGEJ");
        treeSet.add("ELEMENT TYGBS");
        treeSet.add("ELEMENT MAPTK");
        treeSet.add("ELEMENT GJXVE");
        treeSet.add("ELEMENT BAFGL");
        return treeSet;
    }

    /**
     * Añade un nuevo elemento a un conjunto específico.
     * <p>
     * Este método intenta añadir el elemento proporcionado al conjunto y retorna el resultado de la operación.
     * </p>
     *
     * @param set          El conjunto al que se desea añadir el elemento.
     * @param elementToAdd El elemento que se desea añadir al conjunto.
     * @return {@code true} si el conjunto no contenía el elemento y se añadió exitosamente; {@code false} si el conjunto ya lo contenía.
     */
    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    /**
     * Recorre y muestra todos los elementos de un conjunto específico.
     * <p>
     * Este método imprime cada elemento del conjunto en una línea separada.
     * </p>
     *
     * @param customSet El conjunto cuyos elementos se desean mostrar.
     */
    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación, manipulación y visualización
     * de conjuntos de tipo {@code HashSet} y {@code TreeSet}.
     * <p>
     * El flujo del programa es el siguiente:
     * <ol>
     *     <li>Crear y poblar un {@code HashSet} con los elementos especificados.</li>
     *     <li>Crear y poblar un {@code TreeSet} con los mismos elementos.</li>
     *     <li>Añadir el elemento "ELEMENT AAA" a cada conjunto.</li>
     *     <li>Recorrer y mostrar los elementos de cada conjunto.</li>
     * </ol>
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar el HashSet
        Set<String> hashSet = createHashSet();
        System.out.println("HashSet original:");
        printSet(hashSet);
        System.out.println("===================");

        // Crear y poblar el TreeSet
        Set<String> treeSet = createTreeSet();
        System.out.println("TreeSet original:");
        printSet(treeSet);
        System.out.println("===================");

        // Añadir "ELEMENT AAA" a HashSet
        boolean addedToHashSet = addElementToSet(hashSet, "ELEMENT AAA");
        System.out.println("Añadiendo 'ELEMENT AAA' a HashSet: " + (addedToHashSet ? "Éxito" : "Falló"));

        // Añadir "ELEMENT AAA" a TreeSet
        boolean addedToTreeSet = addElementToSet(treeSet, "ELEMENT AAA");
        System.out.println("Añadiendo 'ELEMENT AAA' a TreeSet: " + (addedToTreeSet ? "Éxito" : "Falló"));
        System.out.println("===================");

        // Mostrar los conjuntos después de añadir el nuevo elemento
        System.out.println("HashSet después de añadir 'ELEMENT AAA':");
        printSet(hashSet);
        System.out.println("===================");

        System.out.println("TreeSet después de añadir 'ELEMENT AAA':");
        printSet(treeSet);
    }
}

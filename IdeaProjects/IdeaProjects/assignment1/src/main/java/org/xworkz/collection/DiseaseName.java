package org.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DiseaseName {

    public static void main(String[] args) {
        Collection<String> diseases = new ArrayList<>();
        Collection<String> commonDiseases = new ArrayList<>();
        diseases.add("Diabetes");
        diseases.add("Hypertension");
        diseases.add("Asthma");
        diseases.add("Cancer");
        commonDiseases.add("Common Cold");
        commonDiseases.add("Flu");
        commonDiseases.add("Chickenpox");
        commonDiseases.add("Measles");
// Adding all diseases from commonDiseases to diseases
        diseases.addAll(commonDiseases);
// Removing a specific disease
        diseases.remove("Diabetes");
// Removing all common diseases
        diseases.removeAll(commonDiseases);
// Check if a specific disease is present
        System.out.println("Contains 'Asthma': " + diseases.contains("Asthma"));
// Displaying the remaining diseases
        System.out.println("The diseases are: " + diseases);
// Displaying the size of the collection
        System.out.println("The size is: " + diseases.size());
// Retaining common diseases only
        System.out.println("Retains common diseases: " + diseases.retainAll(commonDiseases));
// Checking if all common diseases are present
        System.out.println("Contains all common diseases: " + diseases.containsAll(commonDiseases));
// Clearing the commonDiseases collection
        commonDiseases.clear();
        System.out.println("Common diseases collection after clearing: " + commonDiseases);
// Working with lists
        List<String> rareDiseases = new ArrayList<>();
        List<String> allDiseases = new ArrayList<>();
        rareDiseases.add(0, "Hemophilia");
        rareDiseases.add(1, "Cystic Fibrosis");
        allDiseases.add("Sickle Cell Anemia");
        allDiseases.addAll(0, rareDiseases);
// Displaying the list of all diseases
        System.out.println("All diseases list: " + allDiseases);
    }
}

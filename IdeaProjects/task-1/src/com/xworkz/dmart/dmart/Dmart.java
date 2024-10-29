package com.xworkz.dmart.dmart;

import com.xworkz.dmart.chocolates.Chocolates;

public interface Dmart {
    public boolean addChocolates(Chocolates chocolates);
    public void getAllCocolates();
    public boolean UpdateChocolatNameById(String newName, int existingid);
    public boolean deleteChocolateName();
}

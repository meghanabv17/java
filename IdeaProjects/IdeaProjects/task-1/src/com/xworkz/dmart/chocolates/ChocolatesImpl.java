package com.xworkz.dmart.chocolates;

import com.xworkz.dmart.dmart.Dmart;

public class ChocolatesImpl implements Dmart {

Chocolates chocolate[] = new Chocolates[1];
int index;

boolean isAdded = false;
    @Override
    public boolean addChocolates(Chocolates chocolates) {
        if(chocolates != null){
            if(chocolates.name != null && chocolates.price > 0.0){
                this.chocolate[index++] = chocolates;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getAllCocolates() {
        for(Chocolates Chocolate : chocolate){
            System.out.println("The details of chocolates are: "+Chocolate);
        }
    }

    @Override
    public boolean UpdateChocolatNameById(String newName, int existingid) {
        boolean isUpdated = false;
        for (int index = 0; index < chocolate.length; index++) {
            if(this.chocolate[index++].equals(existingid)){
                this.chocolate[index].name = newName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }
    @Override
    public boolean deleteChocolateName() {
        boolean isDeleted = false;
        if(this.chocolate == null){
            this.chocolate = chocolate;
        }
        return false;
    }
}

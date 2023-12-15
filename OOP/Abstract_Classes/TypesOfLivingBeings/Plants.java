package OOP.Abstract_Classes.TypesOfLivingBeings;

import OOP.Abstract_Classes.Abstract.LivingBeing;

public class Plants extends LivingBeing{
    
    @Override
    public void eat(){
        System.out.println("They do photosynthesis");
    }
}

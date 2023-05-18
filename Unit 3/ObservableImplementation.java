// There are deprecated classes these are not running on new version of java the logic is correct but the proram won't execute!!!!!!!!!!

import java.util.*;

// Observable allows others classes to observe this class's objects
// The theory is:
// We have a class 'Observable' and an interface 'Observer' which makes classes observable

// Using this allows other classes to know what the observing class is doing and take necessary measures 

// creating an observable class
class Child extends Observable
{
    void counter(int period)
    {
        for(int i = period; i >= 0; i --)
        {
            setChanged();
            notifyObservers(new Integer(i));
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted!!!");
            }
        }
    }
}

class Parent implements Observer
{
    public void update(Observable obj)
    {
        System.out.println("Observation successful");
    }
}
public class ObservableImplementation {

    public static void main(String[] args) {
        
        Child obj = new Child();
    
        Parent obj2 = new Parent();
    
        obj.addObserver(obj2);
    
        obj.counter(10);
    }

}

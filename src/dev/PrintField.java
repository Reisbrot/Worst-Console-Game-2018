package dev;

import java.lang.reflect.Method;


public class PrintField {
    public static void printArray(Object[] a){
        boolean hasMethod = false;
        try{
        Method m = a.getClass().getDeclaredMethod("getName", null); 
        hasMethod = true; }
        catch (NoSuchMethodException e){
            System.err.println("Noone loves you.");
        }
        catch (SecurityException e){ 
        // you don't have access to the method from your package
        }
        if(hasMethod)
                for(int i = 0; i < a.length; i++){
            System.out.println(i + ": " + a[i].getNamef());
        }
        else
        for(int i = 0; i < a.length; i++){
            System.out.println(i + ": " + a[i]);
        }
    }
}

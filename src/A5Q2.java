/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class A5Q2 {

    // Resizable array
    private int[] array;
    
    // Number of items in the array
    private int numItems;
    
    // Constructor
    public A5Q2(){
        array = new int[10];
        numItems = 0;
    }
    
    // Add method
    public void add(int index, int num){
        
        // If the array size needs to increase
        if(numItems  >= array.length){
            
            // Increasing the number of items
            numItems++;
            
            // New array with double the size
            int[] temp = new int[array.length * 2];
            
            // For loop - adding all the values
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            // Making the original array equal to the new resizable one
            array = temp;
        }
        
        // Moving the numbers down
        for (int i = array.length - 2; i > index; i--) {
            // Assigning the next value to the prevoius index (the one being removed)
            array[i] = array[i - 1];
        }
        
        // Adding the number
        array[index] = num;
        
        // Increasing the number of items
        numItems++;
    }
    
    // Method that removes an item from the array
    public void remove(int index){
        
        // Find if the position exists
        if(index <= numItems){
            
            // Move the numbers down
            for (int i = index; i <= numItems; i++) {
                array[i] = array[i+1];
            }
            
            // Decreasing the number of items
            numItems--;
        }
    }
        
    // Getting the size of the array
    public int size(){
        return numItems; 
    }
    
    // Method that gets a value given the index
    public int get(int index){
        return array[index];
    }
    
    // Method that checks if the array is empty
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating an object to run methods
        A5Q2 list = new A5Q2();
        
        // Adding items to the list
        list.add(0, 0);
        list.add(1, 2);
        list.add(2, 4);
        list.add(3, 6);
        list.add(4, 8);
        list.add(5, 10);
        
        // Printing the items
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        
        // Removing items from the list
        list.remove(0);
        list.remove(5);
        
        // Going to a new line
        System.out.println();
        
        // Printing the items
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        
    }
}
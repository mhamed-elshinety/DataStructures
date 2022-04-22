package com.mycompany.datastructures;

public class Array {
    
    public int size;
    public int length=0;
    public int[] arr;
    
    public Array(int size){
        this.size=size;
        arr =  new int[size];
    }
    
    public int getSize(){
        return size;
    }
    
    
    public int[] getArray(){
        return arr;
    }
    
    public void add(int value){
        if(length==size){
            System.err.println("Array is full");
              return;
        }
        arr[length] = value;
        length++;
    }
    
    //Big O(N)
    public boolean insert(int value, int index){
        if(index>=size)
            return false;
        else if(size==length){
            for(int i=size-1;i>index;i--){
                arr[i] = arr[i-1];
            }
            arr[index] = value;         
            return true;
                    
        }else if(size>length){
            for(int i=length;i>index;i--){
                arr[i] = arr[i-1];
            }
            arr[index] = value;
            length++;
            return true;
        }else
            return false;
    }
        
    //Big O(N)
    public int delete(int index){
        if(index>=length)
            return -1;
        for(int i=index; i<arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[length-1] = 0;
        length--;
        return index;
    }
       
    //Big O(N)
    public int linearSearch(int value){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==value)
                return i;
        }
        return -1;
    }
    
    
    public int binarySearch(int value){
        int start = 0;
        int end = length;
        int mid = 0;
        while(true){
            mid = (start + end) /2;
            if(arr[mid]==value)
               return mid;
            else if(start>end)
                return -1;
            else if(value>arr[mid])
                start = mid+1;
            else if(value<arr[mid])
                end = mid-1;
        }
        
    }
    
}

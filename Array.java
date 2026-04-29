class Array{
    int [] arr;
    int size;
    int capacity;

    Array(int capacity){
        arr = new int [capacity];
        this.capacity=capacity;
        size=0;
    }

    boolean insert (int index,int element){
        if(index < 0 || size >= capacity || index > size){
            System.out.println("insert :Invalid number");
            return false;
        }

    for(int i=size ; i>index ; i--){
        arr[i] = arr[i-1];
    }
        arr[index]=element;
        size++;
        return true;
    }
    
    int get(int index){
        if(index < 0 || index >= size){
            System.out.println(" get: Invalid index");
            return -9999;
        }
        return arr[index];
    }

    void set(int index ,int element){
        if(index < 0 || index >= size){
            System.out.println("set:Invalid index");
        }
        arr[index] = element;
    }

    void display(){
        for(int i=0 ; i < size ; i++){
            System.out.println(arr[i]+ " ");
        } 
    }

    int search (int element){
        for(int i=0;i<=size;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    boolean delete (int index){
        if(index < 0 || index >=size){
            System.out.println("can't delete:Invalid number");
            return false;
        }
        for(int i=index;i<size-1;i++){
            arr[i]= arr[i+1];
        }
        size--;
        return false;
    }

    public static void main(String args[]){
        Array arr1 = new Array(6);


        arr1.insert(0,5);
        arr1.insert(1,9);
        arr1.insert(2,7);
        arr1.insert(3,77);
        arr1.insert(4,8);


        System.out.println("get num:"+arr1.get(3));
        arr1.set(1,99);

        System.out.println("search number:"+arr1.search(8));

        arr1.delete(0);

        arr1.display();
    }
}
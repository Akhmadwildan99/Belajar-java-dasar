package CodeInterview;

public class Set {

    Integer size = 0;
    String[]  array = new String[10];

    public static void main(String[] args) {
        Set set = new Set();
        set.testCapacityArray();
    }


    // add method;

    public  boolean add(String value){
        if (contains(value)){
            return false;
        } else {
            capacityArray();
            array[size] = value;
            size++;
            return  true;
        }

    }

    public  void testAdd(){
        add("wildan");
        add("akhmad");
        add("iska");
        add("iska");

        for(var item : array){
            if (item != null){
                System.out.println(item);
            }
        }

        System.out.println(size);

    }

    // remove method;

    public boolean remove(String value){
        Integer index = 0;
        for (var i = 0; i < array.length; i++){
            if (value.equals(array[i])){
                index = i;
            }
        }

        if (contains(value)){
            for (var i = index; i < size; i++){
                array[i] = array[i + 1];
            }
            size--;
            return true;
        } else {
            return  false;
        }
    }

    public void testRemoved(){
        add("akhmad");
        add("iska");
        add("Rahmawati");
        add("wildan");
        add("nanu");

        remove("iska");
        remove("Rahmawati");
        remove("nanu");

        for (var i : array){
            if (i != null) {
                System.out.println(i);
            }
        }

        System.out.println(size);
    }

    public int size(){
       return size;
    }

    // cek value yang sama;

    public boolean contains(String value){
        for (var item : array){
            if (value.equals(item)){
                return true;
            }
        }
        return false;
    }

    // resize array jika size sama atau lebih dari panjang array
    public void capacityArray(){
        if (size >= array.length){
            String[] temp = new String[array.length * 2];
            for (var i = 0; i < array.length; i++){
                temp[i] = array[i];
            }

            array = temp;
        }
    }

    public void testCapacityArray(){
        add("iska");
        add("wildan");
        for (var i = 0; i < 20; i++){
            add("add ke " + i);
        }

        remove("wildan");

        for (var item : array){
            if (item != null){
                System.out.println(item);
            }
        }

        System.out.println(size);

    }
}

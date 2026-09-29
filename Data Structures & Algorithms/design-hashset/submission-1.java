// class MyHashSet {
//     private List<Integer> data;

//     public MyHashSet() {
//         data = new ArrayList<>();
//     }
    
//     public void add(int key) {
//         if(!data.contains(key)) {
//             data.add(key);
//         }
//     }
    
//     public void remove(int key) {
//         data.remove(Integer.valueOf(key));
//     }
    
//     public boolean contains(int key) {
//         return data.contains(key);
//     }
// }

public class MyHashSet {
    private boolean[] data;

    public MyHashSet() {
        data = new boolean[1000001];
    }

    public void add(int key) {
        data[key] = true;
    }

    public void remove(int key) {
        data[key] = false;
    }

    public boolean contains(int key) {
        return data[key];
    }
}
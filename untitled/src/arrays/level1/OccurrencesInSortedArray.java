package arrays.level1;

public class OccurrencesInSortedArray {
    public static int findOccurrence(int a[], int key){
        int count =0;
        for (int j : a) {
            if (key == j) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 15, 20, 23,20,20, 90, 67};
        System.out.println(findOccurrence(a,20));
    }
}

package LinearSearch;

public class FindIndex {
	public static void main(String[] args) {

        int[] nums = {2, 3, 6, 7, 8, 98, 56, 34, 56};
        int target = 8;

        int ans = linearsearch(nums, target);

        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

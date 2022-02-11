 public static int solve(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int lval = (mid - 1 >= 0) ? arr[mid - 1] : Integer.MIN_VALUE;
            int rval = (mid + 1 < arr.length) ? arr[mid + 1] : Integer.MAX_VALUE;

            if (target == arr[mid])
                return mid;
            if (target == lval)
                return mid - 1;
            if (target == rval)
                return mid + 1;

            if (target < arr[mid])
                high = mid - 2;
            else
                low = mid + 2;
        }

        return -1;

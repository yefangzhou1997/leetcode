public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + n; j++) {
                if (j + 1 < m + n) {
                    if (nums2[i] >= nums1[j] && nums2[i] < nums1[j + 1]) {
                        for (int k = m + n - 2; k > j; k--) {
                            nums1[k + 1] = nums1[k];
                        }
                        nums1[j + 1] = nums2[i];
                        j = j + 1;
                        break;
                    } else if (nums2[i] < nums1[j]) {
                        for (int k = m + n - 2; k >= j; k--) {
                            nums1[k + 1] = nums1[k];
                        }
                        nums1[j] = nums2[i];
                        j = j + 1;
                        break;
                    } else if (nums1[j] == 0 && j >= i + m) {
                        nums1[j] = nums2[i];
                        break;
                    }
                } else {
                    nums1[j] = nums2[i];
                }
            }//nums1 j m
        }//nums2 i n
    }

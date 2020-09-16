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

public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int k = m + n - 1, i = m - 1, j = n - 1; k >= 0; k--) {
            if (i >= 0 && j >= 0) {
                if (nums1[i] >= nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            } else if (i >= 0 && j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
    }

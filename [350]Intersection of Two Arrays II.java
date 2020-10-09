public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    a.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }

        int[] r = new int[a.size()];
        for (int i = 0; i < r.length; i++) r[i] = a.get(i).intValue();
        return r;

    }
    
public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] a = new int[Math.min(nums1.length, nums2.length)];
        int k = 0, i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                a[k++] = nums1[i++];
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(a, k);
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0], end = intervals[i][1];

            while (i < intervals.length - 1 && intervals[i + 1][0] <= end) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }
            res.add(new int[]{start, end});
        }

        return res.toArray(new int[0][0]);

    }

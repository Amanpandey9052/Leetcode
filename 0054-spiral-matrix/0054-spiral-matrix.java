class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1. Top row: left -> right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // 2. Right column: top -> bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // 3. Bottom row: right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4. Left column: bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}